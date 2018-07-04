package pe.egcc.eureka.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {
  
  private AccesoDB() {
  }

  public static Connection getConnection() throws SQLException {
    Connection cn = null;
    try {
      // Paso 1: Cargar el driver a memoria 
      Class.forName("oracle.jdbc.OracleDriver").newInstance();
      // Paso 2: Obtener el objeto Connection 
      String url = "jdbc:oracle:thin:@172.17.41.25:1521:XE";
      cn = DriverManager.getConnection(url, "eureka", "admin");
    } catch (SQLException e) {
      throw e;
    } catch (ClassNotFoundException e) {
      throw new SQLException("No se encontró el driver de la base de datos.");
    } catch (Exception e) {
      throw new SQLException("No se puede establecer la conexión con la BD.");
    }
    return cn;
  }

}
