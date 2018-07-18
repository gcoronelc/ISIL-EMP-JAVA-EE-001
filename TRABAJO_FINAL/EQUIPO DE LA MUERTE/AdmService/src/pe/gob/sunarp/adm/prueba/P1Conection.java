package pe.gob.sunarp.adm.prueba;

import java.sql.Connection;
import java.sql.SQLException;
import pe.gob.sunarp.adm.database.AccesoDB;

public class P1Conection {

    public static void main(String[] args) {
        try {
            Connection cn = AccesoDB.getConnection();
            System.out.println("Ok");
            cn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
