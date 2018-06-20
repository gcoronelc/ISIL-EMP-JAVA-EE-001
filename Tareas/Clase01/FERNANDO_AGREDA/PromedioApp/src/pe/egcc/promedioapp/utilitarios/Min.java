/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.egcc.promedioapp.utilitarios;

public class Min {

    public Min() {
    }
    
    
    
    
    public double minimo(double a,double b,double c,double d){
     
        double min = a;
        double max = a;

        if (b < min) {
          min = b;
        } 

        if (c < min) {
          min = c;
        } 

        if (d < min) { 
          min = d;
        } 
    
        
        return min;

    }  
}
        
        

