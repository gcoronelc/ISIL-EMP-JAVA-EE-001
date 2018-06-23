/*
 *  Wilson Store App
 *  Tarea para el curso Java - ISIL - SUNARP  * 
 */
package pe.ccruz.wilsonstoreapp.prueba;

import pe.ccruz.wilsonstoreapp.service.contrato.VentaService;
import pe.ccruz.wilsonstoreapp.service.implementacion.VentaServiceImpl;

/**
 *
 * @author developer
 */
public class Prueba01 {
    
    public static void main(String[] args) {
    
        VentaService servicio = new VentaServiceImpl();
    
        String[] listaCategorias = servicio.getListaCategorias();
    
        System.out.println("Categorias:");
        for(String codCategoria : listaCategorias){
            System.out.println(codCategoria);
        }
        System.out.println("\n");
        
        String[] listaArticulos = servicio.getListaArticulos();
        
        System.out.println("Articulos:");
        for(String codArticulo : listaArticulos){
            System.out.println(codArticulo);
        }
    }
    
}
