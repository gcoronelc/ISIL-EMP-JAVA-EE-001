package pe.ccruz.trabajoseguroapp.prueba;

import pe.ccruz.trabajoseguroapp.service.contrato.IncidenciaService;
import pe.ccruz.trabajoseguroapp.service.implementacion.IncidenciaServiceImpl;

/**
 *
 * @author developer
 */
public class Prueba01 {
    
    public static void main(String[] args) {
        
        IncidenciaService incidenciaService = new IncidenciaServiceImpl();
        
        String[] listaIncidencias = incidenciaService.getListaIncidencias();
        
        for(String codIncidencia : listaIncidencias){
            System.out.println(codIncidencia);
        }
    }
    
}
