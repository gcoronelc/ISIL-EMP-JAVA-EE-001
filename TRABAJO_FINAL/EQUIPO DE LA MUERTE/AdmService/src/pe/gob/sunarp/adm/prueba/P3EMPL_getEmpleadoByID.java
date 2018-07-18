package pe.gob.sunarp.adm.prueba;

import java.util.List;
import java.util.Map;
import pe.gob.sunarp.adm.service.EMPLEADOService;

public class P3EMPL_getEmpleadoByID {

    public static void main(String[] args) {

        // Datos

        String co_empl="000001";
        // Proceso
        EMPLEADOService service = new EMPLEADOService();
        Map<String, ?> lista = service.getEmpleadoByID(co_empl);

        // Reporte
        if (service.getCode() == 1) {
            //for (Map<String, ?> map : lista) {
                System.out.println(
                        lista.get("CO_EMPL") + "\t"
                        /*+ map.get("APE_PAT") + "\t"
                        + map.get("APE_MAT") + "\t"
                        + map.get("NOMBRE") + "\t"
                        + map.get("EST_EMPL") + "\t"
                        + map.get("USU_SIST") + "\t"
                        + map.get("DESC_CARGO") + "\t"
                        + map.get("DNI") + "\t"
                        + map.get("FEC_MOD")*/
                );
            //}
        } else {
            System.err.println("Mensaje de error: "+service.getMensaje());
        }

    }
}
