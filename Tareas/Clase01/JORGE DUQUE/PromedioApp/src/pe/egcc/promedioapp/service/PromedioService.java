

package pe.egcc.promedioapp.service;

import pe.egcc.promedioapp.dto.PromedioDto;
import pe.egcc.promedioapp.utilitarios.Min;


public class PromedioService {
    
    
    //servicio 1
     public double calcularPromedioP(PromedioDto dto){
    
     //varible
      Min min = new Min();  
      double pmin ;
      double suma =0;  
      double promp = 0;
     
      
     
     //proceso
      pmin =  min.minimo(dto.getP1(),dto.getP2(),dto.getP3(),dto.getP4());
      suma = dto.getP1() + dto.getP2() + dto.getP3() + dto.getP4();
      suma = suma - pmin;
      promp = suma / 3;
      
         
         
     //reporte
      dto.setPromp(promp);
      
    
       return promp;
    
  }
   
   //servicio 2
    public  PromedioDto calcularPromedio(PromedioDto dto){
    
    //variable
    double promt = 0; 

   //proceso
    promt = dto.getExp() * 0.25 + dto.getExf() * 0.5 + calcularPromedioP(dto) * 0.25; 
   
        
    //reporte
    dto.setPromf(promt);  
    dto.setPromp(calcularPromedioP(dto));
        
    return dto;
    }
     
}
