
package edu.progavud.taller1pa.modelo;
import java.util.ArrayList;

public class Pedido {
    private String nombre;
    private String tipoPedido; //Para llevar o para la mesa
    private ArrayList<Producto> productos;

    public Pedido(String nombre, String tipoPedido, ArrayList<Producto> productos) {
        this.nombre = nombre;
        this.tipoPedido = tipoPedido;
        this.productos = productos;
    }
   
    public Pedido() {
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }
    
    public int calcularPrecioTotal(){ //Método que calcula el precio de pedido, accediendo al precio de cada producto y multiplicándolo por la cantidad
        int total = 0;
        for(Producto p: productos){
            total += (p.getPrecio()* p.getCantidad());
        }
        return total;
    }
}
