<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="../LoginController">
		<fieldset>
		<p>Name:</p>
		<input type="text" name="txtNombre" placeholder="Your username">
		<p>Password:</p>
		<input type="password" name="txtClave">
		<br>
		<br>
		<input type="submit" value="Enter">
		</fieldset>
	</form>
</body>
</html>