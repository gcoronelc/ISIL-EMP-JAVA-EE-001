
package pe.egcc.planocartesianoapp.dto;

public class PlanoCartesianoDto {
    //INPUT
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    //OUTPUT
    private String cuadrantea;
    private String cuadranteb;

    public String getCuadrantea() {
        return cuadrantea;
    }

    public void setCuadrantea(String cuadrantea) {
        this.cuadrantea = cuadrantea;
    }

    public String getCuadranteb() {
        return cuadranteb;
    }

    public void setCuadranteb(String cuadranteb) {
        this.cuadranteb = cuadranteb;
    }
    private double distancia;

    public PlanoCartesianoDto(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }



    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
}
