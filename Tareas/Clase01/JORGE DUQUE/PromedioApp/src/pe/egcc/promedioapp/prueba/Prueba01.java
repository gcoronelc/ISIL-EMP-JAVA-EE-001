/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.egcc.promedioapp.prueba;

import pe.egcc.promedioapp.dto.PromedioDto;
import pe.egcc.promedioapp.service.PromedioService;

/**
 *
 * @author bnieva
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // Datos
    PromedioDto dto = new PromedioDto(15,15,05, 15,15,17);
    
    // Proceso
    PromedioService promedioService = new PromedioService();
    dto = promedioService.calcularPromedio(dto);
    
    // Reporte
    System.out.println("P1: " + dto.getP1());
    System.out.println("P2: " + dto.getP2());
    System.out.println("P3: " + dto.getP3());
    System.out.println("P4: " + dto.getP4());
    System.out.println("ex. PAR: " + dto.getExp());
    System.out.println("ex. FINAL: " + dto.getExf());
    System.out.println("Prom. Pract: " + dto.getPromp());
    System.out.println("Prom. Final: " + dto.getPromf());
    
    
    }
    
}
