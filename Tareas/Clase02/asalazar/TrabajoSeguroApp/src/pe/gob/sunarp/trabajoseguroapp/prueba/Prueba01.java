/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.sunarp.trabajoseguroapp.prueba;

import pe.gob.sunarp.trabajoseguroapp.servicio.contrato.IncidenciaService;
import pe.gob.sunarp.trabajoseguroapp.servicio.implementacion.IncidenciaServiceImpl;

public class Prueba01 {

  public static void main(String[] args) {
    
    IncidenciaService incidenciaService = new IncidenciaServiceImpl();
    
    String[][] listaIncidencias = incidenciaService.getListaIncidencias();
            

     for (int i = 0; i < listaIncidencias.length; ++i) {
        for(int j = 0; j < listaIncidencias[i].length; ++j) {
           System.out.println(listaIncidencias[i][j]);
        }
     }    

    
  }
  
}
