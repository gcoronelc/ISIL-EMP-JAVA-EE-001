<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="Scripts/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="Scripts/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<title>LOGIN</title>
</head>
<body>

	<h1>Modulo de Gestion de Permisos</h1>
	<br>
	<br>

	<form method="post" action="Login">
		<table>
			<tr>
				<td><label class="control-label col-md-10">USUARIO</label></td>
				<td><input type="text" name="usuario" id="usuario"
					class="form-control" onkeypress="return keypress_noespace(event)"
					maxlength="15" style="text-transform: uppercase" required="true"
					placeholder="Escriba usuario" /></td>
			</tr>
			<tr>
				<td><label class="control-label col-xs-4">CLAVE</label></td>
				<td><input type="text" name="clave" id="clave"
					class="form-control" onkeypress="return keypress_noespace(event)"
					maxlength="15" style="text-transform: uppercase" type="password"
					required="true" placeholder="Escriba clave" /></td>
			</tr>
			<tr>
				<td><button type="submit" class="btn btn-primary">Login</button></td>
			</tr>
			<c:out value="${mensaje}" />
		</table>
	</form>
	<br>

	<div class="form-horizontal">
		<hr />
		<div class="form-group">
			<label class="control-label col-md-2">USUARIO</label>
			<div class="col-md-10">
				<input type="text" name="paterno" id="paterno" class="form-control"
					onkeypress="return keypress_noespace(event)" maxlength="15"
					style="text-transform: uppercase" required="true"
					placeholder="Escriba usuario" />
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-md-1">CLAVE</label>

			<div class="col-md-10">
				<input type="text" name="paterno" id="paterno" class="form-control"
					onkeypress="return keypress_noespace(event)" maxlength="15"
					style="text-transform: uppercase" type="password" required="true"
					placeholder="Escriba clave" />
			</div>
		</div>

		<div class="form-group">
			<div class="col-md-offset-2 col-md-10">
				<input type="submit" value="Login" class="btn btn-primary" />
			</div>
		</div>
	</div>
	<h1></h1>
	<table border="1">
		<tr>
			<td>CODIGO</td>
			<td>PATERNO</td>
			<td>MATERNO</td>
			<td>NOMBRE</td>
			<td>STATUS</td>
			<td>CO USUA</td>
			<td>CARGO</td>
			<td>DNI</td>
		</tr>
		<c:forEach items="${lista}" var="r">
			<tr>
				<td>${r.CO_EMPL}</td>
				<td>${r.APE_PAT}</td>
				<td>${r.APE_MAT}</td>
				<td>${r.NOMBRE}</td>
				<td>${r.EST_EMPL}</td>
				<td>${r.USU_SIST}</td>
				<td>${r.DESC_CARGO}</td>
				<td>${r.DNI}</td>
			</tr>
		</c:forEach>
	</table>
	<script type="text/javascript" src="Scripts/js/ValidationField.js"></script>
</body>
</html>