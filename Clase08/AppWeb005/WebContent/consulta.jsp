<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>EJEMPLO AJAX</title>
</head>
<body>
	<h1>CONSULTAR CLIENTES</h1>
	
	<div class="egcc-panel">
		<button type="button" id="btnConsultar">Consultar</button>
	</div>
	
	<div class="egcc-panel">
		<h1>CLIENTES</h1>
		<div class="egcc-panel-body" id="divClientes">
			
		</div>
	</div>
	
	<div class="egcc-panel">
		<h1>MOVIMIENTOS CUENTA 00100001</h1>
		<div class="egcc-panel-body" id="div00100001"></div>
	</div>
	
	<div class="egcc-panel">
		<h1>MOVIMIENTOS CUENTA 00100002</h1>
		<div class="egcc-panel-body" id="div00100002"></div>
	</div>
	
	<div class="egcc-panel">
		<h1>MOVIMIENTOS CUENTA 00200001</h1>
		<div class="egcc-panel-body" id="div00200001"></div>
	</div>
	
	<div class="egcc-panel">
		<h1>MOVIMIENTOS CUENTA 00200002</h1>
		<div class="egcc-panel-body" id="div00200002"></div>
	</div>
	
	<script type="text/javascript" src="js/consulta.js"></script>
</body>
</html>