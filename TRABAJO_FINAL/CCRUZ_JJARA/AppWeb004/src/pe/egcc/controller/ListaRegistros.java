package pe.egcc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import pe.egcc.eureka.service.PartidaService;

public class ListaRegistros {

	public List<Map<String, ?>> getItems() {

		// Proceso
		PartidaService partidaService;
		partidaService = new PartidaService();
		List<Map<String, ?>> lista = partidaService.listarTipoRegistos();
				
		return lista;

	}

}
