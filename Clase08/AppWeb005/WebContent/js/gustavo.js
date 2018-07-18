/*
 * 
 */
function GUSTAVO_LoadPage(url, div, mensaje){
	SUNARP_AJAX(div, mensaje);
	$.get(url, function(response){
		setTimeout(function(){
			div.html(response);
		},3000);
	});
}

/*
 * 
 */
function SUNARP_LoadPage(url, data, div, mensaje){
	SUNARP_AJAX(div, mensaje);
	$.get(url, data, function(arreglo){
		setTimeout(function(){
			SUNARP_PintarArreglo(div,arreglo);
		},3000);
	});
}

/*
 * 
 */
function SUNARP_PintarArreglo(div, arreglo){
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

/*
 * 
 */
function SUNARP_AJAX(div,mensaje){
	var html = "<div>";
	html += "<img src='img/ajax.gif'>";
	html += "<label>" + mensaje + "</label>";
	html += "</div>";
	div.html( html );
}