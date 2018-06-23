package pe.ccruz.trabajoseguroapp.service.implementacion;

import java.util.ArrayList;
import java.util.List;
import pe.ccruz.trabajoseguroapp.dto.BitacoraDto;

/**
 *
 * @author developer
 */
class DataIncidencia {
    
private DataIncidencia(){
    
}

/**
 * Variables con alcance de clase
 */
static String[] arregloIndicencia;
static List<BitacoraDto> incidencias;

/**
 * Inicializador estático
 */

static{
    arregloIndicencia = new  String[] {"Normal", "Cotidiano", "Importante","Urgente","Alarma"};
    incidencias = new ArrayList<>();
}


    
}
