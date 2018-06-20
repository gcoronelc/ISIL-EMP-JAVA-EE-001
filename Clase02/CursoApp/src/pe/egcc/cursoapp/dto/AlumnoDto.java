package pe.egcc.cursoapp.dto;

public class AlumnoDto {

  private String curso;
  private String nombre;
  private int nota1;
  private int nota2;
  private int nota3;
  private int promedio;
  private boolean aprobado;

  /**
   * Constructor por defecto
   */
  public AlumnoDto() {
  }

  /**
   * Constructor adicional.
   *
   * @param curso Nombre del curso
   * @param nombre Nombre del alumno
   * @param nota1 Nota 1
   * @param nota2 Nota 2
   * @param nota3 Nota 3
   */
  public AlumnoDto(String curso, String nombre, int nota1, int nota2, int nota3) {
    this.curso = curso;
    this.nombre = nombre;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getNota1() {
    return nota1;
  }

  public void setNota1(int nota1) {
    this.nota1 = nota1;
  }

  public int getNota2() {
    return nota2;
  }

  public void setNota2(int nota2) {
    this.nota2 = nota2;
  }

  public int getNota3() {
    return nota3;
  }

  public void setNota3(int nota3) {
    this.nota3 = nota3;
  }

  public int getPromedio() {
    return promedio;
  }

  public void setPromedio(int promedio) {
    this.promedio = promedio;
  }

  public boolean isAprobado() {
    return aprobado;
  }

  public void setAprobado(boolean aprobado) {
    this.aprobado = aprobado;
  }

}
