package pe.egcc.eureka.prueba;

import java.util.List;
import java.util.Map;
import pe.egcc.eureka.dto.ClienteDto;
import pe.egcc.eureka.service.ClienteService;
import pe.egcc.eureka.service.CuentaService;

public class Prueba03 {
  
  public static void main(String[] args) {
    
    // Datos
    String cuenta = "00100001";
    
    // Proceso
    CuentaService service = new CuentaService();
    List<Map<String,?>> lista = service.traerMovimientos(cuenta);
    
    // Reporte
    if( service.getCode() == 1){
      for (Map<String, ?> map : lista) {
        System.out.println(
                map.get("MOVINUMERO") + "\t"
                + map.get("MOVIIMPORTE")
        );
      }
    } else {
      System.err.println(service.getError());
    }
    
  }
}
