package pe.egcc.interesapp.prueba;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import pe.egcc.interesapp.dto.InteresDto;
import pe.egcc.interesapp.service.InteresService;

public class Prueba01 {

    public static void main(String[] args) {

        Locale locale = new Locale("en", "UK");
        String pattern = "#,##0.00";

        // Datos
        double capital = 5000;
        double interes = 36;
        double periodo = 36;

        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        df.applyPattern(pattern);

        // Proceso
        InteresService interesService = new InteresService();
        InteresDto interesDto = new InteresDto(capital, interes, periodo);
        InteresDto importeAcumulado = interesService.calculaImporteAcmulado(interesDto);
        System.out.println("El Capital Acumulado es :" + df.format(importeAcumulado.getImporteAcumulado()));
    }

}
