package pe.gob.sunarp.adm.prueba;

import java.util.List;
import java.util.Map;
import pe.gob.sunarp.adm.service.LOGINService;

public class P2Login {

    public static void main(String[] args) {

        // Datos
        String usuario = "BNIEVA";
        String clave = "BNIEVA";

        // Proceso
        LOGINService service = new LOGINService();
        List<Map<String, ?>> lista = service.login(usuario, clave);

        // Reporte
        if (service.getCode() == 1) {
            for (Map<String, ?> map : lista) {
                System.out.println(
                        map.get("CO_EMPL") + "\t"
                        + map.get("DESC_AREA") + "\t"
                        + map.get("USU_SIST") + "\t"
                        + map.get("DESC_CARGO") + "\t"
                        + map.get("EST_EMPL") + "\t"
                        + map.get("APE_PAT") + "\t"
                        + map.get("APE_MAT") + "\t"
                        + map.get("NOMBRE") + "\t"
                        + map.get("DNI") + "\t"
                        + map.get("FEC_MOD")
                );
            }
        } else {
            System.err.println(service.getMensaje());
        }

    }
}
