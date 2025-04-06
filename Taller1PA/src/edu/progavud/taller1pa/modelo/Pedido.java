
package edu.progavud.taller1pa.modelo;
import java.util.ArrayList;

public class Pedido {
    private int precio;
    private String nombre;
    private ArrayList<Producto> productos;

    public Pedido(int precio, String nombre, ArrayList<Producto> productos) {
        this.precio = precio;
        this.nombre = nombre;
        this.productos = productos;
    }
   
    public Pedido() {
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
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
    
}
