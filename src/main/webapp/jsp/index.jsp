<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台管理中心</title>
</head>
<frameset rows="100,*" cols="*" scrolling="No" framespacing="0"
	frameborder="no" border="0">
	<frame src="jsp/inc/head.html" name="headmenu" id="mainFrame"
		title="mainFrame">
	<!-- 引用头部 -->
	<!-- 引用左边和主体部分 -->
	<frameset rows="100*" cols="220,*" scrolling="No" framespacing="0"
		frameborder="no" border="0">
		<frame src="jsp/inc/left.html" name="leftmenu" id="mainFrame"
			title="mainFrame">
		<frame src="jsp/inc/main.html" name="main" scrolling="yes" noresize="noresize"
			id="rightFrame" title="rightFrame">
	</frameset>
</frameset>
</html>