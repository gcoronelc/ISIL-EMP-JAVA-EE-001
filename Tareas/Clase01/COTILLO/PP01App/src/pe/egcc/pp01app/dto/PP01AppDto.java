package pe.egcc.pp01app.dto;

import java.util.ArrayList;

public class PP01AppDto {

    //INPUT
    private ArrayList<Double> practicas;
    private double examParcial;
    private double examFinal;
    //OUTPUT
    private double promGeneral;

    public PP01AppDto() {
    }

    public PP01AppDto(ArrayList<Double> practicas, double examParcial, double examFinal) {
        this.practicas = practicas;
        this.examParcial = examParcial;
        this.examFinal = examFinal;
    }

    public ArrayList<Double> getPracticas() {
        return practicas;
    }

    public void setPracticas(ArrayList<Double> practicas) {
        this.practicas = practicas;
    }

    public double getExamParcial() {
        return examParcial;
    }

    public void setExamParcial(double examParcial) {
        this.examParcial = examParcial;
    }

    public double getExamFinal() {
        return examFinal;
    }

    public void setExamFinal(double examFinal) {
        this.examFinal = examFinal;
    }

    public double getPromGeneral() {
        return promGeneral;
    }

    public void setPromGeneral(double promGeneral) {
        this.promGeneral = promGeneral;
    }

 
    
}
