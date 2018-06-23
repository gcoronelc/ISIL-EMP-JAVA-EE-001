package pe.egcc.cursoapp.controller;

import java.util.List;
import pe.egcc.cursoapp.dto.AlumnoDto;
import pe.egcc.cursoapp.service.contrato.CursoService;
import pe.egcc.cursoapp.service.implementacion.CursoServiceImpl;

public class CursoController {

  private CursoService cursoService;

  public CursoController() {
    cursoService = new CursoServiceImpl();
  }
  
  public String[] getCursos(){
    return cursoService.getListaCursos();
  }

  public void registrarIncid(AlumnoDto dto) {
    cursoService.registrarAlumno(dto);
  }

  public List<AlumnoDto> getAlumnos(String curso) {
    return cursoService.getAlumnos(curso);
  }
  
}
