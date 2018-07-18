
//import {DataTable} from 'https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js'; // or './module'
//var imported = document.createElement('script');
//imported.src = 'https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js';
//document.head.appendChild(imported);

var divClientes;
var div00100001;
var div00100002;
var div00200001;
var div00300002;
var txtPaterno ;
var txtMaterno ;
var txtNombre ;


$(document).ready(function() {

	divClientes = $("#divClientes");

	/*div00100001 = $("#div00100001");
	div00100002 = $("#div00100002");
	div00100003 = $("#div00200001");
	div00100004 = $("#div00200002");*/
	// Datatable
	//$('#table_id').DataTable();
	
	$("#btnConsultar1").click(SUNARP_BtnConsultar);
});

function SUNARP_BtnConsultar() {

	txtPaterno = $("#txtPaterno").val();
	txtMaterno = $("#txtMaterno").val();
	txtNombre = $("#txtNombre").val();
	
	// Clientes
	var url = "getEmpleadosByTagsAJAX";
	var data = "paterno="+txtPaterno+"&materno="+txtMaterno+"&nombre="+txtNombre;
	var mensaje = "Consultando datos de los clientes.";
	SUNARP_LoadPage(url, data, divClientes, mensaje);

	// Consultar Cuentas
	/*
	 * SUNARP_ConsultarMovimientos("00100001");
	 * SUNARP_ConsultarMovimientos("00100002");
	 * SUNARP_ConsultarMovimientos("00200001");
	 * SUNARP_ConsultarMovimientos("00200002");
	 */
};

/*
 * function SUNARP_ConsultarMovimientos(cuenta) { var url =
 * "ConsultarMovimientos"; var data = "cuenta=" + cuenta; var mensaje =
 * "Consultando movimientos de la cuenta " + cuenta + "."; var div = $("#div" +
 * cuenta); SUNARP_LoadPage(url, data, div, mensaje); }
 */

function SUNARP_LoadPage(url, data, div, mensaje) {
	SUNARP_AJAX(div, mensaje);
	$.get(url, data, function(arreglo) {
		// setTimeout(function() {
			SUNARP_PintarArreglo(div, arreglo);
			// },3000);
		    // }, 1);
	});
}

function SUNARP_PintarArreglo(div, arreglo) {
	// Datos Previos
	var campos = Object.keys(arreglo[0]);
	var nCampos = campos.length;
	var columna;
	var rec;
	var no_column;
	// Cabecera
	var tabla = "<table id='table_id' class='display'>";
	tabla += "<thead>";
	tabla += "<tr>";
	for (var j = 0; j < nCampos; j++) {
		columna = campos[j];		
		tabla += "<th>" + columna + "</th>";
	}
	tabla += "</tr>";
	tabla += "</thead>";
	tabla += "<tbody>";
	// Datos - Bucle de Filas
	for (var i = 0; i < arreglo.length; i++) {
		rec = arreglo[i];
		tabla += "<tr>";
		// Datos - Bucle de columnas
		for (var j = 0; j < nCampos; j++) {
			columna = rec[campos[j]];
			//Modificando datos
			if (columna == null){
				columna="";
			}
			tabla += "<td>" + columna + "</td>";
			;
		}
		// Columna acciones
		tabla += "  <td style='text-align: center'><a class='btn btn-warning' ";
	    // tabla += " href='editEmpleado?CO_EMPL=${r.CO_EMPL}' role='button'>
		// <span ";
	    tabla += "	href='editEmpleado?CO_EMPL="+rec[campos[5]]+"' role='button'> <span ";
	    tabla += "	class='glyphicon glyphicon-repeat'></span></a></td>";	     
		
	    tabla += "</tr>";
	}
	tabla += "</tbody>";
	tabla += "</table>";
	// Pintar la tabla	
	div.html(tabla);
	
	// $(document).ready(function() {

		/*
		 * divClientes = $("#divClientes");
		 * 
		 * div00100001 = $("#div00100001"); div00100002 = $("#div00100002");
		 * div00100003 = $("#div00200001"); div00100004 = $("#div00200002");
		 */
		// Datatable
		$('#table_id').DataTable();
		
		// $("#btnConsultar1").click(SUNARP_BtnConsultar);
	// });

		/*var tabla1 = " <table id='table_id1' class='display'>";
		tabla1 += " <thead>";
		tabla1 += "    <tr>";
		tabla1 += "        <th>Column 1</th>";
		tabla1 += "        <th>Column 2</th>";
		tabla1 += "     </tr>";
		tabla1 += "  </thead>";
		tabla1 += " <tbody>";
		tabla1 += "    <tr>";
		tabla1 += "        <td>Row 1 Data 1</td>";
		tabla1 += "       <td>Row 1 Data 2</td>";
		tabla1 += "   </tr>";
		tabla1 += "    <tr>";
		tabla1 += "        <td>Row 2 Data 1</td>";
		tabla1 += "	            <td>Row 2 Data 2</td>";
		tabla1 += "	        </tr>";
		tabla1 += "	    </tbody>";
		tabla1 += "	</table>";
		// Datatable
		$('#table_id1').DataTable();
	
		div.html(tabla1);	*/
}

function SUNARP_AJAX(div, mensaje) {
	var html = "<div>";
	html += "<img src='img/ajax.gif'>"
	html += "<label>" + mensaje + "</label>";
	html += "</div>";
	div.html(html);
}