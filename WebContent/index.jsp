<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style><%@include file="/WEB-INF/css/index.css"%></style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Kanit:ital,wght@1,500&display=swap" rel="stylesheet">
<title>Story</title>
</head>
<body>
<center>

<div class="container1">
<div class=style1">
 <img class="mainPic" src="images/writer.jpg">
	<h1 class="heading">Story Adda</h1>
	<p class="heading2">Read stories of different genres and and also write one.</p>
</div>
</div>
	
	<br>
	<div class="container">
	<h3>Join us to explore yourself</h3>
    <div class="links">
	<a href="${pageContext.request.contextPath}/register.html">Register</a>
	<img src="images/register.png">
	</div><br>
	<br>
	<div class="links">
	<a href="${pageContext.request.contextPath}/login.html">Login</a>
    <img src="images/login.png">
    </div>
	</div>
	<br>
	<br>
	

</center>
</body>
</html>