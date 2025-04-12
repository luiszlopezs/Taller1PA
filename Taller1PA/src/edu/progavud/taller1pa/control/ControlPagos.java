
package edu.progavud.taller1pa.control;

import edu.progavud.taller1pa.modelo.*;

public class ControlPagos {
    private Pago pago;
    private ControlPrincipal cPrin;

    public ControlPagos(ControlPrincipal cPrin) {
        this.cPrin = cPrin;
  
    }
    public double aplicarDescuentos(boolean esMayorDeEdad, boolean esIndigena, double precioPedido){
        
        int descuento = 0;
        
        if(esMayorDeEdad){
            descuento += 10; 
        }
        if(esIndigena){
            descuento += 8;
        }
        double precioConDescuento = precioPedido*(descuento/100);
        return precioConDescuento;
    }
    
    
    
}
