
package edu.progavud.taller1pa.control;

import edu.progavud.taller1pa.modelo.*;


public class ControlPedidos {
    private Pedido pedidoActual;
    private ControlBucket cBucket;
    private ControlCombo cCombo;
    private ControlProductos cProducto;

    public ControlPedidos(Pedido pedidoActual, ControlBucket cBucket, ControlCombo cCombo, ControlProductos cProducto) {
        this.pedidoActual = pedidoActual;
        this.cBucket = cBucket;
        this.cCombo = cCombo;
        this.cProducto = cProducto;
    }

    public ControlPedidos(Pedido pedidoActual) {
        this.pedidoActual = pedidoActual;
    }
    
    public double calcularPrecioPedido(){
        double precioPedido= cBucket.calcularPrecioBuckets() + cCombo.calcularPrecioCombos() + cProducto.calcularPrecioProductos();
        return precioPedido;
    }
    
    
    
}
