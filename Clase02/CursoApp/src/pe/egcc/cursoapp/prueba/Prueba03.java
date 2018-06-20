package pe.egcc.cursoapp.prueba;

import java.util.List;
import pe.egcc.cursoapp.dto.AlumnoDto;
import pe.egcc.cursoapp.service.contrato.CursoService;
import pe.egcc.cursoapp.service.implementacion.CursoServiceImpl;

public class Prueba03 {

  public static void main(String[] args) {
    
    CursoService service = new CursoServiceImpl();
    
    String[] cursos = service.getListaCursos();
    
    service.registrarAlumno(new AlumnoDto(cursos[0], "Pedro", 15, 12, 10));
    service.registrarAlumno(new AlumnoDto(cursos[0], "Karla", 18, 16, 19));
    service.registrarAlumno(new AlumnoDto(cursos[0], "Juan", 10, 9, 8));
    
    service.registrarAlumno(new AlumnoDto(cursos[1], "Pedro", 19, 18, 17));
    service.registrarAlumno(new AlumnoDto(cursos[1], "Juana", 15, 14, 16));
    service.registrarAlumno(new AlumnoDto(cursos[1], "Luis", 9, 10, 14));
    
    List<AlumnoDto> lista = service.getAlumnos(cursos[2]);
    
    for (AlumnoDto dto : lista) {
      System.out.println(dto.getNombre() + "\t" 
              + dto.getPromedio() + "\t" + dto.isAprobado());
    }
    
    
    
  }
  
}
