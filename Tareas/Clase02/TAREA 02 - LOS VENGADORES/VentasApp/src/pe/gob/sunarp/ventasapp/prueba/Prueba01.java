

package pe.gob.sunarp.ventasapp.prueba;

import pe.gob.sunarp.ventasapp.dto.VentasDto;
import pe.gob.sunarp.ventasapp.service.contrato.VentasService;
import pe.gob.sunarp.ventasapp.service.implementacion.VentasServiceImpl;


public class Prueba01 {

  
    public static void main(String[] args) {
        
        
        //variable
        VentasService ventasService = new VentasServiceImpl();
            VentasDto ventasDto = new VentasDto("ASUS",10000.0,"LAPTOPS",12);
        
        //proceso
        ventasService.RegistrarVentas(ventasDto);
        
        //reporte
        System.out.println(ventasDto.getArticulo() + "\t" 
              + ventasDto.getCategoria() + "\t" + ventasDto.getCantidad() + "\t" +ventasDto.getMonto()+ "\t" +ventasDto.getFecha());
    }
    
}
