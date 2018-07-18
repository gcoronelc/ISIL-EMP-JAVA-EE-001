var divPropietarios;
var divPartidas;
var divRegistros;

function List_Propietarios(){

	//alert("List_Propietarios");
	  // Propietarios
	  var url = "ConsultarProp";
	  var data = "";
	  var mensaje = "Consultando Propietarios.";
	  SUNARP_LoadPageProp(url,data,divPropietarios,mensaje);
};

function List_Partidas(){
	
	//alert("List_Partidas");
	  // Partidas
	  var url = "ConsultarPart";
	  var data = "";
	  var mensaje = "Consultando Partidas.";
	  SUNARP_LoadPagePart(url,data,divPartidas,mensaje);
};

function List_Registros(){
	
	//alert("List_Partidas");
	  // Registros
	  var url = "ConsultarRegi";
	  var data = "";
	  var mensaje = "Consultando Registros.";
	  SUNARP_LoadPageRegi(url,data,divRegistros,mensaje);
};

function SUNARP_LoadPage(url, data, div, mensaje){
	//alert("SUNARP_LoadPage");
	SUNARP_AJAX(div, mensaje);
	$.get(url, data, function(arreglo){
		setTimeout(function(){
			SUNARP_PintarArreglo(div,arreglo);
		},1000);
	});
}

function SUNARP_LoadPageRegi(url, data, div, mensaje){
	//alert("SUNARP_LoadPage");
	SUNARP_AJAX(div, mensaje);
	$.get(url, data, function(arreglo){
		setTimeout(function(){
			SUNARP_PintarArregloRegi(div,arreglo);
		},1000);
	});
}

function SUNARP_LoadPagePart(url, data, div, mensaje){
	//alert("SUNARP_LoadPage");
	SUNARP_AJAX(div, mensaje);
	$.get(url, data, function(arreglo){
		setTimeout(function(){
			SUNARP_PintarArregloPart(div,arreglo);
		},1000);
	});
}

function SUNARP_LoadPageProp(url, data, div, mensaje){
	//alert("SUNARP_LoadPage");
	SUNARP_AJAX(div, mensaje);
	$.get(url, data, function(arreglo){
		SUNARP_PintarArregloProp(div,arreglo);
	});
}


function SUNARP_PintarArreglo(div, arreglo){
	//alert("SUNARP_PintarArreglo");
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
	tabla += "</tr>";
	// Datos - Bucle de Filas
	for (var i = 0; i < arreglo.length; i++) {
		rec = arreglo[i];
	    tabla += "<tr>";
	    // Datos - Bucle de columnas 
	    for (var j = 0; j < nCampos; j++) {
            columna = rec[campos[j]];
            tabla += "<td>" + columna + "</td>";;
        }
	    tabla += "</tr>";
	}
	tabla += "</table>";
	// Pintar la tabla
	div.html( tabla );
}

function SUNARP_PintarArregloProp(div, arreglo){
	// Datos Previos
	var campos = Object.keys(arreglo[0]);
	var nCampos = campos.length;
	var columna;
	var rec;
	// Cabecera
	var tabla = "<table border='1'>";
	tabla += "<tr>";
    tabla += "<th>Tipo de Documento</th>";;
    tabla += "<th>Nro. de Documento</th>";;
    tabla += "<th>Apellido Paterno</th>";;
    tabla += "<th>Apellido Materno</th>";;
    tabla += "<th>Nombres</th>";;
    
	/*for (var j = 0; j < nCampos; j++) {
        columna = campos[j];
        tabla += "<th>" + columna + "</th>";
    }*/
	tabla += "</tr>";
	// Datos - Bucle de Filas
	for (var i = 0; i < arreglo.length; i++) {
		rec = arreglo[i];
	    tabla += "<tr>";
	    tabla += "<td>" + rec['TIPO DE DOCUMENTO'] + "</td>";;
	    tabla += "<td>" + rec['NRO. DE DOCUMENTO'] + "</td>";;
	    tabla += "<td>" + rec['APELLIDO PATERNO'] + "</td>";;
	    tabla += "<td>" + rec['APELLIDO MATERNO'] + "</td>";;
	    tabla += "<td>" + rec['NOMBRES'] + "</td>";;
	    tabla += "</tr>";
	}
	tabla += "</table>";
	// Pintar la tabla
	div.html( tabla );
}

function SUNARP_PintarArregloPart(div, arreglo){
	// Datos Previos
	var campos = Object.keys(arreglo[0]);
	var nCampos = campos.length;
	var columna;
	var rec;
	// Cabecera
	var tabla = "<table border='1'>";
	tabla += "<tr>";
    tabla += "<th>Oficina</th>";
    tabla += "<th>Partida</th>";
    tabla += "<th>Registro</th>";
    tabla += "<th>Detalle</th>";
	tabla += "</tr>";
	// Datos - Bucle de Filas
	for (var i = 0; i < arreglo.length; i++) {
		rec = arreglo[i];
	    tabla += "<tr>";
	    tabla += "<td>" + rec['OFICINA'] + "</td>";
	    tabla += "<td>" + rec['PARTIDA'] + "</td>";
	    tabla += "<td>" + rec['REGISTRO'] + "</td>";
	    tabla += "<td>" + rec['DETALLE'] + "</td>";
	    tabla += "</tr>";
	}
	tabla += "</table>";
	// Pintar la tabla
	div.html( tabla );
}

function SUNARP_PintarArregloRegi(div, arreglo){
	// Datos Previos
	var campos = Object.keys(arreglo[0]);
	var nCampos = campos.length;
	var columna;
	var rec;
	// Cabecera
	var tabla = "<table border='1'>";
	tabla += "<tr>";
    tabla += "<th>Oficina</th>";
    tabla += "<th>Registro</th>";
    tabla += "<th>Partida</th>";
    tabla += "<th>Tipo Doc. Propietario</th>";
	tabla += "<th>N&uacute;mero Doc. Propietario</th>";
	tabla += "<th>Propietario</th>";
	tabla += "<th>Situaci&oacute;n</th>";
	tabla += "</tr>";
	// Datos - Bucle de Filas
	for (var i = 0; i < arreglo.length; i++) {
		rec = arreglo[i];
	    tabla += "<tr>";
	    tabla += "<td>" + rec['OFICINA'] + "</td>";
	    tabla += "<td>" + rec['REGISTRO'] + "</td>";
	    tabla += "<td>" + rec['PARTIDA'] + "</td>";	    
	    tabla += "<td>" + rec['TIPO DOC. PROPIETARIO'] + "</td>";
	    tabla += "<td>" + rec['NUMERO DOC. PROPIETARIO'] + "</td>";
	    tabla += "<td>" + rec['PROPIETARIO'] + "</td>";
	    tabla += "<td>" + rec['SITUACION'] + "</td>";
	    tabla += "</tr>";
	}
	tabla += "</table>";
	// Pintar la tabla
	div.html( tabla );
}

function SUNARP_AJAX(div,mensaje){
	//alert("SUNARP_AJAX");
	var html = "<div>";
	html += "<img src='img/ajax.gif'>";
	html += "<label>" + mensaje + "</label>";
	html += "</div>";
	div.html( html );
}