<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TRANSACCIONES</title>
</head>
<body>
	<H1>EJECUTAR RETIRO</H1>
	
	<div class="egcc-panel-body">
		<form id="form1">
			
			<div>
				<label>Cuenta:</label>
				<input type="text" name="cuenta"/>
			</div>
			
			<div>
				<label>Importe:</label>
				<input type="text" name="importe"/>
			</div>
			
			<div>
				<label>Clave:</label>
				<input type="password" name="clave"/>
			</div>
			
			<div>
				<button id="btnProcesar" type="button">Procesar</button>
			</div>
		
		</form>
	
	</div>
	
	<script type="text/javascript">
	
	$(document).ready(function () {
		
		$("#btnProcesar").click(fnProcesar);
		
	});
	
	function fnProcesar(){
		
		var data = $("#form1").serialize();
		$.post("ProcRetiro", data, function(rpta){
			
			if(rpta.code == 1){
				alert("Proceso ok.\n" + rpta.message);
			} else {
				alert(rpta.message);
			}
			
			
		});
		
		
	}
	
	</script>
	
</body>
</html>