package pe.egcc.eureka.service;

public abstract class AbstractService {
  
  private int code;
  private String mensaje;
  private String error;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
  
}
