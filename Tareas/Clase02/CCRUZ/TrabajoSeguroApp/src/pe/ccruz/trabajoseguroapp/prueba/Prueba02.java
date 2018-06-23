package pe.ccruz.trabajoseguroapp.prueba;

import java.util.List;
import pe.ccruz.trabajoseguroapp.dto.BitacoraDto;
import pe.ccruz.trabajoseguroapp.service.contrato.IncidenciaService;
import pe.ccruz.trabajoseguroapp.service.implementacion.IncidenciaServiceImpl;

/**
 *
 * @author developer
 */
public class Prueba02 {
    
    public static void main(String[] args) {
        
        IncidenciaService incdService = new IncidenciaServiceImpl();
        
        String[] incidencias = incdService.getListaIncidencias();
        
        incdService.registraIncidencia(new BitacoraDto("Carlos Cruz","Stackoverflow 2",incidencias[0]));
        incdService.registraIncidencia(new BitacoraDto("Eduardo Cruz","Stackoverflow 1",incidencias[0]));
        incdService.registraIncidencia(new BitacoraDto("Carlos Acuña","Stackoverflow 3",incidencias[0]));
        
        incdService.registraIncidencia(new BitacoraDto("Carladasdos Cruz","asdasd 2",incidencias[1]));
        incdService.registraIncidencia(new BitacoraDto("asdas Cruz","Stacksdadoverflow 1",incidencias[1]));
        incdService.registraIncidencia(new BitacoraDto("Carasdalos Acuasdasña","asdada 3",incidencias[1]));
        
        List<BitacoraDto> lista = incdService.getIncidencias(incidencias[0]);
        
        for (BitacoraDto dto : lista){
            System.out.println(dto.getNombreEmpleado() + "\t" + dto.getDetalleIncidencia() + "\t" + dto.getCodIncidencia());
        }
        
    }
    
}
