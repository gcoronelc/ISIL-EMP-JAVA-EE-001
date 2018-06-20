/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.promedioapp.service;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import pe.egcc.promedioapp.dto.PromedioDTO;

public class PromedioService {

    public double[] ordenaLista(double lista[]) {
        // Metodo de Burbuja
        int cuentaintercambios = 0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        for (boolean ordenado = false; !ordenado;) {
            for (int i = 0; i < lista.length - 1; i++) {
                if (lista[i] > lista[i + 1]) {
                    //Intercambiamos valores
                    double variableauxiliar = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = variableauxiliar;
                    //indicamos que hay un cambio
                    cuentaintercambios++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaintercambios == 0) {
                ordenado = true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaintercambios = 0;
        }
        return lista;

    }

    public PromedioDTO calculaPromedio(PromedioDTO promedioDto) {

        Locale locale = new Locale("en", "UK");
        String pattern = "0.00";

        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        df.applyPattern(pattern);        

        double examenParcial;
        double examenFinal;
        double promedioPractica;
        double ponderado1;
        double ponderado2;
        double ponderado3;
        double notaFinal;
                
        double datos[] = {promedioDto.getPractica1(), promedioDto.getPractica2(), promedioDto.getPractica3(), promedioDto.getPractica4()};
        double practicas[] = ordenaLista(datos);
        
        promedioPractica = (practicas[1] + practicas[2] + practicas[3] ) / 3 ;  
        examenParcial = promedioDto.getEparcial();
        examenFinal = promedioDto.getEfinal();
        
        ponderado1 = promedioPractica * 0.25;
        ponderado2 = examenParcial * 0.25;
        ponderado3 = examenFinal * 0.50;
        
        notaFinal = new Double (df.format(ponderado1 + ponderado2 + ponderado3));
        
        promedioDto.setPromedioParcial(promedioPractica);
        promedioDto.setPromedioFinal(notaFinal);

        return promedioDto;
    }

}
