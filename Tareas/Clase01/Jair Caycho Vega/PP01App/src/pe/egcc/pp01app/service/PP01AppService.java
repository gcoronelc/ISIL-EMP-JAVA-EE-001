package pe.egcc.pp01app.service;

import java.util.ArrayList;
import java.util.Locale;
import pe.egcc.pp01app.dto.PP01AppDto;

public class PP01AppService {

    public double calcPromPracticas(ArrayList<Double> practicas) {
        //Hallar las tres notas mas altas,
        //ArrayList<Double> practicas = pP01AppDto.getPracticas();
        double num_minor = practicas.get(0);
        int position = 0;
        System.out.println("Tamaño de lista :" + practicas.size());
        System.out.println("Valores de lista :");

        for (int i = 0; i < practicas.size(); i++) {
            //Print cada valor
            System.out.println(practicas.get(i));

            if (practicas.get(i) < num_minor) { // 
                num_minor = practicas.get(i);
                position = i;
            }
        }

        System.out.println("Posicion a remover :" + position);
        System.out.println("Valor a remover :" + practicas.get(position));

        practicas.remove(position);

        System.out.println("Tamaño de lista despues de remover menor:" + practicas.size());
        System.out.println("Valores de lista : ");
        double sumPracticas = 0;
        for (int i = 0; i < practicas.size(); i++) {
            //Print cada valor
            System.out.println(practicas.get(i));
            sumPracticas = sumPracticas + practicas.get(i);
        }
        System.out.println("Formula de Promedio de Practicas=" + sumPracticas + "/" + practicas.size());

        double promPracticas = sumPracticas / practicas.size();
        System.out.println("Promedio de Practicas=" + promPracticas);
        return promPracticas;
    }

    public PP01AppDto calcularProm(PP01AppDto pP01AppDto) {
        //Hallar promedio de prcaticas
        double promPracticas = calcPromPracticas(pP01AppDto.getPracticas());
        double examParcial = pP01AppDto.getExamParcial();
        double examFinal = pP01AppDto.getExamFinal();

        double promGeneral = (promPracticas * 0.25) + (examParcial * 0.25) + (examFinal * 0.5);
        System.out.println("Formula de Promedio =" + "(" + promPracticas + " * 0.25) + (" + examParcial + " * 0.25) + (" + examFinal + " * 0.5)");
        System.out.println("Promedio general=" + promGeneral);

        //Formateamos a dos decimales
        String promGeneralFormt = String.format(Locale.US, "%.2f", promGeneral);
        //Convertimos nuevamente a decimal
        promGeneral = Double.parseDouble(promGeneralFormt);
        System.out.println("Promedio general formateado=" + promGeneral);

        pP01AppDto.setPromGeneral(promGeneral);
        return pP01AppDto;

    }

}
