
package pe.gob.sunarp.ventasapp.service.implementacion;

import java.util.ArrayList;
import java.util.List;
import pe.gob.sunarp.ventasapp.dto.VentasDto;

public class DataVentas {

    public DataVentas() {
    }
    
    static String[]  arregloArticulo; // = {"LENOVO", "HP-COMPAQ","ADVANCE","ASUS","MSI","ECOTREND","LOGITECH"};
    static String[]  arregloCategoria; // = {"LAPTOPS", "MULTIMEDIA", "PCS"};
    static List<VentasDto> ventas;
    
    static{
  
        arregloArticulo = new String[] {"LENOVO", "HP-COMPAQ","ADVANCE","ASUS","MSI","ECOTREND","LOGITECH"};
        arregloCategoria = new String[] {"LAPTOPS", "MULTIMEDIA", "PCS"};
        ventas = new ArrayList<>();
  
    }
    
}
