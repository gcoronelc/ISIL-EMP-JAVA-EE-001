package pe.egcc.pagoapp.service;

import java.util.Locale;
import pe.egcc.pagoapp.dto.PagoDto;

public class PagoService {

    public PagoDto calcularPago(PagoDto dto) {

        //Variables
        double ingresos, renta = 0.0, neto;

        //Proceso
        ingresos = dto.getHorasDia() * dto.getDias() * dto.getPagoHora();
        if (ingresos > 1500.0) {
            renta = ingresos * 0.08;
        }

        neto = ingresos - renta;

        //Formateamos los valores a dos decimales a cadena
        String ingresosFormt = String.format(Locale.US, "%.2f", ingresos);
        String rentaFormt = String.format(Locale.US, "%.2f", renta);
        String netoFormt = String.format(Locale.US, "%.2f", neto);

        //Los valores los convertimos nuevamente a decimales
        ingresos = Double.parseDouble(ingresosFormt);
        renta = Double.parseDouble(rentaFormt);
        neto = Double.parseDouble(netoFormt);

        //Reporte
        dto.setIngreso(ingresos);
        dto.setRenta(renta);
        dto.setNeto(neto);

        return dto;
    }

}
