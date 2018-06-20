
package pe.egcc.promedioapp.dto;


public class PromedioDto {
    
    //INPUT
    
    //practicas
    private double p1;
    private double p2;
    private double p3;
    private double p4;
        
    //parcial
    private double exp;
    
    //final
    private double exf;
        
    //OUTPUT
    private double promp;
    private double promf;
    
    //constructores
    public PromedioDto() {
    }

    public PromedioDto(double p1, double p2, double p3, double p4, double exp, double exf) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.exp = exp;
        this.exf = exf;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP3() {
        return p3;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    public double getP4() {
        return p4;
    }

    public void setP4(double p4) {
        this.p4 = p4;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public double getExf() {
        return exf;
    }

    public void setExf(double exf) {
        this.exf = exf;
    }

    public double getPromp() {
        return promp;
    }

    public void setPromp(double promp) {
        this.promp = promp;
    }

    public double getPromf() {
        return promf;
    }

    public void setPromf(double promf) {
        this.promf = promf;
    }
    
     
   
        
    
    
}
