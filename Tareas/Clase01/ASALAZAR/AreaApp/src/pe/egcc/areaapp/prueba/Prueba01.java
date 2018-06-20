package pe.egcc.areaapp.prueba;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import pe.egcc.areaapp.service.AreaService;

public class Prueba01 {

    public static void main(String[] args) {
        
        Locale locale = new Locale("en", "UK");
        String pattern = "0.00";
        
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        df.applyPattern(pattern);          
        
        AreaService areaService = new AreaService();

        Double base   = new Double( df.format (areaService.getNumeroAleatorio() ));
        Double altura = new Double( df.format (areaService.getNumeroAleatorio() ));

        double area = areaService.areaTriangulo(base, altura);
                     
        System.out.println("El área es de " + df.format(base) + " de base y " + df.format(altura) + " de altura es : " + df.format(area));
    }

}
