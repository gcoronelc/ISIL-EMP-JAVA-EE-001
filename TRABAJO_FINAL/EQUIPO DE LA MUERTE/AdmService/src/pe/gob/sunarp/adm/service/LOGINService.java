package pe.gob.sunarp.adm.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import oracle.jdbc.OracleTypes;
import pe.gob.sunarp.adm.database.AccesoDB;

public class LOGINService extends AbstractService {

    public List<Map<String, ?>> login(String usuario, String clave) {
        List<Map<String, ?>> lista = null;
        Connection cn = null;
        try {
            // Conexión
            cn = AccesoDB.getConnection();
            // Proceso
            String sql = "{call ADM_ACM_LOGIN(?,?,?)}";
            CallableStatement cstm = cn.prepareCall(sql);
            cstm.setString(1, usuario);
            cstm.setString(2, clave);
            cstm.registerOutParameter(3, OracleTypes.CURSOR);
            cstm.executeUpdate();
            ResultSet rs = (ResultSet) cstm.getObject(3);
            lista = JdbcUtil.rsToList(rs);
            rs.close();
            cstm.close();
            //Validando si hay datos en la lista
            //Si hay datos es porque el usuario existe
            if (lista.size() > 0) {
                this.setCode(1);
            } else {
                this.setCode(-1);
                this.setMensaje("USUARIO/CLAVE INCORRECTA");
            }
            //this.setCode(1);
        } catch (SQLException e) {
            this.setCode(-1);
            this.setMensaje(e.getMessage());
        } catch (Exception e) {
            this.setCode(-1);
            this.setMensaje(e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }

}
