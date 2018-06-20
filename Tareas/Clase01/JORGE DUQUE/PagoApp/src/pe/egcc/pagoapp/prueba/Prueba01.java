
package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.service.PagoService;


public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Datos
    PagoDto dto = new PagoDto(6, 20, 120.0);
    
    // Proceso
    PagoService pagoService = new PagoService();
    dto = pagoService.calcularPago(dto);
    
    // Reporte
    System.out.println("Ingresos: " + dto.getIngresos());
    System.out.println("Renta: " + dto.getRenta());
    System.out.println("Neto: " + dto.getNeto());
    }
    
}
