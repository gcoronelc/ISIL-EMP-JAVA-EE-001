package pe.egcc.edutecapp.service;

import java.util.Arrays;
import pe.egcc.edutecapp.dto.EduTecDto;

public class EduTecService {
    
    public EduTecDto calcularPromPracticas(EduTecDto dto){
        
        // Variables
        double[] practicas = new double[4];
        
        double menor=0;
        double sumPracticas=0;

        practicas[0] = dto.getPractica1();
        practicas[1] = dto.getPractica2();
        practicas[2] = dto.getPractica3();
        practicas[3] = dto.getPractica4();

        
        menor = Arrays.stream(practicas).min().orElse(0);
        
        System.out.println("Se retira la Practica con Nota: " + menor);
        
//        for (int i=0; i < practicas.length; i++)
//        {
//           if (practicas[i] < menor)
//            {
//                menor=practicas[i];
//            }
//        }
//        
//        for (int i=0;i < practicas.length;i++)
//        {
//           if (practicas[i]==menor)
//            {
//                practicas[i]=0;
//            }
//        }
        
        for (int i=0;i<practicas.length;i++)
        {
           sumPracticas = (sumPracticas + practicas[i]);
        }
        
        sumPracticas = sumPracticas - menor;
        dto.setPromPracticas((sumPracticas/3));
        System.out.println("Prom. Practicas: " + dto.getPromPracticas());
        return dto;
    }
    
    
    public EduTecDto calcularPromTotal(EduTecDto dto){
        
        double promPracticas = 0;
        double promFinal = 0;
        double promParcial = 0;
        double promAlumno = 0;
        
        this.calcularPromPracticas(dto);
        
        promPracticas = (dto.getPromPracticas() * 0.25 );
        System.out.println("Prom. Practicas c/peso: " + promPracticas);
                
        promParcial = ( dto.getExamenParcial() * 0.25 );
        System.out.println("Prom. Parcial c/peso: " + promParcial);
        
        promFinal = ( dto.getExamenFinal() * 0.50 );
        System.out.println("Prom. Final c/peso: " + promFinal);
         
        promAlumno =  ( promPracticas + promParcial + promFinal ) ;
        
        dto.setPromedioFinal(promAlumno);
        
        return dto;
    }
    
}
