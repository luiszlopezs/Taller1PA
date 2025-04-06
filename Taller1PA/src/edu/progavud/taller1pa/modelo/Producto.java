
package edu.progavud.taller1pa.modelo;

public class Producto {
    private int Precio;
    private int Cantidad;
    private String nombre;

    public Producto(int Precio, int Cantidad, String nombre) {
        this.Precio = Precio;
        this.Cantidad = Cantidad;
        this.nombre = nombre;
    }

    public Producto() {
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
