package pe.egcc.interesapp.dto;

public class InteresDto {

    // INPUT
    private double capital;
    private double TasaInteres;
    private double periodo;

    // OUTPUT
    private double ImporteAcumulado;

    /**
     * Constructor por defecto
     */
    public InteresDto() {
    }

    public InteresDto(double capital, double TasaInteres, double periodo) {
        this.capital = capital;
        this.TasaInteres = TasaInteres;
        this.periodo = periodo;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getTasaInteres() {
        return TasaInteres;
    }

    public void setTasaInteres(double TasaInteres) {
        this.TasaInteres = TasaInteres;
    }

    public double getPeriodo() {
        return periodo;
    }

    public void setPeriodo(double periodo) {
        this.periodo = periodo;
    }

    public double getImporteAcumulado() {
        return ImporteAcumulado;
    }

    public void setImporteAcumulado(double ImporteAcumulado) {
        this.ImporteAcumulado = ImporteAcumulado;
    }
    
}
