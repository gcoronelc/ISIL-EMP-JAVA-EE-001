
package pe.gob.sunarp.incidenciasapp.controller;

import java.util.List;
import pe.gob.sunarp.incidenciasapp.dto.IncidenciaDto;
import pe.gob.sunarp.incidenciasapp.service.contrato.IncidenciaService;
import pe.gob.sunarp.incidenciasapp.service.implementacion.IncidenciaServiceImplementacion;


public class IncidenciaController {
    private IncidenciaService controlador;

    public IncidenciaController() {
        controlador = new IncidenciaServiceImplementacion();
    }

    
    
    /**
     * Retornar un arreglo con la lista de los nombres de los incidentes
     * @return 
     */
    public String[] getListaNombre(){
      return controlador.getListaNombre();
    };
    /**
     * Registrar la incidencia 
     * @param dto objeto de la clase IncedienciaDto
     * @return OK:1  ERROR:-1
     */
    public void registrarIncidencia(IncidenciaDto dto){
       controlador.registrarIncidencia(dto);
    };
    
    /**
     * Muestra los incidentes segun el tipo de incidencia
     * @param tipo
     * @return 
     */
     public List<IncidenciaDto> getIncidente(String tipo) {
              
        return controlador.getIncidente(tipo);
    }
    
}
