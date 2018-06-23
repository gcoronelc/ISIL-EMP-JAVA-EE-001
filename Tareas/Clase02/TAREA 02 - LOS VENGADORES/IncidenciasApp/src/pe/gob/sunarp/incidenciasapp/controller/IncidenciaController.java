
package pe.gob.sunarp.incidenciasapp.controller;

import java.util.List;
import pe.gob.sunarp.incidenciasapp.dto.IncidenteDto;
import pe.gob.sunarp.incidenciasapp.service.contrato.IncidenciaService;
import pe.gob.sunarp.incidenciasapp.service.implementacion.IncidenciaServiceImpl;


public class IncidenciaController {
    
    
    private IncidenciaService incidenciaService;

    public IncidenciaController() {
        incidenciaService = new IncidenciaServiceImpl();
    }
    
    //servicio 1
    public int RegistrarIncidencia(IncidenteDto dto){
    
        return incidenciaService.RegistrarIncidencia(dto);
    }
    
    //servicio 2
    public String[] getListaTipos(){
    
        return incidenciaService.getListaTipos();
    }
    
    //servicio 3
    public List<IncidenteDto> ConsultarResumenIncidencia(String fecha){
        
        return incidenciaService.ConsultarResumenIncidencia(fecha);
    }
    
    //servicio 4
    public List<IncidenteDto> CantidadIncidenciaxTipo(String tipo){
        
        return incidenciaService.CantidadIncidenciaxTipo(tipo);
    }
}
