
package edu.progavud.taller1pa.modelo;

public class Producto {
    
    private int precio;
    private int cantidad;
    private String nombre;
    private String descripcion;
    private int valorPuntos; //valor en puntos que otorga, de acuerdo a su precio

    public Producto(int precio, int cantidad, String nombre, String descripcion, int valorPuntos) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorPuntos = valorPuntos;
    }

    public Producto() {
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int Precio) {
        this.precio = Precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.cantidad = Cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValorPuntos() {
        return valorPuntos;
    }

    public void setValorPuntos(int valorPuntos) {
        this.valorPuntos = valorPuntos;
    }
}
