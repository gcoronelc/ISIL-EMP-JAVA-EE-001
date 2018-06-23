
package pe.gob.sunarp.trabajoseguroapp.controller;

import java.util.List;
import pe.gob.sunarp.trabajoseguroapp.dto.IncidenciaDto;
import pe.gob.sunarp.trabajoseguroapp.servicio.contrato.IncidenciaService;
import pe.gob.sunarp.trabajoseguroapp.servicio.implementacion.IncidenciaServiceImpl;

public class IncidenciaController {

  private IncidenciaService incidenciaService;

  public IncidenciaController() {
    incidenciaService = new IncidenciaServiceImpl();
  }
  
  public String[][] getListaIncidencias(){
    return incidenciaService.getListaIncidencias();
  }

  public void registrarIncidencia(IncidenciaDto dto) {
    incidenciaService.registrarIncidencia(dto);
  }

  public List<IncidenciaDto> getIncidencias(String codigo) {
    return incidenciaService.getIncidencias(codigo);
  }
  
}
