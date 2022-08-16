<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Personas</title>
</head>
<body>
<h1>Listado de Personas</h1>

<table>
	<tr>
		<td>Id</td>
		<td>Nombre</td>
		<td>Clave</td>
	</tr>
	
	<c:forEach items="${personitas}" var="p">
		<tr>
			<td>${p.id}</td>
			<td>${p.nombre}</td>
			<td>${p.clave}</td>
		</tr>
	</c:forEach>
	
</table>
</body>
</html>