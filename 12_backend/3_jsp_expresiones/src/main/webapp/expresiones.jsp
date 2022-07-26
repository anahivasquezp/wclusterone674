<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="index.html">Al Inicio</a>
	<br>
	<h1>Expresiones</h1>
	<%= "Hola" %>
	<br>
	<%= "Ecuador es un país " + "amazónico" %>
	<br>
	<%= 10*2/2 %>
	<h1>Acceso a objetos impícitos</h1>
	<%= session.getId() %>
</body>
</html>