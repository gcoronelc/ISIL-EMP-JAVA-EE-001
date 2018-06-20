
package pe.egcc.planocartesianoapp.service;

import pe.egcc.planocartesianoapp.dto.PlanoCartesianoDto;

public class PlanoCartesianoService {
    public PlanoCartesianoDto mostrarCuadrante(PlanoCartesianoDto cuadranteDto){
        String puntoA="", puntoB="";
        if(cuadranteDto.getX1()>0 && cuadranteDto.getY1() >0){
                  puntoA="I CUADRANTE";
        }
        if(cuadranteDto.getX1()<0 && cuadranteDto.getY1() >0){
                  puntoA="II CUADRANTE";
        }
        if(cuadranteDto.getX1()<0 && cuadranteDto.getY1() <0){
                  puntoA="III CUADRANTE";
        }
        if(cuadranteDto.getX1()>0 && cuadranteDto.getY1() <0){
                  puntoA="IV CUADRANTE";
        }
        if(cuadranteDto.getX1()==0 && cuadranteDto.getY1() ==0){
                  puntoA="NO PERTENECE A NINGUN CUADRANTE.";
        }
        
         if(cuadranteDto.getX2()>0 && cuadranteDto.getY2() >0){
                  puntoB="I CUADRANTE";
        }
        if(cuadranteDto.getX2()<0 && cuadranteDto.getY2() >0){
                  puntoB="II CUADRANTE";
        }
        if(cuadranteDto.getX2()<0 && cuadranteDto.getY2() <0){
                  puntoB="III CUADRANTE";
        }
        if(cuadranteDto.getX2()>0 && cuadranteDto.getY2() <0){
                  puntoB="IV CUADRANTE";
        }
        
        if(cuadranteDto.getX2()==0 && cuadranteDto.getY2() ==0){
                  puntoB="NO PERTENECE A NINGUN CUADRANTE.";
        }
        //REPORTE
        cuadranteDto.setCuadrantea(puntoA);
        cuadranteDto.setCuadranteb(puntoB);
    return cuadranteDto;
    }
    
    public double calcularDistancia(PlanoCartesianoDto distanciaDto){
        double calcdistancia;
        
        calcdistancia=Math.sqrt(Math.pow((distanciaDto.getX2()-distanciaDto.getX1()),2)+Math.pow((distanciaDto.getY2()-distanciaDto.getY1()),2));
    
    return calcdistancia;
    }
}
