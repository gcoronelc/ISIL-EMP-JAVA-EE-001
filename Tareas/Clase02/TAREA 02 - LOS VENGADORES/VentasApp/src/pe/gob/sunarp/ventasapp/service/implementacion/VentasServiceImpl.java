

package pe.gob.sunarp.ventasapp.service.implementacion;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import pe.gob.sunarp.ventasapp.dto.VentasDto;
import pe.gob.sunarp.ventasapp.service.contrato.VentasService;

public class VentasServiceImpl implements VentasService{

    @Override
    public int RegistrarVentas(VentasDto dto) {
         //Proceso

         GenerarFechaRegistro(dto);
         DataVentas.ventas.add(dto);
        //Reporte
        
        return 1;
    }

    @Override
    public List<VentasDto> getListaVentas() {
        
        List<VentasDto> list = new ArrayList<>();
        
        for(VentasDto x: DataVentas.ventas){
                list.add(x);
            }
        
        return list;
    }

    @Override
    public List<VentasDto> ConsultarResumenVentasxArticulo(String articulo) {
        
           List<VentasDto> list = new ArrayList<>();
        
        for(VentasDto x: DataVentas.ventas){
            if(x.getArticulo().equals(articulo)){
                list.add(x);
            }
        }
        
        return list;
    }

    @Override
    public List<VentasDto> ConsultarResumenVentasxCategoria(String categoria) {
        
        List<VentasDto> list = new ArrayList<>();
        
        for(VentasDto x: DataVentas.ventas){
            if(x.getCategoria().equals(categoria)){
                list.add(x);
            }
        }
        
        return list;
    }

    private void GenerarFechaRegistro(VentasDto dto) {
        //variable
        java.util.Date fecha = new Date();
        SimpleDateFormat f = new SimpleDateFormat("YYYYMMdd");
        String fecha1 = f.format(fecha);
        //proceso
        dto.setFecha(fecha1);
    }



 




    
}
