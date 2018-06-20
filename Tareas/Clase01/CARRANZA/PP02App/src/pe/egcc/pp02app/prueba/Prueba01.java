/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pp02app.prueba;

import pe.egcc.pp02app.service.PP02service;

/**
 *
 * @author Andy3
 */
public class Prueba01 {

    public static void main(String[] args) {
        int x1 = -4;
        int y1 = -2;
        int x2 = 0;
        int y2 = -3;

        PP02service service = new PP02service();
        String cuadrante1 = service.cuadrante(x1, y1);
        String cuadrante2 = service.cuadrante(x2, y2);

        double distancia = service.distancia(x1, y1, x2, y2);

        System.out.println("cuadrante1 :" + cuadrante1);
        System.out.println("cuadrante2 :" + cuadrante2);
        System.out.println("distancia :" + distancia);

    }
}
