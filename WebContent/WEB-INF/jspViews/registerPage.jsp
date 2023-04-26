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
	  background-color:#fff8e6;
}
.textbox{
font-size:18px;
}
.btn{
 border:solid 1px black;
    border-radius:10px;
    font-size:20px;
}
h2{
font-family: 'Kanit', sans-serif;
	color:#000080;
}
.home{
font-family: 'Kanit', sans-serif;
	color:#000080;
	font-weight:bold;
}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
}
</style>
</head>
<body>
<br><a href="${pageContext.request.contextPath}/index.jsp" class="home">HOME</a>
	<center>
		<h2>Register</h2>
		<form:form action="processRegistration.html" method="POST" modelAttribute="loginBean">
		<table>
		<tr>
		<td style="font-size:18px">User name</td>
		<td><form:input  path="userName" required="required"  class="textbox"/></td><br>
		<td><form:errors cssClass="error" path="userName" /></td>
		</tr>
		<tr>
		<td style="font-size:18px">Password</td>
		<td><form:input type="password" path="password" required="required" class="textbox"/></td>
			<td><form:errors cssClass="error" path="password" /></td>
		</tr>
		</table>
		
		<br>
		<input type="submit" value="Register" class="btn" >
		</form:form>
		<p style="font-size:80px;">${message}</p>
	
		
	</center>

</body>
</html>