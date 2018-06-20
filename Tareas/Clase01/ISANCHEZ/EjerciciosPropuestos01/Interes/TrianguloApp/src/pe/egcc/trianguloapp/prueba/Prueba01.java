
package pe.egcc.trianguloapp.prueba;

import java.util.Random;
import javax.swing.JOptionPane;
import pe.egcc.trianguloapp.service.AreaService;

public class Prueba01 {

   
    public static void main(String[] args) {
        //Datos
    	int altura,base;
    	double    area;
        double    temp_area=0.0;
        double valor;
       // base   = ((int)Math.random()*52)+1;
        // altura = ((int)Math.random()*52)+1;
        

    	//Proceso
        Random aleatorio= new Random();
    	AreaService areaService = new AreaService();
        
        base = aleatorio.nextInt(60);
        altura = aleatorio.nextInt(35);
        
        JOptionPane.showMessageDialog(null,"Base: "+ base +"\n"+"Altura: "+altura+"\n" +" Respuesta: ", "DATOS", JOptionPane.INFORMATION_MESSAGE);
       
    	
        area =  areaService.calcularArea(base,altura);
         JOptionPane.showMessageDialog(null,area, "DATOS", JOptionPane.INFORMATION_MESSAGE);
        valor= Double.parseDouble(JOptionPane.showInputDialog("Ingresar Resultado",temp_area));
        if (valor==area){
            System.out.println("El área Ingresado es correcto");
        } else {
            System.out.println("El área es incorrecto.");
        }
       
      //reporte
        System.out.println("La base es: " +base);
        System.out.println("La altura es: "+altura);
    	System.out.println("EL area es: "+ area);
    }
    
}
