package pe.egcc.eureka.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
      this.setMensaje(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return lista;
  }
  
  
  public int procRetiro(String cuenta, String clave,
          double importe, String codEmpleado){
    Connection cn = null;
    try {
      // Inicio: El objeto Connection y Inicio de TX
      cn = AccesoDB.getConnection();
      cn.setAutoCommit(false);
      // Actividad 1: Verificar saldo
      String sql = "select DEC_CUENSALDO "
              + "from CUENTA "
              + "where CHR_CUENCODIGO = ? "
              + "FOR UPDATE ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, cuenta);
      ResultSet rs = pstm.executeQuery();
      if( ! rs.next() ){
        throw new Exception("Cuenta no existe.");
      }
      double saldo = rs.getDouble("DEC_CUENSALDO");
      rs.close();
      pstm.close();
      if( saldo < importe){
        throw new Exception("Saldo es insuficiente.");
      }
      
      try {
        Thread.currentThread().sleep(2000);
      } catch (Exception e) {
      }
      
      // Actividad 2: Actualizar saldo
      saldo = saldo - importe;
      sql = "update CUENTA "
              + "set DEC_CUENSALDO = ?  "
              + "where CHR_CUENCODIGO = ?";
      pstm = cn.prepareStatement(sql);
      pstm.setDouble(1, saldo);
      pstm.setString(2, cuenta);
      int filas = pstm.executeUpdate();
      if( filas == 0 ){
        throw new Exception("Cuenta no existe.");
      }
      pstm.close();
      // Actividad 3: Registrar Movimiento
      // Leer el contador
      sql = "select INT_CUENCONTMOV "
              + "from CUENTA "
              + "where CHR_CUENCODIGO = ? "
              + "FOR UPDATE ";
      pstm = cn.prepareStatement(sql);
      pstm.setString(1, cuenta);
      rs = pstm.executeQuery();
      rs.next();
      int cont  = rs.getInt("INT_CUENCONTMOV");
      rs.close();
      pstm.close();
      cont++;
      // Actualizar contador
      sql = "update CUENTA "
              + "set INT_CUENCONTMOV = ? "
              + "where CHR_CUENCODIGO = ?";
      pstm = cn.prepareStatement(sql);
      pstm.setInt(1, cont);
      pstm.setString(2, cuenta);
      pstm.executeUpdate();
      pstm.close();
      // Registrar movimiento
      sql = "insert into movimiento(CHR_CUENCODIGO,"
              + "INT_MOVINUMERO,DTT_MOVIFECHA,"
              + "CHR_EMPLCODIGO,CHR_TIPOCODIGO,"
              + "DEC_MOVIIMPORTE) "
              + "values(?,?,SYSDATE,?,'004',?)";
      pstm = cn.prepareStatement(sql);
      pstm.setString(1, cuenta);
      pstm.setInt(2, cont);
      pstm.setString(3, codEmpleado);
      pstm.setDouble(4, importe);
      pstm.executeUpdate();
      pstm.close();
      // Fin: Confirmar TX
      cn.commit();
      this.setCode(1);
      this.setMensaje("Proceso ejecutado correctamente.");
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      this.setCode(-1);
      this.setMensaje(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return this.getCode();
  }
  
  
  public int procRetiroSP(String cuenta, String clave,
          double importe, String codEmpleado){
    Connection cn = null;
    try {
      // Inicio: El objeto Connection
      cn = AccesoDB.getConnection();
      cn.setAutoCommit(true);
      // Ejecutar SP
      String sql = "{call usp_egcc_retiro(?,?,?,?)}";
      CallableStatement cstm = cn.prepareCall(sql);
      cstm.setString(1, cuenta); 
      cstm.setDouble(2,importe); 
      cstm.setString(3, codEmpleado); 
      cstm.setString(4, clave); 
      cstm.executeUpdate();
      cstm.close();
      // Fin
      this.setCode(1);
      this.setMensaje("Proceso ejecutado correctamente.");
    } catch (Exception e) {
      this.setCode(-1);
      this.setMensaje(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return this.getCode();
  }
  
} 
