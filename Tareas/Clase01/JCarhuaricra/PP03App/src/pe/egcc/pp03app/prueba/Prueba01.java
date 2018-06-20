/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pp03app.prueba;

import pe.egcc.pp03app.dto.PP03Dto;
import pe.egcc.pp03app.service.PP03Service;

/**
 *
 * @author Andy3
 */
public class Prueba01 {

    public static void main(String[] args) {
        //Datos
        PP03Dto pP03Dto = new PP03Dto(50.555, 10);
        PP03Service service = new PP03Service();
        pP03Dto = service.calcularTotal(pP03Dto);

        //Reporte
        System.out.println("Importe de la venta: " + pP03Dto.getImporte());
        System.out.println("Impuesto: " + pP03Dto.getImpuesto());
        System.out.println("Total: " + pP03Dto.getTotal());
    }
}
