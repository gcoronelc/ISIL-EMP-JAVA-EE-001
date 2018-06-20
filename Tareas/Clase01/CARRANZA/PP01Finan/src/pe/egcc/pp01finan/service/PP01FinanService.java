package pe.egcc.pp01finan.service;

import java.util.Locale;

public class PP01FinanService {

    public double ImporteAcumulado(double capital, double tasa_interes_porcentaje, int periodo) {
        double importe = 0;
        double tasa_interes =(tasa_interes_porcentaje)/100;
        importe = capital * (Math.pow(1 + tasa_interes, periodo));

        //Formateamos a dos decimales
        String importeFormt = String.format(Locale.US, "%.2f", importe);
        //Convertimos nuevamente a decimal
         importeFormt = String.format(Locale.US, "%.2f", importe);

        importe = Double.parseDouble(importeFormt);
        return importe;
    }

}
