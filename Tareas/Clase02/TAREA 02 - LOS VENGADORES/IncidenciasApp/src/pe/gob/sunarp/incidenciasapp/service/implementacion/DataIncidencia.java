
package pe.gob.sunarp.incidenciasapp.service.implementacion;

import java.util.ArrayList;
import java.util.List;
import pe.gob.sunarp.incidenciasapp.dto.IncidenteDto;

public class DataIncidencia {

    public DataIncidencia() {
    }
    
    static String[]  arregloTipos; // = {"JAVA", "ORACLE", "SPRING"};
    static List<IncidenteDto> incidencias;
    
    static{
  
        arregloTipos = new String[] {"NORMAL", "COTIDIANO", "IMPORTANTE","URGENTE","ALARMA"};
        incidencias = new ArrayList<>();
  
    }
    
}
