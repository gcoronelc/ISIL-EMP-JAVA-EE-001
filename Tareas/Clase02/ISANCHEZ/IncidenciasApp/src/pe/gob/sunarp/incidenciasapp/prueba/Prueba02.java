/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.sunarp.incidenciasapp.prueba;

import java.util.List;
import pe.gob.sunarp.incidenciasapp.dto.IncidenciaDto;
import pe.gob.sunarp.incidenciasapp.service.contrato.IncidenciaService;
import pe.gob.sunarp.incidenciasapp.service.implementacion.IncidenciaServiceImplementacion;

/**
 *
 * @author REYSAN
 */
public class Prueba02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IncidenciaService service = new IncidenciaServiceImplementacion();
        String[] tipo2 = service.getListaNombre();
        
        service.registrarIncidencia(new IncidenciaDto(100, tipo2[0], "Se puede Resolver en la semana", "Modificacion de sistemaa"));
        service.registrarIncidencia(new IncidenciaDto(200, tipo2[0], "Se puede Resolver en el transcurso del dia", "impresora"));
        service.registrarIncidencia(new IncidenciaDto(300, tipo2[0], "Se debe resolver inmediatamente", " cable"));
        
        service.registrarIncidencia(new IncidenciaDto(100, tipo2[1], "Se puede Resolver en la semana", "Modificacion de sistemaa"));
        service.registrarIncidencia(new IncidenciaDto(200, tipo2[1], "Se puede Resolver en el transcurso del dia", "impresora"));
        service.registrarIncidencia(new IncidenciaDto(300, tipo2[1], "Se debe resolver inmediatamente", " cable"));
        
        List<IncidenciaDto> lista = service.getIncidente(tipo2[1]);
        for(IncidenciaDto dto : lista){
            System.out.println("Datos: "+dto.getCodigo() +"\t" + dto.getNombre() +"\t"+ dto.getDetalle()+"\t"+ dto.getIncidente());
        }
    }
    
}
