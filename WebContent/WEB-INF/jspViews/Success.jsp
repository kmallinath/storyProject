<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Kanit:ital,wght@1,500&display=swap" rel="stylesheet">
<style type="text/css">
body {
	  background-color:#fff8e6;
}
.box{
   border: solid 2px grey;
}
.home,h1{
font-family: 'Kanit', sans-serif;
	color:#000080;
	font-weight:bold;
	font-size:23px;
	text-decoration:underline;
}
p{
font-size:18px;
width:100%;
word-wrap: break-word;
white-space: normal;
}


</style>
<meta charset="ISO-8859-1">
<title>StoryADDA</title>
</head>
<body>
<br><a href="${pageContext.request.contextPath}/index.jsp" class="home">HOME</a>
<div class="box">
<center>
<h1>${title}</h1>
<p>${message}</p>

<a href="${pageContext.request.contextPath}/allstories.html" class="home">${storiespage}</a>

</center>
</div>
</body>
</html>