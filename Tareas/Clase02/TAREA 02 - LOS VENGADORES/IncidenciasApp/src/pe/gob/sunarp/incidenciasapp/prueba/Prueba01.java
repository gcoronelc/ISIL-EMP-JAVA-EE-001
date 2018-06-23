

package pe.gob.sunarp.incidenciasapp.prueba;

import pe.gob.sunarp.incidenciasapp.dto.IncidenteDto;
import pe.gob.sunarp.incidenciasapp.service.contrato.IncidenciaService;
import pe.gob.sunarp.incidenciasapp.service.implementacion.IncidenciaServiceImpl;


public class Prueba01 {

   
    public static void main(String[] args) {
        
        //variable
        IncidenciaService incidenciaService = new IncidenciaServiceImpl();
            IncidenteDto incidenteDto = new IncidenteDto("NORMAL","gggggggg","20180621");
        
        //proceso
        incidenciaService.RegistrarIncidencia(incidenteDto);
        
        //reporte
        System.out.println(incidenteDto.getDescrip() + "\t" 
              + incidenteDto.getTipo() + "\t" + incidenteDto.getFecha_pres() + "\t" + incidenteDto.getFecha());
                
       
    }
    
}
