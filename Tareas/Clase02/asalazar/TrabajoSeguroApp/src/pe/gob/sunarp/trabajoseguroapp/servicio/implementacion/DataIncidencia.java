package pe.gob.sunarp.trabajoseguroapp.servicio.implementacion;

import java.util.ArrayList;
import java.util.List;
import pe.gob.sunarp.trabajoseguroapp.dto.IncidenciaDto;

class DataIncidencia {

    private DataIncidencia() {
    }

    static String[][] arregloIncidenciasCode = new String[5][3];
    static List<IncidenciaDto> incidencias;

    /**
     * Inicializador estático
     */
    static {

        arregloIncidenciasCode[0][0] = "100";
        arregloIncidenciasCode[0][1] = "Normal";
        arregloIncidenciasCode[0][2] = "Se pueden resolver durante la semana.";

        arregloIncidenciasCode[1][0] = "200";
        arregloIncidenciasCode[1][1] = "Cotidiano";
        arregloIncidenciasCode[1][2] = "Se deben resolver en el transcurso del día.";

        arregloIncidenciasCode[2][0] = "300";
        arregloIncidenciasCode[2][1] = "Importante";
        arregloIncidenciasCode[2][2] = "Necesita ser resuelta lo antes posible, incluso antes que lo cotidiano y "
                + "durante el día.";

        arregloIncidenciasCode[3][0] = "400";
        arregloIncidenciasCode[3][1] = "Urgente";
        arregloIncidenciasCode[3][2] = "Necesita ser resuelta ahora mismo.";
        

        arregloIncidenciasCode[4][0] = "500";
        arregloIncidenciasCode[4][1] = "Alarma";
        arregloIncidenciasCode[4][2] = "Es la prioridad mas alta, y necesita ser resuelta ahora mismo, incluso "
                + "dejando de hacer las incidencias urgentes.";

        incidencias = new ArrayList<>();

    }

}
