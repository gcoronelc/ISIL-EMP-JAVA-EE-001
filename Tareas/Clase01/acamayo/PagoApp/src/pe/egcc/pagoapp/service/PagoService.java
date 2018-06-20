package pe.egcc.pagoapp.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import pe.egcc.pagoapp.dto.PagoDto;

public class PagoService {

    public PagoDto calcularPago(PagoDto dto){
        //variables
        double ingresos, renta = 0.0, neto;
        
        //proceso
        ingresos = dto.getHorasDia() * dto.getDias() * dto.getPagoHora();
        if (ingresos > 1500.0 ){
            renta = ingresos * 0.008;
        }
        neto = ingresos - renta;
        
        //reporte
        
        dto.setIngresos(RedondeaDecimal(ingresos));
        dto.setRenta(RedondeaDecimal(renta));
        dto.setNeto(RedondeaDecimal(neto));
        
        return dto;
    }

    public double RedondeaDecimal (double valor) {
        BigDecimal bd = new BigDecimal(valor);
        bd = bd.setScale(2, RoundingMode.UP);
        return  bd.doubleValue();
    }    
    
}
