
package pe.gob.sunarp.incidenciasapp.service.implementacion;

import java.util.ArrayList;
import java.util.List;
import pe.gob.sunarp.incidenciasapp.dto.IncidenciaDto;

 class DataIncidencia {

    public DataIncidencia() {
    }
   
    
    /**
     * VARIABLES CON ALCANCE ESTATICO
     */
    static String[] arregloNombre;
    static List<IncidenciaDto> incidencias;
    
    
    static {
     arregloNombre = new String[] {"Normal","Cotidiano","Importante","Urgente","Alarma"};
     incidencias   = new ArrayList<>();
             
    }
}
