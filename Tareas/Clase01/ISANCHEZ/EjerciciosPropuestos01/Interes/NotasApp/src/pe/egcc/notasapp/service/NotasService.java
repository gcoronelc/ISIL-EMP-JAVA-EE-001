
package pe.egcc.notasapp.service;

import pe.egcc.notasapp.dto.ExamenDto;
import pe.egcc.notasapp.dto.NotasDto;

public class NotasService {
    
        
    public NotasDto calcularMenorNotasPracticas(NotasDto notamedto){
         double menornota =9999;
       if( notamedto.getNota1() < menornota){
           menornota = notamedto.getNota1();         
       }
       
       if(notamedto.getNota2() < menornota){
          menornota = notamedto.getNota2();
       }
       
       if(notamedto.getNota3() < menornota){
           menornota = notamedto.getNota3();
       }
       
       if(notamedto.getNota4()< menornota){
         menornota = notamedto.getNota4();
       }
       
       
       
        //Reporte
        notamedto.setMenornota(menornota);
    return notamedto;
    }
    
    public double calcularPromedioPracticas(NotasDto dto){
         double prompractica;
         
         
         prompractica= ((dto.getNota1()+dto.getNota2()+dto.getNota3()+dto.getNota4())- dto.getMenornota())/3;
         
        
        return prompractica;
    }
    
    public double calcularPromedioFinal(NotasDto dto, ExamenDto exDto){
         
         double promediototal;
         
        
         promediototal = (calcularPromedioPracticas(dto)*0.25) + (exDto.getNotaep()*0.25)+ (exDto.getNotaef()*0.50);
        
        return promediototal;
    }
}
