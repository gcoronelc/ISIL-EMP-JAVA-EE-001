
package pe.egcc.interesapp.prueba;

import pe.egcc.interesapp.service.InteresService;

public class Prueba01 {

    
    public static void main(String[] args) {
           	//Datos
    	double capitalIni=15000,interes=4.0;
    	int    periodo=5;

    	//Proceso
    	InteresService interesService = new InteresService();
    	double importe = interesService.calcularImporte(capitalIni,interes,periodo);
       
      //reporte
    	System.out.println("EL importe es: "+  (double)Math.round(importe* 100d)/100d);
        System.out.println("EL importe es: "+  String.format("%.2f", importe));
        System.out.println("EL importe es: "+   importe);
    }
    
}
