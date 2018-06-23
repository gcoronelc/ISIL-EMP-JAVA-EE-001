package pe.egcc.cursoapp.prueba;

import pe.egcc.cursoapp.service.contrato.CursoService;
import pe.egcc.cursoapp.service.implementacion.CursoServiceImpl;

public class Prueba02 {

  public static void main(String[] args) {
    
    CursoService cursoService = new CursoServiceImpl();
    
    String[] listaCursos = cursoService.getListaCategoria();
    
    for (String curso : listaCursos) {
      System.out.println(curso);
    }
    
  }
}
