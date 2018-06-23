package pe.egcc.cursoapp.service.contrato;

import java.util.List;
import pe.egcc.cursoapp.dto.ProductoDto;

public interface CursoService {

    /**
     *
     * @return Un arreglo con la lista de cursos
     */
    String[] getListaCategoria();

    /**
     * Registra un alumno
     *
     * @param dto Objeto con los datos del alumno
     * @return 1: Ok -1: Error
     */
    int registrarProducto(ProductoDto dto);

    /**
     * Retorna los alumnos de un curso.
     *
     * @param curso Nombre del curso a consultar.
     * @return Lista de alumnos
     */
    List<ProductoDto> getProductos(String curso);

    /**
     * Retorna todos los productos
     * @return Lista de todos los productos
     */
    List<ProductoDto> getAllProductos();

}
