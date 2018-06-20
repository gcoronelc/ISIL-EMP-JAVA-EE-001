/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pedidoapp.services;

import java.util.Locale;

/**
 *
 * @author Alumno-CT
 */
public class PedidoService {

    public double calcularImpuesto(double importe) {
        double impuesto;
        impuesto = importe * 0.18;
        //Formateamos a dos decimales
        String impuestoFormt = String.format(Locale.US, "%.2f", impuesto);
        //Convertimos nuevamente a decimal
        impuesto = Double.parseDouble(impuestoFormt);
        return impuesto;
    }

    public double calcularTotal(double importe) {
        double total;
        total = importe + calcularImpuesto(importe);
        //Formateamos a dos decimales
        String totalFormt = String.format(Locale.US, "%.2f", total);
        //Convertimos nuevamente a decimal
        total = Double.parseDouble(totalFormt);
        return total;
    }

}
