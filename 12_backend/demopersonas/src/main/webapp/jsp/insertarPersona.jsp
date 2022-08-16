<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<!-- CSS only -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/estilos.css">
<body>

	<%@include file="../templates/banner_interno.html"%>
	<div>
		<a href="ListarPersonasController">Ir a Listar</a>
	</div>

	<div class="wrapper">
		<h1>Insertar Persona</h1>

		<form method="post" action="InsertarPersonaController">
			
			<label for="txtId">Nombre</label> <input
				type="text" name="txtNombre" id="txtNombre" /> <br> <label
				for="txtId">Clave</label> <input type="password" name="txtClave"
				id="txtClave" /> <br> <br> <br> <input type="submit"
				value="Guardar" /> <br>
		</form>
	</div>
</body>
</html>