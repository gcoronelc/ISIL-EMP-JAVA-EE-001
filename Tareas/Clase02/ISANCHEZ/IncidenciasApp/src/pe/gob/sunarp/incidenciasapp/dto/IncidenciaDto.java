
package pe.gob.sunarp.incidenciasapp.dto;

public class IncidenciaDto {
    private int codigo;
    private String nombre;
    private String  detalle;
    private String incidente;
    
    
    private int cantidad;

    public IncidenciaDto() {
    }

    public IncidenciaDto(int codigo, String nombre, String detalle, String incidente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.detalle = detalle;
        this.incidente = incidente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getIncidente() {
        return incidente;
    }

    public void setIncidente(String incidente) {
        this.incidente = incidente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
