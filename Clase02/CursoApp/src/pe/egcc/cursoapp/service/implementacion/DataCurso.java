package pe.egcc.cursoapp.service.implementacion;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.cursoapp.dto.AlumnoDto;

class DataCurso {

  private DataCurso() {
  }
  
  /**
   * Variables con alcance de clase
   */
  static String[]  arregloCursos; // = {"JAVA", "ORACLE", "SPRING"};
  static List<AlumnoDto> alumnos;
  
  /**
   * Inicializador estático
   */
  static{
  
      arregloCursos = new String[] {"JAVA", "ORACLE", "SPRING"};
      alumnos = new ArrayList<>();
  
  }
  
}
