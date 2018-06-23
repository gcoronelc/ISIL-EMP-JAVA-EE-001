package pe.egcc.cursoapp.service.implementacion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.egcc.cursoapp.dto.AlumnoDto;
import pe.egcc.cursoapp.service.contrato.CursoService;

public class CursoServiceImpl implements CursoService {

    @Override
    public String[] getListaCursos() {
        return DataCurso.arregloCursos;
    }

    @Override
    public int registrarAlumno(AlumnoDto dto) {

        System.out.println("ego a cursos ervice");
        //--- DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //Date date = new Date();
        //System.out.println(dateFormat.format(date));

        //calculamos el nr de incidencia
        int numIncid = DataCurso.alumnos.size() + 1;
        dto.setNumIncid(numIncid);
        //calcularPromedio(dto);
        DataCurso.alumnos.add(dto);
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
    public List<AlumnoDto> getAlumnos(String curso) {
        List<AlumnoDto> lista2 = new ArrayList<>();
        for (AlumnoDto dto : DataCurso.alumnos) {
            if (dto.getCurso().equals(curso)) {
                lista2.add(dto);
            }
        }
        return lista2;
    }

}
