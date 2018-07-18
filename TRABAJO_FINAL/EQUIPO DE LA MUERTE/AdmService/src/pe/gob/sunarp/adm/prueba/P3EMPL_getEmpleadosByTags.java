package pe.gob.sunarp.adm.prueba;

import java.util.List;
import java.util.Map;
import pe.gob.sunarp.adm.service.EMPLEADOService;

public class P3EMPL_getEmpleadosByTags {

    public static void main(String[] args) {

        // Datos
        String paterno ="";
        String materno="";
        String nombre="AD";
        // Proceso
        EMPLEADOService service = new EMPLEADOService();
        List<Map<String, ?>> lista = service.getEmpleadosByTags(paterno,materno,nombre);

        // Reporte
        if (service.getCode() == 1) {
            for (Map<String, ?> map : lista) {
                System.out.println(
                        map.get("CO_EMPL") + "\t"
                        + map.get("APE_PAT") + "\t"
                        + map.get("APE_MAT") + "\t"
                        + map.get("NOMBRE") + "\t"
                        + map.get("EST_EMPL") + "\t"
                        + map.get("USU_SIST") + "\t"
                        + map.get("DESC_CARGO") + "\t"
                        + map.get("DNI") + "\t"
                        + map.get("FEC_MOD")
                );
            }
        } else {
            System.err.println(service.getMensaje());
        }

    }
}
