package pe.ccruz.trabajoseguroapp.service.implementacion;

import java.util.ArrayList;
import java.util.List;
import pe.ccruz.trabajoseguroapp.dto.BitacoraDto;
import pe.ccruz.trabajoseguroapp.service.contrato.IncidenciaService;

/**
 *
 * @author developer
 */
public class IncidenciaServiceImpl implements IncidenciaService{

    @Override
    public String[] getListaIncidencias() {
      return DataIncidencia.arregloIndicencia;
    }

    @Override
    public int registraIncidencia(BitacoraDto dto) {
        DataIncidencia.incidencias.add(dto);
        return 1;
    }

    @Override
    public List<BitacoraDto> getIncidencias(String codIncidencia) {
        List<BitacoraDto> lista2 = new ArrayList<>();
        
        for(BitacoraDto dto: DataIncidencia.incidencias){
            if(dto.getCodIncidencia().endsWith(codIncidencia)){
                lista2.add(dto);
            }
                
        }
        return lista2;
    }
    
}
