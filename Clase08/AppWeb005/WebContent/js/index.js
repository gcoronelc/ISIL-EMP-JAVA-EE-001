var divContenido;

$(document).ready(function () {
	
	divContenido = $("#divContenido");
	
	$("#btnConsultas").click(fnPaginaConsultas);
	$("#btnTransacciones").click(fnPaginaTransacciones);
	
	
});


function fnPaginaConsultas(){
	GUSTAVO_LoadPage("consulta.jsp", divContenido, "Cargando página." );
}

function fnPaginaTransacciones(){
	GUSTAVO_LoadPage("transaccion.jsp", divContenido, "Cargando página." );
}