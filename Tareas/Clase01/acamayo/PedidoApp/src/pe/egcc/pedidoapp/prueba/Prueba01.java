package pe.egcc.pedidoapp.prueba;

import pe.egcc.pedidoapp.service.PedidoService;

public class Prueba01 {


    public static void main(String[] args) {
        // TODO code application logic here
        //datos
        double importe = 2500.0;
        
        //proceso
        PedidoService pedidoService = new PedidoService();
        double impuesto = pedidoService.calcularImpuesto(importe);
        double total = pedidoService.calcularImpuesto(importe);
                
        // reporte
        System.out.println("Importe:" + importe);
        System.out.println("Impuesto:" + impuesto);
        System.out.println("Total:" + total);
    }
    
}
