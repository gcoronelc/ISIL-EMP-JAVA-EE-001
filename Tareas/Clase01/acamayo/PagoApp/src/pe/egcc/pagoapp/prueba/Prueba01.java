
package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.service.PagoService;

public class Prueba01 {

    public static void main(String[] args) {
        //datos
        
        PagoDto dto = new PagoDto(6,20,120.0);
        
        //proceso
        PagoService pagoService = new PagoService();
        dto = pagoService.calcularPago(dto);
        
        // reporte
        
        System.out.println("Ingresos:" + String.format("%.2f",dto.getIngresos()));
        System.out.println("Renta:" + String.format("%.2f",dto.getRenta()));
        System.out.println("Neto:" + String.format("%.2f",dto.getNeto()));
     
        
    }
}
