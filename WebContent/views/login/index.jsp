<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
	<meta http-equiv="charset" content="utf-8">
	<meta http-equiv="content-language" content="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>登陆 - 青木学生管理系统</title>
	<link rel="stylesheet" type="text/css" href="/H/views/login/static/css/login.css"/>
 <%
 
 if("1".equals(request.getParameter("message")))
 {
	 out.println("<script>alert(\"注册成功！\");</script>");
 }
 
 if("2".equals(request.getParameter("message")))
 {
	 out.println("<script>alert(\"注销成功！\");</script>");
 }
 
 
 
 if(session.getAttribute("Name")!=null){
	 out.print("<script>window.location.href=\"./Controller\";</script>");
 }
 %>
 <script>
 
function required(love,you){

	with(love)
	{
		if(value==null|value=="")
			{alert(you);return false}
		else{return true}

	}
}

function gorequired(i){
	with(i)
	{
		if(required(user,"学号不能为空！")==false)
			{user.focus();return false}
		if(required(password,"密码不能为空！")==false)
			{password.focus();return false}
	}
}
</script>
</head>
<body class="ustack bg">

<div class="wrapper">
	<div class="before"></div>
	<div class="con">
		
			<div class="logo"></div>
			<div class="Logo_text">青木学生管理系统</div>
	
		<form name="postfrom" method="post" action="/H/Controller" id="postfrom" onsubmit="return gorequired(this)">
			<div class="username_content">
				<label for="id_email" class="placeholder" id="idPlaceholder">学号</label>
				<input name="user" id="id_email" type="text" autofocus="autofocus" placeholder="" class="email" tabindex="1">
			</div>
			<div class="password_content">
				<label for="id_password" class="placeholder" id="pwdPlaceholder">密码</label>
				<input name="password" id="id_password" placeholder="" type="password" class="password" tabindex="2">
			</div>
			
			<div class="tip">
				<div class="retrieve">
					<a href="#" target="_blank">忘记密码?</a>
				</div>
			</div>
			<input type="submit" class="submit" value="登录">
		</form>
		<div class="signup">
			没有学号? <a href="./regedit" > 注册 </a>
		</div>
	</div>
	<div class="after"></div>
</div>


<div style="display:none;">
</div>
<script src="views/login/static/js/login.js"></script>
</body>

</html>