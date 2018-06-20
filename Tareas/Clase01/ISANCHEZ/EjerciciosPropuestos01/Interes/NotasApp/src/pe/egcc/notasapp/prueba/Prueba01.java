
package pe.egcc.notasapp.prueba;

import pe.egcc.notasapp.dto.ExamenDto;
import pe.egcc.notasapp.dto.NotasDto;
import pe.egcc.notasapp.service.NotasService;


public class Prueba01 {

    
    public static void main(String[] args) {
         //DATOS
         double promedio;
         double promediofinal;
        NotasDto notamedto = new NotasDto(14.0,20.0,6.0,4.0);
        ExamenDto  exDto = new ExamenDto(14.0,15.0);
        
        //PROCESO
        NotasService notaService = new NotasService();
        
        notamedto = notaService.calcularMenorNotasPracticas(notamedto);
        promedio = notaService.calcularPromedioPracticas(notamedto);
        promediofinal = notaService.calcularPromedioFinal(notamedto,exDto);
        
        //REPORTE
        System.out.println("La menor nota es: " + notamedto.getMenornota());
        System.out.println("El promedio de las practicas es: " +promedio);
        System.out.println("El promedio final es: " +promediofinal);
        
        
    }
    
}
