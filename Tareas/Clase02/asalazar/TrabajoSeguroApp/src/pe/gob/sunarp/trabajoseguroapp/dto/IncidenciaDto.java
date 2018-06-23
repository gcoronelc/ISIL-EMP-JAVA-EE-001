package pe.gob.sunarp.trabajoseguroapp.dto;

public class IncidenciaDto {

    private String codigo;
    private String nombre;
    private String descripcion;
    private String fecha;
    private String detalle;

    public IncidenciaDto() {
    }

    public IncidenciaDto(String codigo, String nombre, String descripcion, String fecha, String detalle) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.detalle = detalle;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

}
