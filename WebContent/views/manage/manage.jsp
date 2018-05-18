<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='http://cdn.webfont.youziku.com/webfonts/nomal/117439/19425/5ae3159cf629dd0700cec32b.css' rel='stylesheet' type='text/css' />
<link rel="stylesheet" type="text/css" href="views/manage/css/main.css"/>

<%
if(session.getAttribute("Name")==null){
	out.print("<script>alert(\"对不起，您还没登陆或身份失效，请尝试重新登陆！\");window.location.href=\"/H\";</script>");
}
session.setMaxInactiveInterval(60*5);
%>

<title>界面 - 青木管理系统</title>
</head>
<body>

<div class="logo-top" style="position: fixed; top: 0px;">

<a style="right: 150px">
<b><%out.print(session.getAttribute("Name"));%>&nbsp;|</b>
</a>
<a href="#">注销</a>	
<a id="cancellation" href="javascript:;">
注销
</a></div>
<div class="logo-main">
<span>Tommy</span><br>
</div>
<div id="main">
<div id="main-g">
<div class="log">
	<div class="log-left">
		<iframe src="views/manage/frame/choice.html" height="98%" width="98%" frameborder="0" scrolling="no"></iframe>
	</div>
	<div class="log-right">
		<iframe src="views/manage/frame/results.jsp" height="98%" width="98%" frameborder="0" scrolling="no" name="content"></iframe>
	</div>
</div>
</div>
</div>
<div class="logo-bottom">
底部
</div>

</body>

<script type="text/javascript">
document.getElementById('cancellation').addEventListener('click', function(e) {
	  e.preventDefault();
	  window.location.href="./LogoutServlet";
	}, false);
</script>

</html>
