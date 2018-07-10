<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String path=request.getContextPath(); %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>头部-有点</title>
<link rel="stylesheet" type="text/css" href="<%=path%>/jsp/css/css.css" />
</head>

<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="<%=path%>/jsp/img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#"></a>&nbsp;-</span>&nbsp;
			</div>
		</div>
		<div class="page">
			<div class="connoisseur">
				<div class="conform">
					<form method="post" action="stu_add" id="edit" >
						<input name="id" value="${studata.id}" type="hidden" />
						<div class="cfD">
							<input name="stunum" class="userinput" type="text" value="${studata.stunum}" placeholder="学号"/>
							<input name="stuname" class="userinput" type="text" value="${studata.stuname}" placeholder="姓名"/></br></br>
							<input name="stupwd" class="userinput" type="text" value="${studata.stupwd}" placeholder="密码"/>
							<input name="phone" class="userinput" type="text" value="${studata.phone}" placeholder="电话"/>
							<input name="classid" id="classid"  value="${classid}" type="hidden"/>
							<input class="userbtn chage" type="submit" value="添加" />
						</div>
					</form>
				</div>
				<!-- opinion 页面样式 -->
				<div class="opinion">
					<!-- opinion 表格 显示 -->
					<div class="opShow">
						<table border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="66px" class="tdColor tdC">学号</td>
								<td width="200px" class="tdColor">姓名</td>
								<td width="200px" class="tdColor">登入密码</td>
								<td width="200px" class="tdColor">电话</td>
								<td width="200px" class="tdColor">班级</td>
								<td width="200px" class="tdColor">请假</td>
								<td width="200px" class="tdColor">旷到</td>
								<td width="200px">操作</td>

							</tr>
							<c:forEach items="${stu_list }" var="list">
								<tr height="40px">
									<td><c:out value="${list.stunum }" /></td>
									<td><c:out value="${list.stuname }" /></td>
									<td><c:out value="${list.stupwd }" /></td>
									<td><c:out value="${list.phone }" /></td>
									<td><c:out value="${list.classid }" /></td>
									<td><c:out value="${list.level }" /></td>
									<td><c:out value="${list.attendance }" /></td>
									<td><a href='stu_edit?id=<c:out value="${list.id }"/>' />
										<img class="operation" src="<%=path%>jsp/img/update.png">
										</a> <a href='stu_del?id=<c:out value="${list.id }"/>'> <img
											class="operation delban" src="<%=path%>jsp/img/delete.png">
									</a></td>
								</tr>
							</c:forEach>
						</table>
						<div class="paging">此处是分页</div>
					</div>
					<!-- opinion 表格 显示 end-->
				</div>
				<!-- 页面样式end -->
			</div>
		</div>
</body>
<script type="text/javascript" src="<%=path%>jsp/js/jquery.min.js"></script>
<script type="text/javascript">
var data = 0;
data = ${studata.id}
$(".chage").bind("click", function() {
	if (data > 0) {
		$("#edit").attr("action", "stu_update");
		$("#classid").val(${studata.classid});
		//触发submit事件，提交表单   
		$("#edit").submit();
	}

})
</script>
</html>