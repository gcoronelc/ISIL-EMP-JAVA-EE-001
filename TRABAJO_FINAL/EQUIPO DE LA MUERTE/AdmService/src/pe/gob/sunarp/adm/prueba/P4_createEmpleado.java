/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.sunarp.adm.prueba;

import pe.gob.sunarp.adm.service.EMPLEADOService;

/**
 *
 * @author Andy3
 */
public class P4_createEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Datos
        String co_area = "01";
        String co_cargo = "01";
        String est_empl = "A";
        String ape_pat = "SILVA";
        String ape_mat = "TERRONES";
        String nombre = "SEGUNDO";
        // Proceso
        EMPLEADOService service = new EMPLEADOService();
        service.createEmpleado(co_area, co_cargo, est_empl, ape_pat, ape_mat, nombre);
        // Reporte
        // Reporte
        if (service.getCode() == 1) {
            System.out.println(service.getMensaje());
        } else {
            System.err.println(service.getMensaje());
        }
         
    }
    
}
