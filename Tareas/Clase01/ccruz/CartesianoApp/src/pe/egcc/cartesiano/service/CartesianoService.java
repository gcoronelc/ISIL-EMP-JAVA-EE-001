package pe.egcc.cartesiano.service;

import pe.egcc.cartesiano.dto.CartesianoDto;

public class CartesianoService {
    
    public CartesianoDto obtenerCuadrante1( CartesianoDto dto){
        
        // Variables
        int puntoX1, puntoY1;
        
        puntoX1 = dto.getPuntoX1();
        puntoY1 = dto.getPuntoY1();
        
        // Proceso
        if (puntoX1 > 0 && puntoY1 > 0){
            dto.setCuadrante1("1er. Cuadrante (A)");
        }
        
        if (puntoX1 < 0 && puntoY1 > 0){
            dto.setCuadrante1("2do. Cuadrante (B)");
        }
        
        if (puntoX1 < 0 && puntoY1 < 0){
            dto.setCuadrante1("3er. Cuadrante (C)");
        }
        
        if (puntoX1 > 0 && puntoY1 < 0){
            dto.setCuadrante1("4to. Cuadrante (D)");
        }

        return dto;
    }
    
    public CartesianoDto obtenerCuadrante2( CartesianoDto dto){
        
        // Variables
        int puntoX2, puntoY2;
        
        puntoX2 = dto.getPuntoX2();
        puntoY2 = dto.getPuntoY2();
        
        // Proceso
        if (puntoX2 > 0 && puntoY2 > 0){
            dto.setCuadrante2("1er. Cuadrante (A)");
        }
        
        if (puntoX2 < 0 && puntoY2 > 0){
            dto.setCuadrante2("2do. Cuadrante (B)");
        }
        
        if (puntoX2 < 0 && puntoY2 < 0){
            dto.setCuadrante2("3er. Cuadrante (C)");
        }
        
        if (puntoX2 > 0 && puntoY2 < 0){
            dto.setCuadrante2("4to. Cuadrante (D)");
        }

        return dto;
    }
    
    public CartesianoDto obtenerDistancia( CartesianoDto dto){
         
        int puntoX1, puntoY1, puntoX2, puntoY2;
        double distancia = 0.0;
        
        puntoX1 = dto.getPuntoX1();
        puntoY1 = dto.getPuntoY1();
        puntoX2 = dto.getPuntoX2();
        puntoY2 = dto.getPuntoY2();
        
        distancia = Math.sqrt( Math.abs((((( puntoX2 - puntoX1) * (puntoX2-puntoX1)) + (( puntoY2-puntoY1)*(puntoY2-puntoY1))))));
        dto.setDistancia(distancia);
        
        return dto;
        
        
    }
            
    
}
