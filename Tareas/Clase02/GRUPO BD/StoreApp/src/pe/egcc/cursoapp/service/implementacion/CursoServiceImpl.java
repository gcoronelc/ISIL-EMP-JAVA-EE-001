package pe.egcc.cursoapp.service.implementacion;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.cursoapp.dto.ProductoDto;
import pe.egcc.cursoapp.service.contrato.CursoService;

public class CursoServiceImpl implements CursoService {

    @Override
    public String[] getListaCategoria() {
        return DataStore.arregloCategoria;
    }

    @Override
    public int registrarProducto(ProductoDto dto) {
        //--- DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //Date date = new Date();
        //System.out.println(dateFormat.format(date));
        //calculamos el nr de incidencia
        int numProd = DataStore.productos.size() + 1;
        dto.setNum(numProd);
        //calcularPromedio(dto);
        DataStore.productos.add(dto);
        return 1;
    }

    /*
  private void calcularPromedio(AlumnoDto dto) {
    // Proceso
    int pr = (dto.getNota1() + dto.getNota2() + dto.getNota3()) /3;
    boolean aprobado = (pr >= 13);
    // Registrar resultado
    dto.setAprobado(aprobado);
    dto.setPromedio(pr);
  }
     */
    @Override
    public List<ProductoDto> getProductos(String categoria) {
        List<ProductoDto> lista2 = new ArrayList<>();
        for (ProductoDto dto : DataStore.productos) {
            if (dto.getCategoria().equals(categoria)) {
                lista2.add(dto);
            }
        }
        return lista2;
    }

    @Override
    public List<ProductoDto> getAllProductos() {
        List<ProductoDto> lista2 = new ArrayList<>();
        for (ProductoDto dto : DataStore.productos) {
                lista2.add(dto);
        }
        return lista2;
    }

}
