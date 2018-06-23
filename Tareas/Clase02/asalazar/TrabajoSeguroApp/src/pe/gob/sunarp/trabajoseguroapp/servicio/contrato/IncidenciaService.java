package pe.gob.sunarp.trabajoseguroapp.servicio.contrato;

import java.util.List;
import pe.gob.sunarp.trabajoseguroapp.dto.IncidenciaDto;

public interface IncidenciaService {
    
    String[][] getListaIncidencias();
    
    int registrarIncidencia( IncidenciaDto incidenciaDto);
    
    List<IncidenciaDto> getIncidencias(String codigo);

}
