package pe.egcc.cartesianoapp.service;

public class CartesianoService {
    
    
    public Double calculaDistancia(double x1, double y1, double x2, double y2 ){
     double  distancia;
     distancia = Math.hypot(x2 - x1, y2 - y1);
     return distancia;
    }

    public String determinaCuadrante(double x1, double y1, double x2, double y2 ) {

        String resultado = "";
        
        if (x1 > 0 && y1 > 0) {
            resultado = "El primer punto (" + x1 + "," + y1 + ") esta en el primer cuadrante";
            
        } else if (x1 < 0 && y1 > 0) {
            resultado = "El primer punto (" + x1 + "," + y1 + ") esta en el segundo cuadrante";

        } else if (x1 < 0 && y1 < 0) {
            resultado = "El primer punto (" + x1 + "," + y1 + ") esta en el tercer cuadrante";

        } else if (x1 > 0 && y1 < 0) {
            resultado = "El primer punto (" + x1 + "," + y1 + ") esta en el cuarto cuadrante";

        };
        
        if (x2 > 0 && y2 > 0) {
            resultado = resultado + "\n" + "El segundo punto (" + x2+ "," + y2 + ") esta en el primer cuadrante";
            
        } else if (x2 < 0 && y2 > 0) {
            resultado = resultado + "\n" + "El segundo punto (" + x2 + "," + y2 + ") esta en el segundo cuadrante";

        } else if (x2 < 0 && y2 < 0) {
            resultado = resultado + "\n" + "El segundo punto (" + x2 + "," + y2 + ") esta en el tercer cuadrante";

        } else if (x2 > 0 && y2 < 0) {
            resultado = resultado + "\n" + "El segundo punto (" + x2 + "," + y2 + ") esta en el cuarto cuadrante";

        };   
        
        
        
        return  resultado;
    }
}
