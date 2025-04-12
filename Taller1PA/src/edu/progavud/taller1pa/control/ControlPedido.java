/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1pa.control;

import edu.progavud.taller1pa.modelo.Pedido;

/**
 *
 * @author sangr
 */
public class ControlPedido {
    
    
    private ControlPrincipal cPrinc;
    private Pedido pedido;
    private ControlBucket cBuck;
    private ControlCombo cComb;
    private ControlProductos cProd;
    
    public ControlPedido(ControlPrincipal cPrinc, ControlBucket cBuck, ControlCombo cComb, ControlProductos cProd){
        this.cPrinc = cPrinc;
        this.cBuck = cBuck;
        this.cComb = cComb;
        this.cProd = cProd;
    }
    
    public double calcularPrecioTotal(){
        
    }
    
}
