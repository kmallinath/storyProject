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
h2{
font-family: 'Kanit', sans-serif;
	color:#000080;
}
a{
text-decoration:none;
}
#textbox{
 font-size: 14pt;
    height: 300px;
    width : 800px;
}
#read,.home{
font-family: 'Kanit', sans-serif;
	color:#000080;
	font-weight:bold;
}
 .storyregisterbtn{
    border:solid 1px black;
    border-radius:10px;
    font-size:20px;
 }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Read/Write Stories</title>
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
		<h2>${message}  ,write your story</h2>
		
		<form:form action="processStory.html" method="POST" modelAttribute="storyBean">
		<table>
		<tr>
		<td style="font-size:18px">Story name </td>
		<td><form:input path="storyName" required="required" style="font-size:18px"/></td>
		<td><form:errors cssClass="error" path="storyName" /></td>
		</tr>
		<tr>
		<td style="font-size:18px">Story</td>
		<td><form:textarea type="textarea" path="story" required="required"  id="textbox"/></td>
		<td><form:errors cssClass="error" path="story" /></td>
		</tr>
		</table>
		<br>
		<input type="submit" value="Register" class="storyregisterbtn">
		<spring:hasBindErrors name="storyBean">
				<font color="red"><form:errors path="*"></form:errors></font>
		</spring:hasBindErrors>
		
		${errors}
		</form:form>
		<br>
	  <a href="${pageContext.request.contextPath}/allstories.html" id="read">CLICK HERE TO READ STORIES</a>
		
		
	</center>
</body>
</html>