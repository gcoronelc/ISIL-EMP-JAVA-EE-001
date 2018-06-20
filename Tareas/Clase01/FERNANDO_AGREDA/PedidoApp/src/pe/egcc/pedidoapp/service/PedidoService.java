/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.egcc.pedidoapp.service;

/**
 *
 * @author bnieva
 */
public class PedidoService {
    
   public double calcularImpuesto( double importe){
    double impuesto;
    impuesto = importe * 0.18;
    return impuesto;
  }
    
  public double calcularTotal( double importe){
    double total;
    total = importe + calcularImpuesto(importe);
    return total;
  }
}
