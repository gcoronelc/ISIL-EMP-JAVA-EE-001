package pe.gob.sunarp.trabajoseguroapp.servicio.implementacion;

import java.util.ArrayList;
import java.util.List;
import pe.gob.sunarp.trabajoseguroapp.dto.IncidenciaDto;
import pe.gob.sunarp.trabajoseguroapp.servicio.contrato.IncidenciaService;

public class IncidenciaServiceImpl implements IncidenciaService {

    @Override
    public String[][] getListaIncidencias() {
        return DataIncidencia.arregloIncidenciasCode;
    }

    @Override
    public int registrarIncidencia(IncidenciaDto incidenciaDto) {
        DataIncidencia.incidencias.add(incidenciaDto);
        return 1;
    }

    @Override
    public List<IncidenciaDto> getIncidencias(String codigo) {
        List<IncidenciaDto> listaIncidencias = new ArrayList<>();
        for (IncidenciaDto dto : DataIncidencia.incidencias) {
            if (dto.getCodigo().equals(codigo)) {
                listaIncidencias.add(dto);
            }
        }
        return listaIncidencias;
    }

}
