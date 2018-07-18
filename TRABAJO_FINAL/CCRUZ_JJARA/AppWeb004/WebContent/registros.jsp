<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">-->
<!DOCTYPE html>
<html lang="es" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registro de Propiedades</title>
<meta name="description" content="Proyecto de Java 6 - ISIL + SUNARP" />
<meta name="keywords" content="" />
<meta name="author" content="" />
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<script src="js/modernizr.custom.js"></script>
</head>
<body>
	<div class="container">
		<ul id="gn-menu" class="gn-menu-main">
			<li class="gn-trigger"><a class="gn-icon gn-icon-menu"><span>Menu</span></a>
				<nav class="gn-menu-wrapper">
				<div class="gn-scroller">
					<ul class="gn-menu">
						<!--
								<li class="gn-search-item">
									<input placeholder="Search" type="search" class="gn-search">
									<a class="gn-icon gn-icon-search"><span>Buscar Partida</span></a>
								</li>
								-->
						<li><a class="gn-icon gn-icon-pictures" href="partidas.jsp">Partidas
								Registrales</a></li>
						<li><a class="gn-icon gn-icon-download"
							href="propietarios.jsp">Propietarios</a></li>
						<li><a class="gn-icon gn-icon-article" href="registros.jsp">Registros</a></li>

					</ul>
				</div>
				<!-- /gn-scroller --> </nav></li>

			<li><a class="codrops-icon codrops-icon-prev" href="index_.jsp"><span>Inicio</span></a></li>
			<li></li>
		</ul>
		<header> <!-- <h1>Registro de Propiedades <span>Bienes inmuebles y sus propietarios.</span></h1> -->

		<!--  -->
		<h1>Partidas & Propietarios</h1>
		<form method="POST" action="RegistroController">
			<div class="egcc-Registros">
				<div class="egcc-panel-body" id="divRegistros"></div>
			</div>
			
			<table>
				<tr>
					<td>Oficina</td>
					<td>Registro</td>
					<td>Nro. Partida</td>
					<td>Tipo Doc. Propietario</td>
					<td>Numero Doc. Propietario</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<jsp:useBean id="objO" class="pe.egcc.controller.ListaOficinas" scope="page" /> 
						<select name = "oficina">
							<c:forEach var="item" items="${objO.items}">
								<option value = "${item.CODIGO}">${item.DESCRIPCION}</option>
							</c:forEach>
						</select>					
					</td>
					<td>
						<jsp:useBean id="objR" class="pe.egcc.controller.ListaRegistros" scope="page" /> 
						<select name = "registro">
							<c:forEach var="item" items="${objR.items}">
								<option value = "${item.CODIGO}">${item.DESCRIPCION}</option>
							</c:forEach>
						</select>					
					</td>
					<td><input type="text" name="partida" /></td>
					<td>
					<jsp:useBean id="objP" class="pe.egcc.controller.ListaDocumentos" scope="page" /> 
						<select name = "tipoDoc">
							<c:forEach var="item" items="${objP.items}">
								<option value = "${item.CODIGO}">${item.DESCRIPCION}</option>
							</c:forEach>
						</select>					
					</td>
					<td><input type="text" name="numeDoc" /></td>
					<td><input type="submit" value="Asociar" /></td>
				</tr>
			</table>
			<br>
			<p>${message}</p>

		</form>
		<br>
		<h1>Lista de Registros</h1>
		<div class="egcc-registros">
			<div class="egcc-panel-body" id="divRegi"></div>
		</div>	
		<!--  --> </header>
	</div>
	<!-- /container -->
	<script src="js/classie.js"></script>
	<script src="js/gnmenu.js"></script>
	<script>
		new gnMenu(document.getElementById('gn-menu'));
	</script>
	<script type="text/javascript" src="jquery/jquery.js"></script>
	<script type="text/javascript" src="js/funciones.js"></script>
				<script>
	$(document).ready(function () {

		divRegistros = $("#divRegi");
		List_Registros();
		
	});	
	</script>	
</body>
</html>