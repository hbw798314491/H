<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Update</title>
</head>
<style>

.main{
	width: 100%;
	height: 700px;
	background-color: #ffffff;
	
}

.form{
	margin-left: 35%;
	width: 400px;
	height: 250px;
}


.form form{
	padding: 35px;

}

.form select{

	width: 45px;
	height: 25px;
}

.form input{

	

}

</style>
<body>
	
	<div class="main">
			<h3 style="text-align: center;padding-top:80px;color: #525252">修改信息</h3>
			<div style="border: 1px solid #e2e2e2;margin: 65px 150px;margin-top: 50px"></div>  <!-- 分割线 -->
		<div class="form">
			<form action="/H" method="Post">
				<p>姓名：付重阳</p>
				性别：	
				<select name="sex">		
					<option value="man">男</option>
					<option value="woman">女</option>
				</select>
					<br>
				<p>民族：<input type="text" name="ethnic" style="width: 50px;"><br></p>
				<p>爱好：<input type="text" name="hobby" style="width: 80px;"><br /></p>				
				<p>电话：<input type="text" name="tel"><br /></p>
				<input type="submit">
			</form>
		</div>
	</div>
</body>
</html>