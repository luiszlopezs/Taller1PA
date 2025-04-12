
package edu.progavud.taller1pa.control;

import edu.progavud.taller1pa.modelo.*;


public class ControlPedidos {
    private Pedido pedidoActual;
    

    public ControlPedidos(Pedido pedidoActual) {
        this.pedidoActual = pedidoActual;
    }
    
    public void agregarProductos(){
        pedidoActual.añadirProducto();
    }
    
    
}
