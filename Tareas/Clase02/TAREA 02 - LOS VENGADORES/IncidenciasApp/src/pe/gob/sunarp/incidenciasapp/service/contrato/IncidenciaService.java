

package pe.gob.sunarp.incidenciasapp.service.contrato;

import java.util.List;
import pe.gob.sunarp.incidenciasapp.dto.IncidenteDto;


public interface IncidenciaService {
    
    public int RegistrarIncidencia(IncidenteDto dto);
    
    public String[] getListaTipos();
    
    public List<IncidenteDto> ConsultarResumenIncidencia(String fecha);
    
    public List<IncidenteDto> CantidadIncidenciaxTipo(String tipo);
    

    
    
}
