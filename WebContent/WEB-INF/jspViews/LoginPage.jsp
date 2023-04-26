<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Kanit:ital,wght@1,500&display=swap" rel="stylesheet">
<style type="text/css">
body {
	background: lavender;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
 body{
   background-color:#fff8e6;
 }
 h2{
 font-family: 'Kanit', sans-serif;
	color:#000080;
 }
 .loginbtn{
    border:solid 1px black;
    border-radius:10px;
    font-size:20px;
 }
 a{
 text-decoration:none;
 }
 .home{
font-family: 'Kanit', sans-serif;
	color:#000080;
	font-weight:bold;
}
.error {
	color: #ff0000;
	font-style: italic;
}
.textbox{
font-size:18px;
}
</style>
</head>
<body>
<br><a href="${pageContext.request.contextPath}/index.jsp" class="home">HOME</a>
	<center>
		<h2><u>Enter Your Credentials</u></h2>
		<form:form action="loginprocess.html" method="POST" modelAttribute="loginBean">
		<table>
		<tr>
		<td>Username:</td>
		<td><form:input path="userName" class="textbox"/></td>
		<td><form:errors cssClass="error" path="userName" /></td>
		</tr>
		<tr>
		<td>Password:</td>
		<td><form:input type="password" path="password" class="textbox" /></td>
		<td><form:errors cssClass="error" path="password" /></td>
		</tr>
		</table>
		<br>
		<input type="submit" value="Login" class="loginbtn">
		</form:form>
	    <strong class="error">${message1}</strong>
		
	</center>
</body>
</html>