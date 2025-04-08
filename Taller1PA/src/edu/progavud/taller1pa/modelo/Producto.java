
package edu.progavud.taller1pa.modelo;

import java.util.List;

public class Producto {
    
    protected double precio;
    protected String nombre;
    protected String descripcion;
    protected int cantidad;
    protected String categoria; // Alternativas del cliente para ordenar (hamburguesa,bucket,wraps,alitas...)
    protected int valorPuntos; //valor en puntos que otorga, de acuerdo a su precio


    public Producto(double precio, int cantidad, String nombre, String descripcion, String categoria, int valorPuntos) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.valorPuntos = valorPuntos;
    }

    public Producto() {
    }
    
    
    public boolean esDeLaCategoria(String categoria) {
        return this.categoria.equalsIgnoreCase(categoria);
    }

    public double getPrecio() {
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

    public String getCategoría() {
        return categoria;
    }

    public void setCategoría(String categoría) {
        this.categoria = categoría;
    }




    
    
    
    
}
