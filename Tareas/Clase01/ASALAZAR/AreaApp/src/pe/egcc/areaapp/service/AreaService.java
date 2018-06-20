package pe.egcc.areaapp.service;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class AreaService {
    
    public double getNumeroAleatorio(){
        Random aleatorio = new Random(System.currentTimeMillis());  
        Double maximo = 1d;
        Double minimo = 100d;
        Double resultado = aleatorio.nextDouble() * (maximo - minimo) + minimo;
        
        return resultado;
    }
     
    public double areaTriangulo(double base, double altura) {

        double area;
        area = (base * altura) / 2;
        return area;

    }

    public boolean verificaAreaTriangulo(double resultado, double base, double altura) {


        Locale locale = new Locale("en", "UK");
        String pattern = "0.00";

        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        df.applyPattern(pattern);
        

        double area1 = new Double(df.format(areaTriangulo(base, altura)));
        double area2 = new Double(df.format(resultado));
        if (area1 == area2) {
            return true;
        } else {
            return false;
        }
    }

}
