var divClientes;
var div00100001;
var div00100002;	
var div00200001;
var div00300002;

$(document).ready(function () {

	divClientes = $("#divClientes");
	
	
	div00100001 = $("#div00100001");
	div00100002 = $("#div00100002");
	div00100003 = $("#div00200001");
	div00100004 = $("#div00200002");

	$("#btnConsultar").click(SUNARP_BtnConsultar);

	
});

function SUNARP_BtnConsultar(){
	
  // Clientes
  var url = "ConsultarClientes";
  var data = "paterno=&materno=&nombre=";
  var mensaje = "Consultando datos de los clientes.";
  SUNARP_LoadPage(url,data,divClientes,mensaje);
  
  // Consultar Cuentas
  SUNARP_ConsultarMovimientos("00100001");
  SUNARP_ConsultarMovimientos("00100002");
  SUNARP_ConsultarMovimientos("00200001");
  SUNARP_ConsultarMovimientos("00200002");
};

function SUNARP_ConsultarMovimientos( cuenta ){
  var url = "ConsultarMovimientos";
  var data = "cuenta=" + cuenta;
  var mensaje = "Consultando movimientos de la cuenta " + cuenta + ".";
  var div = $("#div" + cuenta);
  SUNARP_LoadPage(url, data, div, mensaje);
}