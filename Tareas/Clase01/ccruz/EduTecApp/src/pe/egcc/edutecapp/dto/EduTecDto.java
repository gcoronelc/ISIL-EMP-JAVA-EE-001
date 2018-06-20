package pe.egcc.edutecapp.dto;

public class EduTecDto {
    
    // Input
    private double practica1;
    private double practica2;
    private double practica3;
    private double practica4;
    private double examenParcial;
    private double examenFinal;
    
    // Output
    private double promPracticas;
    private double promedioFinal;
    
    public EduTecDto()
    {
        
    }
    
    public EduTecDto(double practica1, double practica2, double practica3, double practica4, double examenParcial, double examenFinal){
        this.practica1 = practica1;
        this.practica2 = practica2;
        this.practica3 = practica3;
        this.practica4 = practica4;
        this.examenParcial = examenParcial;
        this.examenFinal = examenFinal;
    }

    /**
     * @return the practica1
     */
    public double getPractica1() {
        return practica1;
    }

    /**
     * @param practica1 the practica1 to set
     */
    public void setPractica1(double practica1) {
        this.practica1 = practica1;
    }

    /**
     * @return the practica2
     */
    public double getPractica2() {
        return practica2;
    }

    /**
     * @param practica2 the practica2 to set
     */
    public void setPractica2(double practica2) {
        this.practica2 = practica2;
    }

    /**
     * @return the practica3
     */
    public double getPractica3() {
        return practica3;
    }

    /**
     * @param practica3 the practica3 to set
     */
    public void setPractica3(double practica3) {
        this.practica3 = practica3;
    }

    /**
     * @return the practica4
     */
    public double getPractica4() {
        return practica4;
    }

    /**
     * @param practica4 the practica4 to set
     */
    public void setPractica4(double practica4) {
        this.practica4 = practica4;
    }

    /**
     * @return the examenParcial
     */
    public double getExamenParcial() {
        return examenParcial;
    }

    /**
     * @param examenParcial the examenParcial to set
     */
    public void setExamenParcial(double examenParcial) {
        this.examenParcial = examenParcial;
    }

    /**
     * @return the examenFinal
     */
    public double getExamenFinal() {
        return examenFinal;
    }

    /**
     * @param examenFinal the examenFinal to set
     */
    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }

    /**
     * @return the promPracticas
     */
    public double getPromPracticas() {
        return promPracticas;
    }

    /**
     * @param promPracticas the promPracticas to set
     */
    public void setPromPracticas(double promPracticas) {
        this.promPracticas = promPracticas;
    }

    /**
     * @return the promedioFinal
     */
    public double getPromedioFinal() {
        return promedioFinal;
    }

    /**
     * @param promedioFinal the promedioFinal to set
     */
    public void setPromedioFinal(double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }
    
}
