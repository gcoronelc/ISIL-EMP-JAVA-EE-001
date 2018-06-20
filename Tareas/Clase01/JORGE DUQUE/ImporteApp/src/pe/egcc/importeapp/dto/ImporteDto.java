
package pe.egcc.importeapp.dto;


public class ImporteDto {
    
    //INPUT
    private double capital;
    private double interes;
    private double periodo;
    //OUTPUT
    private double importe;
    
    //constructor
    public ImporteDto() {
    }

    public ImporteDto(double capital, double interes, double periodo) {
        this.capital = capital;
        this.interes = interes;
        this.periodo = periodo;
    }
    
    //getter and setter
    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getPeriodo() {
        return periodo;
    }

    public void setPeriodo(double periodo) {
        this.periodo = periodo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
   
  
}
