
package pe.egcc.notasapp.dto;


public class ExamenDto {
    private double notaep;
    private double notaef;

    public ExamenDto(double notaep, double notaef) {
        this.notaep = notaep;
        this.notaef = notaef;
    }

    public double getNotaep() {
        return notaep;
    }

    public void setNotaep(double notaep) {
        this.notaep = notaep;
    }

    public double getNotaef() {
        return notaef;
    }

    public void setNotaef(double notaef) {
        this.notaef = notaef;
    }
    
    
}
