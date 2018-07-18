package pe.gob.sunarp.adm.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oracle.jdbc.OracleTypes;
import pe.gob.sunarp.adm.database.AccesoDB;

public class EMPLEADOService extends AbstractService {

    public int createEmpleado(String co_area, String co_cargo, String est_empl,
            String ape_pat, String ape_mat, String nombre
    ) {
        Connection cn = null;
        try {
            // Inicio: El objeto Connection
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(true);
            
            //usuario de sistema
            String USU_SIST = nombre.substring(1, 1)+ape_pat;
       
            // Ejecutar SP
            String sql = "{call ADM_EMPL_CREATE(?,?,?,?,?,?,?)}";
            CallableStatement cstm = cn.prepareCall(sql);
            cstm.setString(1, co_area);
            cstm.setString(2, USU_SIST);
            cstm.setString(3, co_cargo);
            cstm.setString(4, est_empl);
            cstm.setString(5, ape_pat);
            cstm.setString(6, ape_mat);
            cstm.setString(7, nombre);
            cstm.executeUpdate();
            cstm.close();
            // Fin
            this.setCode(1);
            this.setMensaje("Proceso ejecutado correctamente.");
        } catch (Exception e) {
            this.setCode(-1);
            this.setMensaje(e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return this.getCode();
    }

    public Map<String, ?> getEmpleadoByID(String CO_EMPL) {
        Map<String, Object> empleado = null;
        Connection cn = null;
        try {
            // Conexión
            cn = AccesoDB.getConnection();
            // Proceso
            String sql = "{call ADM_EMPL_FINDBYID(?,?,?,?,?,?,?,?)}";
            CallableStatement cstm = cn.prepareCall(sql);
            cstm.setString(1, CO_EMPL);
            cstm.registerOutParameter(2, java.sql.Types.VARCHAR);
            cstm.registerOutParameter(3, java.sql.Types.VARCHAR);
            cstm.registerOutParameter(4, java.sql.Types.VARCHAR);
            cstm.registerOutParameter(5, java.sql.Types.VARCHAR);
            cstm.registerOutParameter(6, java.sql.Types.VARCHAR);
            cstm.registerOutParameter(7, java.sql.Types.VARCHAR);
            cstm.registerOutParameter(8, java.sql.Types.VARCHAR);
            cstm.executeUpdate();

            empleado = new HashMap<>();
            empleado.put("CO_EMPL", CO_EMPL);
            empleado.put("CO_AREA", cstm.getString(2));
            empleado.put("USU_SIST", cstm.getString(3));
            empleado.put("CO_CARGO", cstm.getString(4));
            empleado.put("EST_EMPL", cstm.getString(5));
            empleado.put("APE_PAT", cstm.getString(6));
            empleado.put("APE_MAT", cstm.getString(7));
            empleado.put("NOMBRE", cstm.getString(8));

            cstm.close();
            this.setCode(1);

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
        return empleado;
    }

    public List<Map<String, ?>> getEmpleadosByTags(String paterno, String materno, String nombre) {
        List<Map<String, ?>> lista = null;
        Connection cn = null;
        try {
            // Conexión
            cn = AccesoDB.getConnection();
            // Proceso
            String sql = "{call ADM_EMPL_GETEMPLEADOS(?,?,?,?)}";
            CallableStatement cstm = cn.prepareCall(sql);
            cstm.setString(1, paterno);
            cstm.setString(2, materno);
            cstm.setString(3, nombre);
            cstm.registerOutParameter(4, OracleTypes.CURSOR);
            cstm.executeUpdate();
            ResultSet rs = (ResultSet) cstm.getObject(4);
            lista = JdbcUtil.rsToList(rs);
            rs.close();
            cstm.close();
            this.setCode(1);

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

    public int editEmpleadoData(String CO_EMPL, String APE_PAT, String APE_MAT, String NOMBRE,
            String CO_AREA, String CO_CARGO, String EST_EMPL) {
        Connection cn = null;
        try {
            // Inicio: El objeto Connection
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(true);
            // Ejecutar SP
            String sql = "{call ADM_EMPL_EDITDATA(?,?,?,?,?,?,?)}";
            CallableStatement cstm = cn.prepareCall(sql);
            cstm.setString(1, CO_EMPL);
            cstm.setString(2, APE_PAT);
            cstm.setString(3, APE_MAT);
            cstm.setString(4, NOMBRE);
            cstm.setString(5, CO_AREA);
            cstm.setString(6, CO_CARGO);
            cstm.setString(7, EST_EMPL);

            cstm.executeUpdate();
            cstm.close();
            // Fin
            this.setCode(1);
            this.setMensaje("Empleado actualizado correctamente.");
        } catch (SQLException e) {
            this.setCode(-1);
            this.setMensaje(e.getMessage());
        } catch (Exception e) {
            this.setCode(-1);
            this.setMensaje(e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
            } catch (Exception e) {
            }
        }

        return this.getCode();
    }

}
