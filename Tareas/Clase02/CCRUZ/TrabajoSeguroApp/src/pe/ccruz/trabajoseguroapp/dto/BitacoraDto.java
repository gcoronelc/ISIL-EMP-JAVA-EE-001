package pe.ccruz.trabajoseguroapp.dto;

public class BitacoraDto {
    
    private String nombreEmpleado;
    private String detalleIncidencia;
    private String codIncidencia;
    
    public BitacoraDto(){
    }

    public BitacoraDto(String nombreEmpleado, String detalleIncidencia, String codIncidencia) {
        this.nombreEmpleado = nombreEmpleado;
        this.detalleIncidencia = detalleIncidencia;
        this.codIncidencia = codIncidencia;
    }

    /**
     * @return the nombreEmpleado
     */
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    /**
     * @param nombreEmpleado the nombreEmpleado to set
     */
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    /**
     * @return the detalleIncidencia
     */
    public String getDetalleIncidencia() {
        return detalleIncidencia;
    }

    /**
     * @param detalleIncidencia the detalleIncidencia to set
     */
    public void setDetalleIncidencia(String detalleIncidencia) {
        this.detalleIncidencia = detalleIncidencia;
    }

    /**
     * @return the codIncidencia
     */
    public String getCodIncidencia() {
        return codIncidencia;
    }

    /**
     * @param codIncidencia the codIncidencia to set
     */
    public void setCodIncidencia(String codIncidencia) {
        this.codIncidencia = codIncidencia;
    }
    
    
    
}
