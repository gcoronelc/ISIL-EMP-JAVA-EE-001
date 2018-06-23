

package pe.gob.sunarp.incidenciasapp.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.gob.sunarp.incidenciasapp.dto.IncidenteDto;
import pe.gob.sunarp.incidenciasapp.service.contrato.IncidenciaService;
import pe.gob.sunarp.incidenciasapp.service.implementacion.IncidenciaServiceImpl;


public class Prueba03 {


    public static void main(String[] args) {
        
           //variables
        IncidenciaService incidenciaService = new IncidenciaServiceImpl();
        List<IncidenteDto> l = new ArrayList<>();
        
        //proceso        
        incidenciaService.RegistrarIncidencia(new IncidenteDto("NORMAL","gggggggg","20180621"));
        incidenciaService.RegistrarIncidencia(new IncidenteDto("NORMAL","xxxxxxxxx","20180621"));
        incidenciaService.RegistrarIncidencia(new IncidenteDto("NORMAL","rrrrrrrrrr","20180621"));
        incidenciaService.RegistrarIncidencia(new IncidenteDto("NORMAL","eeeeeeeeeee","20180621"));
        incidenciaService.RegistrarIncidencia(new IncidenteDto("COTIDIANO","fffffff","20180620"));
        
        l = incidenciaService.CantidadIncidenciaxTipo("COTIDIANO");
        
        for (IncidenteDto x : l) {
               System.out.println(x.getDescrip() + "\t" 
              + x.getTipo() + "\t" + x.getFecha_pres() + "\t" + x.getFecha());
          }
    }
    
}
