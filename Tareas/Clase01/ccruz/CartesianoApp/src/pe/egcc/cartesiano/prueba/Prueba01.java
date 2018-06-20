/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.cartesiano.prueba;

import pe.egcc.cartesiano.dto.CartesianoDto;
import pe.egcc.cartesiano.service.CartesianoService;

/**
 *
 * @author developer
 */
public class Prueba01 {
    
    public static void main(String[] args) {
        
        // Datos
        CartesianoDto dto = new CartesianoDto(-1, 1, 2, 2);
        
        // Proceso
        CartesianoService cartesianoService = new CartesianoService();
        dto = cartesianoService.obtenerCuadrante1(dto);
        dto = cartesianoService.obtenerCuadrante2(dto);
        dto = cartesianoService.obtenerDistancia(dto);
        
         // Reporte
        System.out.println("X1 .. Y1: " + dto.getCuadrante1());
        System.out.println("X2 .. Y2: " + dto.getCuadrante2());
        System.out.println("La distancia es: " + dto.getDistancia());
        
    }
    
    
}
