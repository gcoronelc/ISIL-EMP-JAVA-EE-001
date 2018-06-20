package pe.egcc.cursoapp.service.implementacion;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.cursoapp.dto.AlumnoDto;
import pe.egcc.cursoapp.service.contrato.CursoService;

public class CursoServiceImpl implements CursoService{

  @Override
  public String[] getListaCursos() {
    return DataCurso.arregloCursos;
  }

  @Override
  public int registrarAlumno(AlumnoDto dto) {
    calcularPromedio(dto);
    DataCurso.alumnos.add(dto);
    return 1;
  }

  private void calcularPromedio(AlumnoDto dto) {
    // Proceso
    int pr = (dto.getNota1() + dto.getNota2() + dto.getNota3()) /3;
    boolean aprobado = (pr >= 13);
    // Registrar resultado
    dto.setAprobado(aprobado);
    dto.setPromedio(pr);
  }

  @Override
  public List<AlumnoDto> getAlumnos(String curso) {
    List<AlumnoDto> lista2 = new ArrayList<>();
    for(AlumnoDto dto: DataCurso.alumnos){
      if(dto.getCurso().equals(curso)){
        lista2.add(dto);
      }
    }
    return lista2;
  }
  
  
}
