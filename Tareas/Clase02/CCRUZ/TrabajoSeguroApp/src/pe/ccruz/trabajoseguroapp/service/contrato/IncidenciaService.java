package pe.ccruz.trabajoseguroapp.service.contrato;

import java.util.List;
import pe.ccruz.trabajoseguroapp.dto.BitacoraDto;

/**
 *
 * @author developer
 */
public interface IncidenciaService {
    
    /**
     * @return  Un arreglo de la lista de tipos de incidencia
     */
    String[] getListaIncidencias();
    
    /**
     * Registra una indicencia
     * @param dto Objeto con los datos de la incidencia
     * @return 1: Ok -1: Error
     */
    int registraIncidencia(BitacoraDto dto);
    
    /**
     * Retorna las incidencias por tipo de incidencia
     * @param codIncidencia codigo del tipo de incidencia
     * @return lista de incidencias
     */
    List<BitacoraDto> getIncidencias(String codIncidencia);
}
