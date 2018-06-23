

package pe.gob.sunarp.incidenciasapp.dto;




public class IncidenteDto {
    
    //INPUT
    
    private String tipo;
    private String descrip;
    private String fecha_pres;
    
    
    //OUTPUT
    private int codigo;
    private String fecha;
    
    //constructor 
    public IncidenteDto() {
    }
    
    //constructor con los inputs
    public IncidenteDto(String tipo, String descrip, String fecha_pres) {
        this.tipo = tipo;
        this.descrip = descrip;
        this.fecha_pres = fecha_pres;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
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

    public String getFecha_pres() {
        return fecha_pres;
    }

    public void setFecha_pres(String fecha_pres) {
        this.fecha_pres = fecha_pres;
    }
    
    
    
}
