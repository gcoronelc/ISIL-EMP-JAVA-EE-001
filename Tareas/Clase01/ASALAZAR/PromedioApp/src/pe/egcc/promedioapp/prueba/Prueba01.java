package pe.egcc.promedioapp.prueba;

import pe.egcc.promedioapp.dto.PromedioDTO;
import pe.egcc.promedioapp.service.PromedioService;

public class Prueba01 {

    public static void main(String[] args) {

         PromedioService ps = new PromedioService();
         
         PromedioDTO promedioDto = new PromedioDTO();
         
         promedioDto.setPractica1(17.5);
         promedioDto.setPractica2(11.5);
         promedioDto.setPractica3(12.3);
         promedioDto.setPractica4(17.5);
         
         promedioDto.setEparcial(14);
         promedioDto.setEfinal(15.20);
         
         
        promedioDto = ps.calculaPromedio(promedioDto);
        
        System.out.println("El Promedio Final es: " + promedioDto.getPromedioFinal());
        
         
    }
    

}
