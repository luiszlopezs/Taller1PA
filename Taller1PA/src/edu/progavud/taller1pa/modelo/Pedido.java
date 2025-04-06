
package edu.progavud.taller1pa.modelo;

public class Pedido {
    private int precio;
    private int cantidad;
    private String nombre;

    public Pedido(int precio, int cantidad, String nombre) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public Pedido() {
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
