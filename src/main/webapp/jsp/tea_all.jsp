<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员管理-有点</title>
<link rel="stylesheet" type="text/css" href="<%=path%>jsp/css/css.css">
<script type="text/javascript" src="<%=path%>jsp/js/jquery.min.js"></script>
<!-- <script type="text/javascript" src="js/page.js" ></script> -->
</head>

<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="<%=path%>jsp/img/coin02.png"><span><a
					href="#">首页</a>&nbsp;-&nbsp;-</span>&nbsp;管理员管理
			</div>
		</div>

		<div class="page">
			<!-- user页面样式 -->
			<div class="connoisseur">
				<div class="conform">
					<form method="post" action="tea_add" id="edit">
						<input name="id" value="${edit_data.id}" type="hidden" />
						<div class="cfD">
							<input name="teanum" class="userinput" type="text"
								value="${edit_data.teanum }" placeholder="教师工号">
							<input name="teapwd" class="userinput vpr"
								value="${edit_data.teapwd }" type="text"
								placeholder="登入密码"></br></br>
								<input name="phone" class="userinput vpr"
								value="${edit_data.phone }" type="text"
								placeholder="教师电话">
								<input name="teaname" class="userinput vpr"
								value="${edit_data.phone }" type="text"
								placeholder="教师姓名">
								 <input class="userbtn chage"
								type="submit" value="添加" />
						</div>
					</form>
				</div>
				<!-- user 表格 显示 -->
				<div class="conShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tbody>
							<tr>
								<td width="66px" class="tdColor tdC">序号</td>
								<td width="435px" class="tdColor">教师工号</td>
								<td width="435px" class="tdColor">教师姓名</td>
								<td width="400px" class="tdColor">教师密码</td>
								<td width="400px" class="tdColor">教师电话</td>
								<td width="130px" class="tdColor">操作</td>
							</tr>
							<c:forEach items="${tea_list }" var="list">
								<tr height="40px">
									<td><c:out value="${list.id }" /></td>
									<td><c:out value="${list.teanum }" /></td>
									<td><c:out value="${list.teaname }" /></td>
									<td><c:out value="${list.teapwd }" /></td>
									<td><c:out value="${list.phone }" /></td>
									<td>
										<a href="tea_edit?id=<c:out value="${list.id }"/>">
											<img class="operation" src="<%=path%>jsp/img/update.png">
										</a> 
										<a href="tea_del?id=<c:out value="${list.id }"/>">
											<img class="operation delban" src="<%=path%>jsp/img/delete.png">
										</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div class="paging">此处是分页</div>
				</div>
				<!-- user 表格 显示 end-->
			</div>
			<!-- user页面样式end -->
		</div>
		<a onclick="conf()">ok</a>
	</div>


	<!-- 删除弹出框 -->
	<div class="banDel">
		<div class="delete">
			<div class="close">
				<a><img src="<%=path%>jsp/img/shanchu.png"></a>
			</div>
			<p class="delP1">你确定要删除此条记录吗？</p>
			<p class="delP2">
				<a href="#" class="ok yes">确定</a><a class="ok no">取消</a>
			</p>
		</div>
	</div>
	<!-- 删除弹出框  end-->


	<script type="text/javascript">
		// 广告弹出框
		function conf() {

			/* 	
					$(".banDel").show();
				
				$(".close").click(function() {
					$(".banDel").hide();
					return true;
				});
				$(".no").click(function() {
					$(".banDel").hide();
					return false;
				}); */
			return false;
		}

		// 广告弹出框 end

		var data = 0;
		data = ${edit_data.id}
		$(".chage").bind("click", function() {
			if (data > 0) {
				$("#edit").attr("action", "tea_update");
				//触发submit事件，提交表单   
				$("#edit").submit();
			}

		})
	</script>
</body>
</html>