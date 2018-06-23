

package pe.gob.sunarp.ventasapp.dto;




public class VentasDto {
    
    //INPUT
    
    private String articulo;
    private double monto;
    private String categoria;
    private int cantidad;
    
    
    //OUTPUT
    private int codigo;
    private String fecha;
    
    //constructor 
    public VentasDto() {
    }
    
    //constructor con los inputs
    public VentasDto(String articulo, double monto, String categoria,int cantidad) {
        this.articulo = articulo;
        this.monto = monto;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }
    
    //getter and setter
    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
