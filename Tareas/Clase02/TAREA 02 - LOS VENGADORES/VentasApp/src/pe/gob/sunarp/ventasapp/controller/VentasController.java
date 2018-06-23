

package pe.gob.sunarp.ventasapp.controller;

import java.util.List;
import pe.gob.sunarp.ventasapp.dto.VentasDto;
import pe.gob.sunarp.ventasapp.service.contrato.VentasService;
import pe.gob.sunarp.ventasapp.service.implementacion.VentasServiceImpl;


public class VentasController {
    
    
    VentasService ventasService;

    public VentasController() {
        ventasService = new VentasServiceImpl();
    }
    
    public int RegistrarVentas(VentasDto dto){
    
        return ventasService.RegistrarVentas(dto);
    }
    
    public List<VentasDto> getListaVentas(){
        
        return ventasService.getListaVentas();
    }
    
    public List<VentasDto> ConsultarResumenVentasxArticulo(String articulo){
    
        return ventasService.ConsultarResumenVentasxArticulo(articulo);
    }
    
    public List<VentasDto> ConsultarResumenVentasxCategoria(String categoria){
    
        return ventasService.ConsultarResumenVentasxCategoria(categoria);
    }
    
}
