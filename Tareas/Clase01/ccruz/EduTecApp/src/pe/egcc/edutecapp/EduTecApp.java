/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.edutecapp;

import pe.egcc.edutecapp.dto.EduTecDto;
import pe.egcc.edutecapp.service.EduTecService;

/**
 *
 * @author developer
 */
public class EduTecApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EduTecDto dto;
        dto = new EduTecDto(10, 10, 10, 9, 15, 15);
        
        EduTecService eduService = new EduTecService();
        
        eduService.calcularPromTotal(dto);

        System.out.println("Prom. del Alumno: " + dto.getPromedioFinal());
        
    }
    
}
