package pe.egcc.pedidoapp.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PedidoService {
    public double calcularImpuesto(double importe){
        double impuesto;

        impuesto = importe * 0.18;
        return  RedondeaDecimal(impuesto);
    }
    
    public double calcularTotal(double importe){
        double total;
        total = importe + calcularImpuesto(importe);
        
        return  RedondeaDecimal(total);
    }

    public double RedondeaDecimal (double valor) {
        BigDecimal bd = new BigDecimal(valor);
        bd = bd.setScale(2, RoundingMode.UP);
        return  bd.doubleValue();
    }
    
}