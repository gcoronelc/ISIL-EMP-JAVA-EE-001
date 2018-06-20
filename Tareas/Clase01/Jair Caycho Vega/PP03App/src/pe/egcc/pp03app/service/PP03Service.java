package pe.egcc.pp03app.service;

import java.util.Locale;
import pe.egcc.pp03app.dto.PP03Dto;

public class PP03Service {

    public PP03Dto calcularTotal(PP03Dto pP03Dto) {

        double importe = pP03Dto.getPrecioProducto() * pP03Dto.getCantidad();
        double impuesto = importe * 0.18;
        double total = importe + impuesto;

        System.out.println("importe: " + importe);
        System.out.println("impuesto: " + impuesto);
        System.out.println("total: " + total);

        //Formateamos los valores  a dos decimales
        String importeFormt = String.format(Locale.US, "%.2f", importe);
        String impuestoFormt = String.format(Locale.US, "%.2f", impuesto);
        String totalFormt = String.format(Locale.US, "%.2f", total);

        //Regresamos los valores a decimal
        importe = Double.parseDouble(importeFormt);
        impuesto = Double.parseDouble(impuestoFormt);
        total = Double.parseDouble(totalFormt);

        System.out.println("importe format: " + importe);
        System.out.println("impuesto format: " + impuesto);
        System.out.println("total format: " + total);

        pP03Dto.setImporte(importe);
        pP03Dto.setImpuesto(impuesto);
        pP03Dto.setTotal(total);

        return pP03Dto;
    }

}
