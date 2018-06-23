package pe.egcc.cursoapp.prueba;

import java.util.List;
import pe.egcc.cursoapp.dto.ProductoDto;
import pe.egcc.cursoapp.service.contrato.CursoService;
import pe.egcc.cursoapp.service.implementacion.CursoServiceImpl;

public class Prueba03 {

  public static void main(String[] args) {
    
    CursoService service = new CursoServiceImpl();
    
    String[] cursos = service.getListaCategoria();
    
    /*service.registrarProducto(new ProductoDto(cursos[0], "Pedro", 15, 12, 10,"RES1","DES1"));
    service.registrarAlumno(new AlumnoDto(cursos[0], "Karla", 18, 16, 19));
    service.registrarAlumno(new AlumnoDto(cursos[0], "Juan", 10, 9, 8));
    
    service.registrarAlumno(new AlumnoDto(cursos[1], "Pedro", 19, 18, 17));
    service.registrarAlumno(new AlumnoDto(cursos[1], "Juana", 15, 14, 16));
    service.registrarAlumno(new AlumnoDto(cursos[1], "Luis", 9, 10, 14));*/
    
    List<ProductoDto> lista = service.getProductos(cursos[2]);
    
    /*for (ProductoDto dto : lista) {
      System.out.println(dto.getNombre() + "\t" 
              + dto.getPromedio() + "\t" + dto.isAprobado());
    }
    */
    
    
  }
  
}
