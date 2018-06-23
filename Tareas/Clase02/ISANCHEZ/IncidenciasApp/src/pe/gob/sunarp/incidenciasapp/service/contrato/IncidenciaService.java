
package pe.gob.sunarp.incidenciasapp.service.contrato;

import java.util.List;
import pe.gob.sunarp.incidenciasapp.dto.IncidenciaDto;

public interface IncidenciaService {
    /**
     * Retornar un arreglo con la lista de los nombres de los incidentes
     * @return 
     */
    String[] getListaNombre();
    /**
     * Registrar la incidencia 
     * @param dto objeto de la clase IncedienciaDto
     * @return OK:1  ERROR:-1
     */
    void registrarIncidencia(IncidenciaDto dto);
    
    /**
     * Muestra los incidentes segun el tipo de incidencia
     * @param tipo
     * @return 
     */
    List<IncidenciaDto> getIncidente(String tipo);
}
