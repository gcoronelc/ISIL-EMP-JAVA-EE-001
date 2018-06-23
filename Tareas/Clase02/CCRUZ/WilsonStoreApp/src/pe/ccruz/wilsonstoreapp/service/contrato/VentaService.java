/*
 *  Wilson Store App
 *  Tarea para el curso Java - ISIL - SUNARP  * 
 */
package pe.ccruz.wilsonstoreapp.service.contrato;

import java.util.List;
import pe.ccruz.wilsonstoreapp.dto.VentaDto;

/**
 *
 * @author developer
 */
public interface VentaService {
    
    /**
     * @return Un arreglo con la lista de categorias
     */
    String[] getListaCategorias();
    
    /**
     * @return Un arreglo con la lista de articulos
     */
    String[] getListaArticulos();
    
    /**
     * Registra una venta
     * @param dto obj con los datos de la venta
     * @return  1: Ok -1: Error
     */
    int registrarVenta(VentaDto dto);
    
    /**
     * Retorna las ventas por categoria
     * @param codCategoria
     * @return 
     */
    List<VentaDto> getVentasPorCategoria(String codCategoria);
    
    /**
     * retorna las ventas por articulo
     * @param codArticulo
     * @return 
     */
    List<VentaDto> getVentasPorArticulo(String codArticulo);
    
    
}
