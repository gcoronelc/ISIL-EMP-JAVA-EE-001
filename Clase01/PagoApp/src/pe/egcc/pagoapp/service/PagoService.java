package pe.egcc.pagoapp.service;

import pe.egcc.pagoapp.dto.PagoDto;

public class PagoService {

  public PagoDto calcularPago( PagoDto dto){
    
    // Variables
    double ingresos, renta = 0.0, neto;
    
    // Proceso
    ingresos = dto.getHorasDia() * dto.getDias() * dto.getPagoHora();
    if( ingresos > 1500.0 ){
      renta = ingresos * 0.08;
    }
    neto = ingresos - renta;
    
    // Reporte
    dto.setIngresos(ingresos);
    dto.setRenta(renta);
    dto.setNeto(neto);
    
    return dto;
    
  }
  
}
