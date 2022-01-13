
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reset Password</title>

<link rel="stylesheet" type="text/css" href="css_style.css">
</head>
<body>
<center>
<h1><b>RESET YOUR PASSWORD</b></h1>
<br> <br> <br>
<form action="adminServlet" method="POST">

<table class="setcolor" style="width:50%; margin: 0px auto;">
	<tr>
		<td><label for="oldPass" style="font-size:16pt;" >Old Password</label></td>
    <td><input type="password" name="oldPass" style="font-size:16pt; width:270px;" /></td>
	</tr>
	
	<tr>
		<td><label for="newPass" style="font-size:16pt;" >New Password</label></td>
    <td><input type="password" name="newPass" style="font-size:16pt; width:270px;" /></td>
	</tr>
	
	<tr>
		<td><label for="confirmPass" style="font-size:16pt;" >Confirm Password</label></td>
    <td><input type="password" name="confirmPass" style="font-size:16pt; width:270px;" /></td>
	</tr>
</table>

<br> <br>
 <table style="width:20%">
  <tr>
  <td> <input type="submit" value="Reset Password" style="font-size:20pt; width:200pt; background:#93f96c"/> </td>
  </tr>
</table>

</center>
</body>
</html>