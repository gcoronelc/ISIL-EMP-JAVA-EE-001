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

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">
<script type="text/javascript" charset="utf8"
	src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>

<title>USUARIOS</title>
</head>
<body>
	<h1>LISTA DE EMPLEADOS</h1>
	<!--  <form method="post" action="getUsuarios">-->
	<table>
		<tr>
			<td><label class="control-label col-xs-4">Paterno</label></td>
			<td><label class="control-label col-xs-4">Materno</label></td>
			<td><label class="control-label col-xs-4">Nombre</label></td>
		</tr>
		<tr>
			<td><input type="text" name="txtPaterno" id="txtPaterno"
				class="form-control" placeholder="Escriba apellido paterno" /></td>
			<td><input type="text" name="txtMaterno" id="txtMaterno"
				class="form-control" placeholder="Escriba apellido materno" /></td>
			<td><input type="text" name="txtNombre" id="txtNombre"
				class="form-control" placeholder="Escriba nombre" /></td>
			<td><button type="submit" class="btn btn-primary"
					id="btnConsultar1">Consultar</button></td>
			<td><button type="button" id="btncreateEmpleado" class="btn btn-warning">Crear Empleado</button></td>
			
			<td style='text-align: center'><a class='btn btn-warning' 		
	   href='createEmpleado' role='button'> <span 
	   class='glyphicon glyphicon-repeat'></span></a></td>

		</tr>
	</table>
	<!--</form>
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
				<td style="text-align: center"><a class="btn btn-warning"
					href="editEmpleado?CO_EMPL=${r.CO_EMPL}" role="button"> <span
						class="glyphicon glyphicon-repeat"></span></a></td>
			</tr>
		</c:forEach>
	</table>

	<div class="egcc-panel">
		<button type="button" id="btnConsultar1">Consultar</button>
	</div>-->

	<div class="egcc-panel">
		<h1></h1>
		<div class="egcc-panel-body" id="divClientes"></div>
	</div>

	<script type="text/javascript" src="Scripts/js/btn.js"></script>
	<script type="text/javascript" src="Scripts/js/andy2.js"></script>
</body>
</html>