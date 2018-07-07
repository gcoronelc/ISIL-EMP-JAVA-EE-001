<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CONSULTAR CLIENTES</title>
</head>
<body>
	<h1>CONSULTAR CLIENTES</h1>
	<form method="post" action="ConsultarClientes">
		<table>
		<tr>
			<td>Paterno</td>
			<td>Materno</td>
			<td>Nombre</td>
			<td></td>
		</tr>
		<tr>
			<td><input type="text" name="paterno" /></td>
			<td><input type="text" name="materno" /></td>
			<td><input type="text" name="nombre" /></td>
			<td><input type="submit" value="Consultar" /></td>
		</tr>
		</table>
	
	</form>
	<h1>RESULTADO</h1>
	<table border="1">
		<tr>
			<td>CODIGO</td>
			<td>PATERNO</td>
			<td>MATERNO</td>
			<td>NOMBRE</td>
		</tr>
		<c:forEach items="${lista}" var="r">
			<tr>
				<td>${r.codigo}</td>
				<td>${r.paterno}</td>
				<td>${r.materno}</td>
				<td>${r.nombre}</td>
			</tr>
		</c:forEach>
		</table>
</body>
</html>