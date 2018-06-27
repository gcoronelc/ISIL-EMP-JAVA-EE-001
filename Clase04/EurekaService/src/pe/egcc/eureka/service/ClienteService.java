package pe.egcc.eureka.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.eureka.database.AccesoDB;
import pe.egcc.eureka.dto.ClienteDto;

public class ClienteService extends AbstractService {

  public List<ClienteDto> getClientes(String paterno, String materno, String nombre) {

    Connection cn = null;
    List<ClienteDto> lista = new ArrayList<>();
    this.setCode(1);

    try {
      cn = AccesoDB.getConnection();
      String sql = "select chr_cliecodigo, vch_cliepaterno, vch_cliematerno,"
              + "vch_clienombre, chr_cliedni, vch_clieciudad, vch_cliedireccion, "
              + "vch_clietelefono, vch_clieemail from cliente "
              + "where vch_cliepaterno like ? "
              + "and vch_cliematerno like ? "
              + "and vch_clienombre like ? ";
      PreparedStatement pstm = cn.prepareCall(sql);
      pstm.setString(1, paterno + "%");
      pstm.setString(2, materno + "%");
      pstm.setString(3, nombre + "%");
      ResultSet rs = pstm.executeQuery();
      while(rs.next()){
        ClienteDto dto = mapRow(rs);
        lista.add(dto);
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      this.setCode(-1);
      this.setError(e.getMessage());
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }

    return lista;
  }

  private ClienteDto mapRow(ResultSet rs) throws SQLException {
    
    ClienteDto dto = new ClienteDto();
    
    dto.setCodigo(rs.getString("CHR_CLIECODIGO"));
    dto.setPaterno(rs.getString("VCH_CLIEPATERNO"));
    dto.setMaterno(rs.getString("VCH_CLIEMATERNO"));
    dto.setNombre(rs.getString("VCH_CLIENOMBRE"));
    dto.setDni(rs.getString("CHR_CLIEDNI"));
    dto.setCiudad(rs.getString("VCH_CLIECIUDAD"));
    dto.setDireccion(rs.getString("VCH_CLIEDIRECCION"));
    dto.setTelefono(rs.getString("VCH_CLIETELEFONO"));
    dto.setEmail(rs.getString("VCH_CLIEEMAIL"));
    
    return dto;
    
  }

}
