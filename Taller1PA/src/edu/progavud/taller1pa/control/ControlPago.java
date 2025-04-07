/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1pa.control;

/**
 *
 * @author sangr
 */
public class ControlPago {
    
    private String medioDePago;
    private boolean estaPago;
    private double precioConDto;
    private Pedido p;
    private Cliente c;
    
    private int numTarjeta;
    private int claveTarjeta;
    
    private int cedula;

    public Pago(String medioDePago, boolean estaPago, Pedido p, Cliente c, int cedula) {
        this.medioDePago = medioDePago;
        this.estaPago = estaPago;
        this.p = p;
        this.c = c;
        this.cedula = cedula;
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
    //metodo para pagar con el datafono
    public boolean pedidoPagoDatafono(int numTarjeta, int claveTarjeta){
        estaPago = true;
        return estaPago;
    }
    
    public void asignarPuntos(int cedula){
        c.setPuntos(p.sumarPuntos());
    }
    // metodo para pagar con puntos, resta los puntos avtuales de la persona con los del pedido
    public boolean pagarPedidoConPuntos(int puntos){
        int puntosActualizados = c.getPuntos() - p.sumarPuntos();
        c.setPuntos(puntosActualizados);
        estaPago = true;
        return estaPago;
    }
    
    public void pagarEnCaja(int precio){
        p.getProductos();
        p.calcularPrecioTotal();
        
    }
    
    
}
