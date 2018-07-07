package pe.egcc.eureka.prueba;

import java.util.List;
import pe.egcc.eureka.dto.ClienteDto;
import pe.egcc.eureka.service.ClienteService;

public class Prueba02 {
  
  public static void main(String[] args) {
    
    // Datos
    String paterno = "C";
    String materno = "";
    String nombre = "";
    
    // Proceso
    ClienteService clienteService = new ClienteService();
    List<ClienteDto> lista = clienteService.getClientes(paterno, materno, nombre);
    
    // Reporte
    if( clienteService.getCode() == 1){
      for (ClienteDto dto : lista) {
        System.out.println(dto.getNombre() + " - " + dto.getPaterno() + " - " + dto.getMaterno());
      }
    } else {
      System.err.println(clienteService.getMensaje());
    }
    
  }
}
