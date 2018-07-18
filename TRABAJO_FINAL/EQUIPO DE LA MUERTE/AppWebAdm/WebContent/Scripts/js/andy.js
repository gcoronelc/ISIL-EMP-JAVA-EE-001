var divClientes;
var div00100001;
var div00100002;
var div00200001;
var div00300002;
var paterno;

$(document).ready(function() {

	divClientes = $("#divClientes");

	div00100001 = $("#div00100001");
	div00100002 = $("#div00100002");
	div00100003 = $("#div00200001");
	div00100004 = $("#div00200002");

	//paterno = $("#paterno").val();
	//paterno = $("#paterno").val();
	//paterno = $('input[name="paterno"]').val();
    //paterno = $('input[name="paterno"]').val();

	
	$("#btnConsultar1").click(SUNARP_BtnConsultar);
	//var paterno = $("#paterno").val();

	//paterno = $("#paterno").val();

});

function SUNARP_BtnConsultar() {

	// Clientes
	var url = "getEmpleadosByTagsAJAX";
	//var data = "paterno="+paterno+"&materno=&nombre=";
	var data = "paterno=&materno=&nombre=";

	var mensaje = "Consultando datos de los empleados.";
	SUNARP_LoadPage(url, data, divClientes, mensaje);

	// Consultar Cuentas
	//SUNARP_ConsultarMovimientos("00100001");
	//SUNARP_ConsultarMovimientos("00100002");
	//SUNARP_ConsultarMovimientos("00200001");
	//SUNARP_ConsultarMovimientos("00200002");
};

/*function SUNARP_ConsultarMovimientos(cuenta) {
	var url = "ConsultarMovimientos";
	var data = "paterno=" + cuenta;
	var mensaje = "Consultando movimientos de la cuenta " + cuenta + ".";
	var div = $("#div" + cuenta);
	SUNARP_LoadPage(url, data, div, mensaje);
}*/

function SUNARP_LoadPage(url, data, div, mensaje) {
	SUNARP_AJAX(div, mensaje);
	$.get(url, data, function(arreglo) {
		//setTimeout(function() {
			SUNARP_PintarArreglo(div, arreglo);
			// },3000);
		    //}, 1);
	});
}

function SUNARP_PintarArreglo(div, arreglo) {
	// Datos Previos
	var campos = Object.keys(arreglo[0]);
	var nCampos = campos.length;
	var columna;
	var rec;
	// Cabecera
	var tabla = "<table border='1'>";
	tabla += "<tr>";
	for (var j = 0; j < nCampos; j++) {
		columna = campos[j];
		tabla += "<th>" + columna + "</th>";
	}
	/*tabla += "<th>CODIGO</th>";
	tabla += "<th>PATERNO</th>";
	tabla += "<th>MATERNO</th>";
	tabla += "<th>NOMBRE</th>";
	tabla += "<th>CO USUA</th>";
	tabla += "<th>CARGO</th>";
	tabla += "<th>DNI</th>";	*/

	tabla += "</tr>";
	// Datos - Bucle de Filas
	for (var i = 0; i < arreglo.length; i++) {
		rec = arreglo[i];
		tabla += "<tr>";
		// Datos - Bucle de columnas
		for (var j = 0; j < nCampos; j++) {
			columna = rec[campos[j]];
			tabla += "<td>" + columna + "</td>";
			;
		}
		tabla += "</tr>";
	}
	tabla += "</table>";
	// Pintar la tabla
	div.html(tabla);
}

function SUNARP_AJAX(div, mensaje) {
	var html = "<div>";
	html += "<img src='Scripts/img/ajax.gif'>"
	html += "<label>" + mensaje + "</label>";
	html += "</div>";
	div.html(html);
}