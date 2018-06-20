package pe.egcc.cursoapp.service.contrato;

import java.util.List;
import pe.egcc.cursoapp.dto.AlumnoDto;


public interface CursoService {

  /**
   * 
   * @return Un arreglo con la lista de cursos
   */
  String[] getListaCursos();
  
  /**
   * Registra un alumno
   * @param dto Objeto con los datos del alumno
   * @return 1: Ok -1: Error
   */
  int registrarAlumno( AlumnoDto dto);
  
  /**
   * Retorna los alumnos de un curso.
   * 
   * @param curso Nombre del curso a consultar.
   * @return Lista de alumnos
   */
  List<AlumnoDto> getAlumnos(String curso);
  
  
}
