package pe.egcc.eureka.service;

public abstract class AbstractService {
  
  private int code;
  private String mensaje;

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
  
}
