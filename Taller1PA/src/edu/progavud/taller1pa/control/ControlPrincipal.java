
package edu.progavud.taller1pa.control;
import edu.progavud.taller1pa.modelo.*;

public class ControlPrincipal {
    private ControlPedidos cPedido;
    private ControlPagos cPagos;
    private ControlCliente cCliente;
    private ControlVentana cVentana;
    private ControlProductos cProductos;

    public ControlPrincipal() {
        cVentana = new ControlVentana(this);
        cPagos = new ControlPagos(this);
        cProductos = new ControlProductos(this);
        cPedido = new ControlPedidos(this);
        
    }
    
    
}
