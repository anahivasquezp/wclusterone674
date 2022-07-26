<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
String color =  request.getParameter("colorFondo");
if(color == null || color.trim().equals("")){
	color = "white";
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=<%=color %>>

</body>
</html>