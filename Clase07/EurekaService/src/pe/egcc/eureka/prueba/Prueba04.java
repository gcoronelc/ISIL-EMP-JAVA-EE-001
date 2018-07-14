package pe.egcc.eureka.prueba;

import java.util.List;
import java.util.Map;
import pe.egcc.eureka.service.CuentaService;

public class Prueba04 {
  
  public static void main(String[] args) {
    
    // Datos
    String cuenta = "00100001";
    String codEmpleado = "0003";
    double importe = 100.0;
    String clave = "123456";
    
    // Proceso
    CuentaService service = new CuentaService();
    service.procRetiro(cuenta, clave, importe, codEmpleado);
        
    // Reporte
    if( service.getCode() == 1){
      System.out.println(service.getMensaje());
    } else {
      System.err.println(service.getMensaje());
    }
    
  }
}
