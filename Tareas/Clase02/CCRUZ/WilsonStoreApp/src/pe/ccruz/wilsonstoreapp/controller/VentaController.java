/*
 *  Wilson Store App
 *  Tarea para el curso Java - ISIL - SUNARP  * 
 */
package pe.ccruz.wilsonstoreapp.controller;

import java.util.List;
import pe.ccruz.wilsonstoreapp.dto.VentaDto;
import pe.ccruz.wilsonstoreapp.service.contrato.VentaService;
import pe.ccruz.wilsonstoreapp.service.implementacion.VentaServiceImpl;

/**
 *
 * @author developer
 */
public class VentaController {
    
    private VentaService servicio;
    
    public VentaController(){
        servicio = new VentaServiceImpl();
    }
    
    public String[] getCategorias(){
        return servicio.getListaCategorias();
    }
    
    public String[] getArticulos(){
        return servicio.getListaArticulos();
    }
    
    public void registrarVenta(VentaDto dto){
        servicio.registrarVenta(dto);
    }
    
    public List<VentaDto> getVentasPorCategoria(String codCategoria){
        return servicio.getVentasPorCategoria(codCategoria);
    }
    
    public List<VentaDto> getVentasPorArticulo(String codArticulo){
        return servicio.getVentasPorArticulo(codArticulo);
    }
    
    
    
}
