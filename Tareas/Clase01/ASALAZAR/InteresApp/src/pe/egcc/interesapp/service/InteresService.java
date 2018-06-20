package pe.egcc.interesapp.service;

import pe.egcc.interesapp.dto.InteresDto;

public class InteresService {

    public InteresDto calculaImporteAcmulado(InteresDto interesDto) {

        double capital;
        double interes;
        double importeAcumulado;
        double tasaInteresMensual;
        double periodo;
        float  resultado;

        capital = interesDto.getCapital();
        interes = interesDto.getTasaInteres();
        tasaInteresMensual = (interes / 100) / 12;
        periodo = interesDto.getPeriodo();
        
        interes = capital * (Math.pow(1 + tasaInteresMensual, periodo));

        importeAcumulado = interesDto.getCapital() + interes;

        interesDto.setImporteAcumulado(importeAcumulado);

        return interesDto;

    }

}
