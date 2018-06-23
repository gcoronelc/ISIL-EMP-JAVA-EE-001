package pe.egcc.cursoapp.dto;

public class ProductoDto {

    private int num;//Numero
    private String categoria;//categoria
    private String articulo;//articulo
    private double precio;
    private String fecha;

    public ProductoDto() {
    }

    public ProductoDto(String categoria, String articulo , double precio, String fecha) {
        this.categoria = categoria;
        this.articulo = articulo;
        this.precio = precio;
        this.fecha = fecha;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}
