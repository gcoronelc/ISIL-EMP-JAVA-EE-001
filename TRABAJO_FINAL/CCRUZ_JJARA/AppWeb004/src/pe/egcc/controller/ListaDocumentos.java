package pe.egcc.controller;

import java.util.List;
import java.util.Map;

import pe.egcc.eureka.service.PropietarioService;

public class ListaDocumentos {
	
	public List<Map<String, ?>> getItems() {

		// Proceso
		PropietarioService propService = new PropietarioService();
		List<Map<String, ?>> lista = propService.listarTipoDocu();
		return lista;

	}

}
