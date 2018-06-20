
package pe.egcc.promedioapp.dto;

public class PromedioDTO {
    
    double practica1;
    double practica2;
    double practica3;
    double practica4;
    double promedioParcial;    
    double eparcial;
    double efinal;
    double promedioFinal;

    public PromedioDTO() {
    }

    public PromedioDTO(double practica1, double practica2, double practica3, double practica4, double promedioParcial, double eparcial, double efinal) {
        this.practica1 = practica1;
        this.practica2 = practica2;
        this.practica3 = practica3;
        this.practica4 = practica4;
        this.promedioParcial = promedioParcial;
        this.eparcial = eparcial;
        this.efinal = efinal;
    }

    public double getPractica1() {
        return practica1;
    }

    public void setPractica1(double practica1) {
        this.practica1 = practica1;
    }

    public double getPractica2() {
        return practica2;
    }

    public void setPractica2(double practica2) {
        this.practica2 = practica2;
    }

    public double getPractica3() {
        return practica3;
    }

    public void setPractica3(double practica3) {
        this.practica3 = practica3;
    }

    public double getPractica4() {
        return practica4;
    }

    public void setPractica4(double practica4) {
        this.practica4 = practica4;
    }

    public double getPromedioParcial() {
        return promedioParcial;
    }

    public void setPromedioParcial(double promedioParcial) {
        this.promedioParcial = promedioParcial;
    }

    public double getEparcial() {
        return eparcial;
    }

    public void setEparcial(double eparcial) {
        this.eparcial = eparcial;
    }

    public double getEfinal() {
        return efinal;
    }

    public void setEfinal(double efinal) {
        this.efinal = efinal;
    }

    public double getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }
    
    
    
}
