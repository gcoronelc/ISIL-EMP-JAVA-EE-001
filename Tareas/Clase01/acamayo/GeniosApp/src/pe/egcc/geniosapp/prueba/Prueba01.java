package pe.egcc.geniosapp.prueba;

import pe.egcc.geniosapp.service.GeniosService;

public class Prueba01 {

    public static void main(String[] args) {
        //int base, altura;
        
        //datos
        int base  = (int) Math.floor(Math.random()* 100);
        int altura= (int) Math.floor(Math.random()* 100);
        
        //proceso
        
        GeniosService gs = new GeniosService();
        
        double area = gs.CalculaArea(base, altura);
                        
        System.out.println("Base:" + base);
        System.out.println("Altura:" + altura);
        System.out.println("Area:" + String.format("%.2f",area));
    }
    
}
