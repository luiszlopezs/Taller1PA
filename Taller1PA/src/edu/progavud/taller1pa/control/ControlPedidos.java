
package edu.progavud.taller1pa.control;

import edu.progavud.taller1pa.modelo.Pedido;
import edu.progavud.taller1pa.modelo.Producto;

public class ControlPedidos {
    private Pedido pedidoActual;
    

    public ControlPedidos(Pedido pedidoActual) {
        this.pedidoActual = pedidoActual;
    }
    
    public void agregarProductos(){
        pedidoActual.añadirProducto();
    }
    
    
}
