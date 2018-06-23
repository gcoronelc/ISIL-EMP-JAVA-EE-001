

package pe.gob.sunarp.incidenciasapp.service.implementacion;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import pe.gob.sunarp.incidenciasapp.dto.IncidenteDto;
import pe.gob.sunarp.incidenciasapp.service.contrato.IncidenciaService;

public class IncidenciaServiceImpl implements IncidenciaService{
   /* private int dd;
    private int yyyy;*/

    @Override
    public int RegistrarIncidencia(IncidenteDto dto) {
        

        //Proceso
        //GenerarNumeroTicket(dto);
         GenerarFechaRegistro(dto);
         DataIncidencia.incidencias.add(dto);
        //Reporte
        
        return 1;
    }

  
    @Override
    public List<IncidenteDto> ConsultarResumenIncidencia(String fecha) {
        
        //variables
        List<IncidenteDto> list = new ArrayList<>();
        
      
        
        for(IncidenteDto x: DataIncidencia.incidencias){
            if(x.getFecha().equals(fecha)){
                list.add(x);
            }
        }
        return list;
    }

    @Override
    public List<IncidenteDto> CantidadIncidenciaxTipo(String tipo) {
        List<IncidenteDto> list = new ArrayList<>();
        
        for(IncidenteDto x: DataIncidencia.incidencias){
            if(x.getTipo().equals(tipo)){
                list.add(x);
            }
        }
        
        return list;
    }

 

    private void GenerarNumeroTicket(IncidenteDto dto) {
     //como generar ticket secuencial
     int  codigo = 0;  
     dto.setCodigo(codigo);
    }

    private void GenerarFechaRegistro(IncidenteDto dto) {
        //variable
        java.util.Date fecha = new Date();
        SimpleDateFormat f = new SimpleDateFormat("YYYYMMdd");
        String fecha1 = f.format(fecha);
        //proceso
        dto.setFecha(fecha1);
    }

    @Override
    public String[] getListaTipos() {
        return DataIncidencia.arregloTipos;
    }


    
}
