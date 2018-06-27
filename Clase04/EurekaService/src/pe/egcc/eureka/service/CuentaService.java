package pe.egcc.eureka.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import oracle.jdbc.OracleTypes;
import pe.egcc.eureka.database.AccesoDB;

public class CuentaService extends AbstractService{
  
  
  public List<Map<String,?>> traerMovimientos( String cuenta){
    List<Map<String,?>> lista = null;
    Connection cn = null;
    try {
      // Conexión
      cn = AccesoDB.getConnection();
      // Proceso
      String sql = "{call usp_egcc_movimientos(?,?)}";
      CallableStatement cstm = cn.prepareCall(sql);
      cstm.setString(1, cuenta); 
      cstm.registerOutParameter(2, OracleTypes.CURSOR);
      cstm.executeUpdate();
      ResultSet rs = (ResultSet) cstm.getObject(2);
      lista = JdbcUtil.rsToList(rs);
      rs.close();
      cstm.close();
      this.setCode(1);
    } catch (Exception e) {
      this.setCode(-1);
      this.setError(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return lista;
  }
  
}
