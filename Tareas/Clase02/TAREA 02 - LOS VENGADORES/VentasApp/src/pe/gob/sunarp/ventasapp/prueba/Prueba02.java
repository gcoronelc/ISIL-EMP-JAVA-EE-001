

package pe.gob.sunarp.ventasapp.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.gob.sunarp.ventasapp.dto.VentasDto;
import pe.gob.sunarp.ventasapp.service.contrato.VentasService;
import pe.gob.sunarp.ventasapp.service.implementacion.VentasServiceImpl;


public class Prueba02 {


    public static void main(String[] args) {
        
                //variables
        VentasService ventasService = new VentasServiceImpl();
        List<VentasDto> l = new ArrayList<>();
        
        //proceso        
        ventasService.RegistrarVentas(new VentasDto("LENOVO",10000.0,"PCS",12));
        ventasService.RegistrarVentas(new VentasDto("ADVANCE",5555444.0,"PCS",5));
        ventasService.RegistrarVentas(new VentasDto("ECOTREND",88.0,"MULTIMEDIA",1));
        ventasService.RegistrarVentas(new VentasDto("HP-COMPAQ",66666.0,"PCS",7));
        ventasService.RegistrarVentas(new VentasDto("ADVANCE",584.0,"LAPTOPS",2));
        
        l = ventasService.ConsultarResumenVentasxArticulo("LENOVO");
        
        for (VentasDto x : l) {
                 System.out.println(x.getArticulo() + "\t" 
              + x.getCategoria() + "\t" + x.getCantidad() + "\t" +x.getMonto()+ "\t" +x.getFecha());
          }
    }
    
}
