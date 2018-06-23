/*
 *  Wilson Store App
 *  Tarea para el curso Java - ISIL - SUNARP  * 
 */
package pe.ccruz.wilsonstoreapp.service.implementacion;

import java.util.ArrayList;
import java.util.List;
import pe.ccruz.wilsonstoreapp.dto.VentaDto;
import pe.ccruz.wilsonstoreapp.service.contrato.VentaService;

/**
 *
 * @author developer
 */
public class VentaServiceImpl implements VentaService{

    @Override
    public String[] getListaCategorias() {
        return DataCategoria.arregloCategorias;
    }
    
    @Override
    public String[] getListaArticulos() {
        return DataArticulo.arregloArticulos;
    }

    @Override
    public int registrarVenta(VentaDto dto) {
        // calcular cantidad * pUnit = importe
        calcularImporte(dto);
        DataCategoria.ventas.add(dto);
        return 1;
    }

    @Override
    public List<VentaDto> getVentasPorCategoria(String codCategoria) {
        List<VentaDto> lista2 = new ArrayList<>();
        for(VentaDto dto: DataCategoria.ventas){
            if(dto.getCodCategoria().equals(codCategoria)){
                lista2.add(dto);
            }
        }
        return lista2;
    }

    @Override
    public List<VentaDto> getVentasPorArticulo(String codArticulo) {
       List<VentaDto> lista3 = new ArrayList();
       for(VentaDto dto: DataArticulo.ventas){
           if(dto.getCodArticulo().equals(codArticulo)){
               lista3.add(dto);
           }
       }
       return lista3;
    }

    private void calcularImporte(VentaDto dto) {
       double importe = (dto.getCantidad() * dto.getpUnit());
       dto.setImporte(importe);
    }

    
    
}
