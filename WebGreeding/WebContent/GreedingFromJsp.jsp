<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Felhasználó Üdvözlése JPS-ből</title>
</head>
<body align="center">
	Hello there 
	<%=request.getParameter("lastName") == null ? "" : request.getParameter("lastName") %> <%=request.getParameter("firstName") == null ? "" : request.getParameter("firstName") %>!
	<br />
	<a href="<%=request.getContextPath()%>">Vissza</a> 
</body>
</html>