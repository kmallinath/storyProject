<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Kanit:ital,wght@1,500&display=swap" rel="stylesheet">
<meta charset="ISO-8859-1">
<style>
h1{
font-family: 'Kanit', sans-serif;
	color:#000080;
}
body {
	
   background-color:#fff8e6;

}
.home{
font-family: 'Kanit', sans-serif;
	color:#000080;
	font-weight:bold;
	text-decoration:none;
	font-size:23px;
}
.head{
font-size:20px;
width:300px;
font-weight:bold;
font-family: 'Kanit', sans-serif;
	color:#000080;

}
.btn{
   font-size:18px;
   width:300px;
   background-color:#fff8e6;
   border:none;
}
.btn:hover{
 background-color:#f5d687;
}







</style>
<title>All Stories</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/index.jsp" class="home">Home</a>
<center>
	<br>
	<c:if test="${empty storyList}">
		<h3>No Stories Available!!!</h3>
	</c:if>
	<c:if test="${not empty storyList}">
	<table border="1">
			<tr>
			    <td class="head"><center>Story Id</center></td>
				<td class="head"><center>Story Name</center></td>
				

			
			</tr>
			<c:forEach var="sb" items="${storyList}">
			
				<tr>
				    <td><center>${sb.storyId}</center></td>
                   
					<td>
					 <form:form action="storypage.html">
					 <input value="${sb.storyId}" type="hidden" name="id" />
					 <button type="submit" class="btn" >${sb.storyName}</button>
                    </form:form>
					</td>
			
				</tr>
			
			</c:forEach>
		</table>
	</c:if>
	<br>
	<br>
	
</center>
</body>
</html>