
package pe.egcc.importeapp.service;

import pe.egcc.importeapp.dto.ImporteDto;

public class ImporteService {
    public double calcularImporte(ImporteDto dto) {
       double neto;
       
       
       neto = dto.getCantidad() * dto.getPrecio();
       
       return neto;
    }
    
    public double calcularImpuesto(ImporteDto dto){
          double calimpuesto;
          
          calimpuesto = calcularImporte(dto)*0.18;
           
        return calimpuesto;
    }
    
    public double calcularTotal(ImporteDto dto){
       double total;
           total = calcularImporte(dto) + calcularImpuesto(dto);
       return total;
    }
}
