<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
	<meta http-equiv="charset" content="utf-8">
	<meta http-equiv="content-language" content="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>注册 - 青木管理系统</title>
	<link rel="stylesheet" type="text/css" href="views/login/static/css/login.css"/>
</head>
<%
if(session.getAttribute("Name")!=null){
	 out.print("<script>window.location.href=\"./Controller\";</script>");
}
%>
<%
if("1".equals(request.getParameter("message"))){
	out.print("<script>alert(\"对不起，这个学号已经被注册了，请尝试换一个吧！\")</script>");
}
%>

<script type="text/javascript">

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
		if(required(name,"姓名不能为空！")==false)
			{name.focus();return false}
		if(required(password,"密码不能为空！")==false)
			{password.focus();return false}
		
	}
}

</script>


<body class="ustack bg">

<div class="wrapper">
	<div class="before"></div>
	<div class="con">
			<div class="logo"></div>
		<div class="Logo_text">青木学生管理系统</div>
		<form name="postfrom" method="post" action="./Regedit" id="postfrom" onsubmit="return gorequired(this)">
				
			
			<div class="password_content">
				<label for="id_user" class="placeholder" id="usPlaceholder">新学号</label>
				<input name="user" id="id_user" placeholder="" autofocus="autofocus" type="text" class="password" tabindex="1" >
			</div>
			<div class="password_content">
				<label for="id_password" class="placeholder" id="pwdPlaceholder">新密码</label>
				<input name="password" id="id_password" placeholder="" type="password" class="password" tabindex="2">
			</div>
			<div class="password_content">
				<label for="id_name" class="placeholder" id="naPlaceholder">真实姓名</label>
				<input name="name" id="id_name" type="text"  placeholder=""  class="password" tabindex="3">
			</div>		
			<div class="password_content">
				<label for="id_class" class="placeholder" id="cldPlaceholder">班级</label>
				<input name="class" id="id_class" placeholder="" type="text" class="password" tabindex="4">
			</div>

			<div class="tip">
				<div class="retrieve">
					<a href="#" target="_blank">忘记密码?</a>
				</div>
			</div>
			<input type="submit" class="submit" value="注册">
		</form>
		<div class="signup">
			我有学号? <a href="/H"> 登陆 </a>
		</div>
	</div>
	<div class="after"></div>
</div>

<script src="/H/views/login/static/js/regedit.js"></script>

</body>
</html>