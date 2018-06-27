package pe.egcc.eureka.prueba;

import java.sql.Connection;
import pe.egcc.eureka.database.AccesoDB;

public class Prueba01 {

  public static void main(String[] args) {
    try {
      Connection cn = AccesoDB.getConnection();
      System.out.println("Ok");
      cn.close();
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
  
}
