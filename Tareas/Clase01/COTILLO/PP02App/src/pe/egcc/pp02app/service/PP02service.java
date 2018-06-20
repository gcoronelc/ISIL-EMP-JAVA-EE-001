package pe.egcc.pp02app.service;

import java.util.Locale;

public class PP02service {

    public String cuadrante(int x, int y) {
        String cuadrante = null;
        if (x > 0 && y > 0) {
            cuadrante = "I Cuadrante";
        } else if (x < 0 && y > 0) {
            cuadrante = "II Cuadrante";
        } else if (x < 0 && y < 0) {
            cuadrante = "II Cuadrante";
        } else if (x > 0 && y < 0) {
            cuadrante = "IV Cuadrante";
        } else {
            cuadrante = "Origen";
        }
        return cuadrante;
    }

    public double distancia(int x1, int y1, int x2, int y2) {

        double distancia = 0;
        distancia = (float) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println("distancia :" + distancia);

        //Formateamos el valor a dos decimales
        String distanciaFormt = String.format(Locale.US, "%.2f", distancia);
        //Regresamos el valor a decimal
        distancia = Double.parseDouble(distanciaFormt);
        System.out.println("distancia formateado: " + distancia);

        return distancia;
    }

}
