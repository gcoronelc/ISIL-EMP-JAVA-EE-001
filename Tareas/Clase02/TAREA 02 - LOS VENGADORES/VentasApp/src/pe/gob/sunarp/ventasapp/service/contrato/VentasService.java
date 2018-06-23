

package pe.gob.sunarp.ventasapp.service.contrato;

import java.util.List;
import pe.gob.sunarp.ventasapp.dto.VentasDto;


public interface VentasService {
    
    public int RegistrarVentas(VentasDto dto);
    
    public List<VentasDto> getListaVentas();
    
    public List<VentasDto> ConsultarResumenVentasxArticulo(String articulo);
    
    public List<VentasDto> ConsultarResumenVentasxCategoria(String categoria);
      
    
}
