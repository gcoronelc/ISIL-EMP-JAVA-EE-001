package pe.egcc.cursoapp.service.implementacion;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.cursoapp.dto.ProductoDto;

class DataStore {

    private DataStore() {
    }

    /**
     * Variables con alcance de clase
     */
    static String[] arregloCategoria; // = {"JAVA", "ORACLE", "SPRING"};
    static List<ProductoDto> productos;

    /**
     * Inicializador estático
     */
    static {
        //arregloCursos = new String[]{"JAVA", "ORACLE", "SPRING"};
        arregloCategoria = new String[]{"ALIMENTOS", "BEBIDAS", "LIMPIEZA","ELECTRODOMESTICOS"};
        productos = new ArrayList<>();
    }

}
