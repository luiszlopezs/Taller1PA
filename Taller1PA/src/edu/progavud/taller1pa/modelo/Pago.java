/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1pa.modelo;

import java.util.Random;

/**
 *
 * @author sangr
 */
public abstract class Pago {
    
    protected String medioDePago;
    protected boolean estaPago = false;
    protected double precioConDto;
    protected Pedido p;
    protected Cliente c;
    protected int cedula;
    
    protected int turno;

    public Pago(String medioDePago, Pedido p, Cliente c, int cedula, int turno) {
        this.medioDePago = medioDePago;
        this.p = p;
        this.c = c;
        this.cedula = cedula;
        this.turno = turno;
    }

    public Pago() {
    }

    
    
    
    public double aplicarDescuentoIndigena(){
        
        precioConDto = (p.calcularPrecioTotal() - p.calcularPrecioTotal()*0.08);
        
        return precioConDto;
    };
    
    public double aplicarDescuentoMayorDeEdad(){
        
        precioConDto = (p.calcularPrecioTotal() - p.calcularPrecioTotal()*0.1);
        
        return precioConDto;
    };
    
    public double aplicarDescuentoDoble(){
        
        precioConDto = (p.calcularPrecioTotal() - p.calcularPrecioTotal()*0.18);
        
        return precioConDto;
        
    }
    
    public int darTurno(int turno){
        this.turno = (int) (Math.random()*100)+1;
        return this.turno;
    }
    
    
    
    public void asignarPuntos(int cedula){
        c.setPuntos(p.calcularPuntosTotales());
    }
        
    //metodo para pagar, se hereda a las clase pago
    public abstract void pedidoPago();
    
    
    
    
}
