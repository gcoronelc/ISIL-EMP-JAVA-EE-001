
package pe.gob.sunarp.incidenciasapp.prueba;

import pe.gob.sunarp.incidenciasapp.dto.IncidenciaDto;
import pe.gob.sunarp.incidenciasapp.service.contrato.IncidenciaService;
import pe.gob.sunarp.incidenciasapp.service.implementacion.IncidenciaServiceImplementacion;


public class Prueba01 {

   
    public static void main(String[] args) {
        String datos;
        IncidenciaDto incidencia = new IncidenciaDto(100, "Normal", "Se puede resolver en la semana", "Solicita Agregar Reporte de Publicidad");
        IncidenciaService incidenciaService = new IncidenciaServiceImplementacion();
        
        String[] listanombre = incidenciaService.getListaNombre();
        for(String tipo : listanombre){
            System.out.println(tipo);
        }
        incidenciaService.registrarIncidencia(incidencia);
        
      //  System.out.println("Datos: "+incidenciaService.registrarIncidencia(incidencia));
    }
    
}
