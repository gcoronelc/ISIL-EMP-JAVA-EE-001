
package pe.egcc.planocartesianoapp.prueba;

import pe.egcc.planocartesianoapp.dto.PlanoCartesianoDto;
import pe.egcc.planocartesianoapp.service.PlanoCartesianoService;

public class Prueba01 {

    public static void main(String[] args) {
        double distancia;
        String cuadrante;
        PlanoCartesianoDto dto = new PlanoCartesianoDto(-1.0,10.0 ,3 , -1);
        PlanoCartesianoService pcService = new PlanoCartesianoService();
        dto = pcService.mostrarCuadrante(dto);
        distancia= pcService.calcularDistancia(dto);
        
        System.out.println("Cuadrante A: " + dto.getCuadrantea() +" - ("+dto.getX1()+" , "+dto.getY1()+")");
        System.out.println("Cuadrante B: " + dto.getCuadranteb() +" - ("+dto.getX2()+" , "+dto.getY2()+")");
        System.out.println("La Distancia es: " + String.format("%.2f",distancia));
        
        
    }
    
}
