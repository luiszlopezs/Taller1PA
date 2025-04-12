
package edu.progavud.taller1pa.control;

import edu.progavud.taller1pa.modelo.*;

public class ControlPedidos {
    private Pedido pedidoActual;
    private ControlBucket cBucket;
    private ControlCombo cCombo;
    private ControlProductos cProducto;
    private ControlPrincipal cPrin;

    public ControlPedidos(ControlPrincipal cPrin) {
        this.cPrin = cPrin;
        
    }
    
    public double calcularPrecioPedido(){
        double precioPedido= cBucket.calcularPrecioBuckets() + cCombo.calcularPrecioCombos() + cProducto.calcularPrecioProductos();
        return precioPedido;
    }
    
    
    
}
