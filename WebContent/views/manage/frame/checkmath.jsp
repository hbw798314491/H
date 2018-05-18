<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>checkmath</title>
</head>
<style>
 table {width:80%;height: 10%; background:#ccc; margin: 10px auto;border-collapse:collapse;}
/*border-collapse:collapse合并内外边距(去除表格单元格默认的2个像素内外边距*/
 th, td {height:25px;line-height:25px;text-align:center;border:1px solid #333;}
 th {background:#eee;font-weight:normal;}
 tr {background:#fff;}
 tr:hover {background:#1010;}
 td a {color:#06f;text-decoration:none;}
 td a:hover {color:#06f;text-decoration:underline;} 

.main{
	width: 100%;
	height: 700px;
	background-color: #ffffff;


}


</style>
<body>
	
	<div class="main">
			<h3 style="text-align: center;padding-top:80px;color: #525252">同班同学</h3>
			<div style="border: 1px solid #e2e2e2;margin: 45px 150px;margin-top: 50px"></div>  <!-- 分割线 -->
			<table border="1" cellspacing="0" cellpadding="5" >
			<tr>
				<th>姓名</td>
				<th>学号</td>
				<th>性别</td>
				<th>班级</td>
				<th>爱好</td>
				<th>入学时间</td>
				<th>注册时间</td>
				<th>电话</th>	
			</tr>

			<tr>
				<td>胡博文</td>
				<td>20164001026</td>
				<td>男</td>
				<td>1班</td>
				<td>篮球</td>
				<td>2018/5/11</td>
				<td>2018/5/14</td>
				<td>13469797552</td>
			</tr>
			
		</table>

			</table>
	
	</div>
</body>
</html>