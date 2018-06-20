package pe.egcc.pp01finan.prueba;

import pe.egcc.pp01finan.service.PP01FinanService;

public class Prueba01 {

    public static void main(String[] args) {
        PP01FinanService service = new PP01FinanService();
        //double capital, double tasa_interes, double periodo
        double importe = service.ImporteAcumulado(25000, 5, 12);
        System.out.println("importe :" + importe);
    }
}
