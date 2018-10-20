<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <c:forEach var="i" begin="1" end="10" step="1">
	  <c:out value="${i}" />
	  <br />
	</c:forEach> --%>
	Admin main page.. WIP
	<c:choose>
		<c:when test="${user != null}">
			Hello, ${user}! Welcome to the world of Spring, IOC and Dependency Injection.<BR>
			Go to <a href="home.html">home</a> page.
		</c:when>
	</c:choose>
</body>
</html>