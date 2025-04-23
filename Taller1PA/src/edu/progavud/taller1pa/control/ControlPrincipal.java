
package edu.progavud.taller1pa.control;


public class ControlPrincipal {
    private ControlPedidos cPedido;
    private ControlPagos cPagos;
    private ControlCliente cCliente;
    private ControlVentana cVentana;
    private ControlProductos cProductos;

    public ControlPrincipal(ControlPedidos cPedido, ControlPagos cPagos, ControlCliente cCliente, ControlVentana cVentana, ControlProductos cProductos) {
        this.cPedido = cPedido;
        this.cPagos = cPagos;
        this.cCliente = cCliente;
        this.cVentana = cVentana;
        this.cProductos = cProductos;
    }
    
    
}
