package pe.egcc.pp01app.prueba;

import java.util.ArrayList;
import pe.egcc.pp01app.dto.PP01AppDto;
import pe.egcc.pp01app.service.PP01AppService;

public class Prueba01 {

    public static void main(String[] args) {
        ArrayList<Double> practicas = new ArrayList<>();
        practicas.add(15.0);
        practicas.add(15.0);
        practicas.add(11.0);
        practicas.add(15.0);
        double examenParcial = 15;
        double examenFinal = 15.55;

        PP01AppDto pP01AppDto = new PP01AppDto();
        pP01AppDto.setPracticas(practicas);
        pP01AppDto.setExamParcial(examenParcial);
        pP01AppDto.setExamFinal(examenFinal);
        PP01AppService service = new PP01AppService();
        pP01AppDto = service.calcularProm(pP01AppDto);
        System.out.println("Promedio general=" + pP01AppDto.getPromGeneral());

    }

}
