<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员管理-有点</title>
<link rel="stylesheet" type="text/css" href="<%=path%>/jsp/css/css.css">
<script type="text/javascript" src="<%=path%>/jsp/js/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function teaall(){
		$.get("app_tea_all",function(data,status){
			for(var o in data){  
				$("#teaid").append('<option value='+data[o].id+' >'+data[o].teaname+'</option>');
			}
		});
		
	});

</script>
<!-- <script type="text/javascript" src="js/page.js" ></script> -->
</head>

<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="<%=path%>jsp/img/coin02.png"><span><a
					href="#">首页</a>&nbsp;-&nbsp;-</span>课表
			</div>
		</div>

		<div class="page">
			<!-- user页面样式 -->
			<div class="connoisseur">
				<div class="conform">
					<form action="course_add" method="post">
						<input name="classid" type="hidden" value="${classid.id }"/>
						<input name="classname" type="hidden" value="${classid.classname }"/>
						<div class="cfD">
							<select name="teaid" id="teaid">
								<option selected="selected">无</option>
							</select>
							
							<select name="cday">
								<option>请选择周几</option>
								<option value="1" >星期一</option>
								<option value="2" >星期二</option>
								<option value="3" >星期三</option>
								<option value="4" >星期四</option>
								<option value="5" >星期五</option>
							</select>
							
							<select name="corder">
								<option>请选择上课的节数</option>
								<option value="1">1，2</option>
								<option value="2" >3，4</option>
								<option value="3" >5，6</option>
								<option value="4" >7，8</option>
							</select></br></br>
							
							<input name="coursename" type="text" placeholder="课程名称">
							<input name="addr" type="text" placeholder="上课地址">
							<button>添加</button>
						</div>
					</form>
				</div>
				<!-- user 表格 显示 -->
				<div class="conShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tbody>
							<tr>
								<td width="120" class="tdColor tdC">序号</td>
								<td width="120" class="tdColor">周一</td>
								<td width="120" class="tdColor">周二</td>
								<td width="120" class="tdColor">周三</td>
								<td width="120" class="tdColor">周四</td>
								<td width="120" class="tdColor">周五</td>

							</tr>
							<tr height="60px">
								<td>1，2</td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==1 && list.cday==1}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==1 && list.cday==2}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==1 && list.cday==3}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==1 && list.cday==4}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a></br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==1 && list.cday==5}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
							</tr>

							<tr height="60px">
								<td>3，4</td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==2 && list.cday==1}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==2 && list.cday==2}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==2 && list.cday==3}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==2 && list.cday==4}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==2 && list.cday==5}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
							</tr>

							<tr height="60px">
								<td>5,6</td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==3 && list.cday==1}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==3 && list.cday==2}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==3 && list.cday==3}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==3 && list.cday==4}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==3 && list.cday==5}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
							</tr>

							<tr height="60px">
								<td>7，8</td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==4 && list.cday==1}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==4 && list.cday==2}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==4 && list.cday==3}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==4 && list.cday==4}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
								<td><c:forEach items="${course}" var="list">
										<c:if test="${list.corder==4 && list.cday==5}">
											<c:out value="${list.addr }" /><a href="course_del?classid=${classid.id }&corder=<c:out value='${ list.corder}'/>&cday=<c:out value='${ list.cday}'/>">删除</a>
											</br>
											<c:out value="${list.coursename }" />
										</c:if>
									</c:forEach></td>
							</tr>
						</tbody>
					</table>
					<div class="paging">此处是分页</div>
				</div>
				<!-- user 表格 显示 end-->
			</div>
			<!-- user页面样式end -->
		</div>

	</div>
</body>
</html>
