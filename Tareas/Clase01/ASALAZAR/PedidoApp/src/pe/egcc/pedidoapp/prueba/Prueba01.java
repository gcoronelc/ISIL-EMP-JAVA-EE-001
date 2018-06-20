package pe.egcc.pedidoapp.prueba;

import pe.egcc.pedidoapp.service.PedidoService;

public class Prueba01 {

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
