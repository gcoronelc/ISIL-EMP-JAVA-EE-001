
package pe.egcc.interesapp.service;

import static java.lang.Math.pow;

public class InteresService {
       public double calcularImporte(double capitalIni, double interes, int periodo){
           double importe, calc_interes;
           calc_interes= interes/100;
           importe=capitalIni * pow((1+calc_interes),periodo);

    return importe;
   }
}
