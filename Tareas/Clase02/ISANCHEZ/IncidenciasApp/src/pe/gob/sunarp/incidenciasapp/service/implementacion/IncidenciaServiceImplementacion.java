
package pe.gob.sunarp.incidenciasapp.service.implementacion;

import java.util.ArrayList;
import java.util.List;
import pe.gob.sunarp.incidenciasapp.dto.IncidenciaDto;
import pe.gob.sunarp.incidenciasapp.service.contrato.IncidenciaService;


public class IncidenciaServiceImplementacion implements IncidenciaService{

    @Override
    public void registrarIncidencia(IncidenciaDto dto) {
          ingresarIncidente(dto);
          DataIncidencia.incidencias.add(dto);
          
    }

    private void ingresarIncidente(IncidenciaDto dto) {
        dto.setCodigo(dto.getCodigo());
        dto.setNombre(dto.getNombre());
        dto.setDetalle(dto.getDetalle());
        dto.setIncidente(dto.getIncidente());
    }

    @Override
    public String[] getListaNombre() {
        return DataIncidencia.arregloNombre;
    }

    @Override
    public List<IncidenciaDto> getIncidente(String tipo) {
        List<IncidenciaDto> lista2 = new ArrayList<>();
        for(IncidenciaDto dto : DataIncidencia.incidencias){
          if(dto.getNombre().equals(tipo)){
            lista2.add(dto);
          }
        }
        return lista2;
    }
    
}
