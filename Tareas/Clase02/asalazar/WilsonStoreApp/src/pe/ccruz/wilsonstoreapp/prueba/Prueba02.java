/*
 *  Wilson Store App
 *  Tarea para el curso Java - ISIL - SUNARP  * 
 */
package pe.ccruz.wilsonstoreapp.prueba;

import java.util.List;
import pe.ccruz.wilsonstoreapp.dto.VentaDto;
import pe.ccruz.wilsonstoreapp.service.contrato.VentaService;
import pe.ccruz.wilsonstoreapp.service.implementacion.VentaServiceImpl;

/**
 *
 * @author developer
 */
public class Prueba02 {
    
    public static void main(String[] args) {
        
        VentaService servicio = new VentaServiceImpl();
        
        String[] categorias = servicio.getListaCategorias();
        String[] articulos = servicio.getListaArticulos();
        
        servicio.registrarVenta(new VentaDto(2,"Cat 0 Art 0",10.00,0,categorias[0], articulos[0]));
        servicio.registrarVenta(new VentaDto(2,"Cat 1 Art 0",10.00,0,categorias[1], articulos[0]));
        servicio.registrarVenta(new VentaDto(2,"Cat 1 Art 1",10.00,0,categorias[1], articulos[1]));
        
        List<VentaDto> ventasCat = servicio.getVentasPorCategoria(categorias[1]);
        for(VentaDto dto : ventasCat){
            System.out.println(dto.getCantidad() + "\t"
            + dto.getItem() + "\t" 
            + dto.getpUnit() + "\t"
            + dto.getImporte() + "\t" 
            + dto.getCodArticulo() + "\t" 
            + dto.getCodCategoria() + "\t"                     
            );
        }
        
    }
    
}
