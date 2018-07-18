package pe.egcc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import pe.egcc.eureka.service.PartidaService;

public class ListaOficinas {

	public List<Map<String, ?>> getItems() {

		// Proceso
		PartidaService partidaService;
		partidaService = new PartidaService();
		List<Map<String, ?>> lista = partidaService.listarOficinas();
		return lista;

	}

}
