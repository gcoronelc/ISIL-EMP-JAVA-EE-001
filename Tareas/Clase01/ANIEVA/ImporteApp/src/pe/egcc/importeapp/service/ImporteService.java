

package pe.egcc.importeapp.service;

import pe.egcc.importeapp.dto.ImporteDto;


public class ImporteService {
    
    
    //servicio 1
    public ImporteDto calcularImporte(ImporteDto dto){
        
        //variable
        double imp = 0;
        double base = 0;
        
        base = (1 + dto.getInteres());
        imp = dto.getCapital() *  Math.pow(base,dto.getPeriodo());
        
        //reporte
        dto.setImporte(imp);
        
    
        return dto;
    }
    
}
