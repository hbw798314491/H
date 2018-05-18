<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>results</title>
</head>
<style>
 table {width:50%;height: 25%; background:#ccc; margin: 10px auto;border-collapse:collapse;}
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
			<h3 style="text-align: center;padding-top:80px;color: #525252">考试成绩</h3>
			<div style="border: 1px solid #e2e2e2;margin: 135px 150px;margin-top: 50px"></div>  <!-- 分割线 -->
			<table border="1" cellspacing="0" cellpadding="8" >
				<tr>
					<th colspan="4">我的成绩</th>
				</tr>
				<tr>
					<td>姓名</td>
					<td>付重阳</td> <!--  姓名  -->
					<td>学号</td>
					<td>20164001026</td>  <!-- 学号 -->
				</tr>
				<tr>
					<td>语文</td>
					<td>55分</td>
					<td>数学</td>
					<td>56分</td>
				</tr>


				<tr>
					<td>英语</td>
					<td>48分</td>
					<td>理综</td>
					<td>154分</td>
				</tr>

				<tr>
					<td>班级排名</td>
					<td>28名</td>
					<td>年级排名</td>
					<td>214名</td>
				</tr>

			</table>
	
	</div>
</body>
</html>