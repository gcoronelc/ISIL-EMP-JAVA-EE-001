package pe.egcc.cartesiano.dto;

public class CartesianoDto {
    
    // Input
    private int puntoX1;
    private int puntoY1;
    
    private int puntoX2;
    private int puntoY2;
    
    // Output
    private String cuadrante1;
    private String cuadrante2;
    private Double distancia;
    
    public CartesianoDto(){
        
    }
    
    public CartesianoDto(int puntoX1, int puntoY1, int puntoX2, int puntoY2){
        this.puntoX1 = puntoX1;
        this.puntoY1 = puntoY1;
        this.puntoX2 = puntoX2;
        this.puntoY2 = puntoY2;
    }


    /**
     * @return the puntoX1
     */
    public int getPuntoX1() {
        return puntoX1;
    }

    /**
     * @param puntoX1 the puntoX1 to set
     */
    public void setPuntoX1(int puntoX1) {
        this.puntoX1 = puntoX1;
    }

    /**
     * @return the puntoY1
     */
    public int getPuntoY1() {
        return puntoY1;
    }

    /**
     * @param puntoY1 the puntoY1 to set
     */
    public void setPuntoY1(int puntoY1) {
        this.puntoY1 = puntoY1;
    }

    /**
     * @return the puntoX2
     */
    public int getPuntoX2() {
        return puntoX2;
    }

    /**
     * @param puntoX2 the puntoX2 to set
     */
    public void setPuntoX2(int puntoX2) {
        this.puntoX2 = puntoX2;
    }

    /**
     * @return the puntoY2
     */
    public int getPuntoY2() {
        return puntoY2;
    }

    /**
     * @param puntoY2 the puntoY2 to set
     */
    public void setPuntoY2(int puntoY2) {
        this.puntoY2 = puntoY2;
    }

    /**
     * @return the distancia
     */
    public Double getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the cuadrante2
     */
    public String getCuadrante2() {
        return cuadrante2;
    }

    /**
     * @param cuadrante2 the cuadrante2 to set
     */
    public void setCuadrante2(String cuadrante2) {
        this.cuadrante2 = cuadrante2;
    }

    /**
     * @return the cuadrante1
     */
    public String getCuadrante1() {
        return cuadrante1;
    }

    /**
     * @param cuadrante1 the cuadrante1 to set
     */
    public void setCuadrante1(String cuadrante1) {
        this.cuadrante1 = cuadrante1;
    }
    
}
