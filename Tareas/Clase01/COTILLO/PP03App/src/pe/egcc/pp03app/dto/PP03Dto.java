package pe.egcc.pp03app.dto;

public class PP03Dto {

    //Input
    private double precioProducto;
    private int cantidad;
    //Output
    private double importe;
    private double impuesto;
    private double total;

    public PP03Dto() {
    }

    public PP03Dto(double precioProducto, int cantidad) {
        this.precioProducto = precioProducto;
        this.cantidad = cantidad;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
