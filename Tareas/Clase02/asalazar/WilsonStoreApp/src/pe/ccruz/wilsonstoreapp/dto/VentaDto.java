/*
 *  Wilson Store App
 *  Tarea para el curso Java - ISIL - SUNARP  * 
 */
package pe.ccruz.wilsonstoreapp.dto;

/**
 *
 * @author developer
 */
public class VentaDto {
    
    private int cantidad;
    private String item;
    private double pUnit;
    private double importe;
    private String codCategoria;
    private String codArticulo;
    
    public VentaDto(){};

    public VentaDto(int cantidad, String item, double pUnit, double importe, String codCategoria, String codArticulo) {
        this.cantidad = cantidad;
        this.item = item;
        this.pUnit = pUnit;
        this.importe = importe;
        this.codCategoria = codCategoria;
        this.codArticulo = codArticulo;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @return the pUnit
     */
    public double getpUnit() {
        return pUnit;
    }

    /**
     * @param pUnit the pUnit to set
     */
    public void setpUnit(double pUnit) {
        this.pUnit = pUnit;
    }

    /**
     * @return the importe
     */
    public double getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }

    /**
     * @return the codCategoria
     */
    public String getCodCategoria() {
        return codCategoria;
    }

    /**
     * @param codCategoria the codCategoria to set
     */
    public void setCodCategoria(String codCategoria) {
        this.codCategoria = codCategoria;
    }

    /**
     * @return the codArticulo
     */
    public String getCodArticulo() {
        return codArticulo;
    }

    /**
     * @param codArticulo the codArticulo to set
     */
    public void setCodArticulo(String codArticulo) {
        this.codArticulo = codArticulo;
    }
    
    
    
    
}
