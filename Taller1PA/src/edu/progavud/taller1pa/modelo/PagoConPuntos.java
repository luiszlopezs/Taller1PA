/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1pa.modelo;

/**
 *
 * @author hailen
 */
public class PagoConPuntos extends Pago{
    
    
    @Override
    public void pedidoPago(){
         //es para sobreescribir el metodo abstracto
    }
    
    
    // metodo para pagar con puntos, resta los puntos avtuales de la persona con los del pedido
    public boolean pedidoPago(double puntos){
        double puntosActualizados = c.getPuntos() - p.calcularPuntos();
        c.setPuntos(puntosActualizados);
        estaPago = true;
        return estaPago;
    }
    
}
