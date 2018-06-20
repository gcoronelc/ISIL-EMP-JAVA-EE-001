
package pe.egcc.importeapp.prueba;

import pe.egcc.importeapp.dto.ImporteDto;
import pe.egcc.importeapp.service.ImporteService;


public class ImportePrueba {

    public static void main(String[] args) {
        ImporteDto dto = new ImporteDto(15.0,8);
        double total;
        double neto;
        double impuesto;
        ImporteService importeService = new ImporteService();
        
       neto =  importeService.calcularImporte(dto);
       impuesto = importeService.calcularImpuesto(dto);
       total = importeService.calcularTotal(dto);
       
        System.out.println("NETO: " +neto);
        System.out.println("IMPUESTO: "+impuesto);
        System.out.println("Total: "+total);
    }
    
}
