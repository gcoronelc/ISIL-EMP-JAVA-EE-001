/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.egcc.pedidoapp.prueba;

import pe.egcc.pedidoapp.service.PedidoService;

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
    double importe = 1000.0;
    
    // Proceso
    PedidoService pedidoService = new PedidoService();
    double impuesto = pedidoService.calcularImpuesto(importe);
    double total = pedidoService.calcularTotal(importe);
    
    // Reporte
    System.out.println("Importe: " + importe);
    System.out.println("Impuesto: " + impuesto);
    System.out.println("Total: " + total);
    }
    
}
