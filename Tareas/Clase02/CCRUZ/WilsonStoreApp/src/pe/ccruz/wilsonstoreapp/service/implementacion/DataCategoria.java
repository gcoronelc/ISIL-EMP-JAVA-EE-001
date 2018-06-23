/*
 *  Wilson Store App
 *  Tarea para el curso Java - ISIL - SUNARP  * 
 */
package pe.ccruz.wilsonstoreapp.service.implementacion;

import java.util.ArrayList;
import java.util.List;
import pe.ccruz.wilsonstoreapp.dto.VentaDto;

/**
 *
 * @author developer
 */
class DataCategoria {
    
    private DataCategoria(){}
    
    static String[] arregloCategorias;
    static List<VentaDto> ventas;
    
    /*
        Inicializaror estático
    */
    static{
        arregloCategorias = new String[]{"Dispositivos","Almacenamiento","Procesamiento"};
        ventas = new ArrayList<>();
    }
    
}
