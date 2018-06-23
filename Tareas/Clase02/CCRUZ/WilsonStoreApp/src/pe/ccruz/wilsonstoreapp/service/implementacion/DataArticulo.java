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
class DataArticulo {
    
    private DataArticulo(){}
    
    static String[] arregloArticulos;
    static List<VentaDto> ventas;
    
    static{
        
        arregloArticulos = new String[]{"Monitor","Procesador Intel Core i90","Memoria RAM x64"};
        ventas = new ArrayList<>();
    }
    
    
    
}
