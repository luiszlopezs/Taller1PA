/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1pa.modelo;

/**
 *
 * @author hailen
 */
public class PagoDatafono extends Pago {
    
    private int numTarjeta;
    private int claveTarjeta;
    
    @Override
    public void pedidoPago(){
        estaPago = true;
    }
    
    
}
