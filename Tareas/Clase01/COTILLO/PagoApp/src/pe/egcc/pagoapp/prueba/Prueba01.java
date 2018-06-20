/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.service.PagoService;

/**
 *
 * @author Alumno-CT
 */
public class Prueba01 {

    public static void main(String[] args) {

        //Datos
        PagoDto dto = new PagoDto(100, 100, 100.50);

        //Proceso
        PagoService pagoService = new PagoService();
        dto = pagoService.calcularPago(dto);

        //Reporte
        System.out.println("Ingresos : " + dto.getIngreso());
        System.out.println("Renta: " + dto.getRenta());
        System.out.println("Neto: " + dto.getNeto());

    }

}
