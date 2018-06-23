package pe.ccruz.trabajoseguroapp.controller;

import java.util.List;
import pe.ccruz.trabajoseguroapp.dto.BitacoraDto;
import pe.ccruz.trabajoseguroapp.service.contrato.IncidenciaService;
import pe.ccruz.trabajoseguroapp.service.implementacion.IncidenciaServiceImpl;

/**
 *
 * @author developer
 */
public class IncidenciaController {
    
    private IncidenciaService incidenciaService;
    
    public IncidenciaController(){
        incidenciaService = new IncidenciaServiceImpl();
    }
    
    public String[] getIncidencias(){
        return incidenciaService.getListaIncidencias();
    }
    
    public void registrarBitacora(BitacoraDto dto){
        incidenciaService.registraIncidencia(dto);
    }
    
    public List<BitacoraDto> getBitacoras(String codIncidencia){
        return incidenciaService.getIncidencias(codIncidencia);
    }
    
    
}
