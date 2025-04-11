
package edu.progavud.taller1pa.modelo;

import java.util.List;

public class Producto {
    
    protected double precio;
    protected String nombre;
    protected String descripcion;
    protected int cantidad;
    protected double valorPuntos; //valor en puntos que otorga, de acuerdo a su precio
    protected TipoProducto tipo; //alternativas del cliente para ordenar


    public Producto(double precio, int cantidad, String nombre, String descripcion, TipoProducto tipo, double valorPuntos) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.valorPuntos = valorPuntos;
    }

    public Producto() {
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

    public double getValorPuntos() {
        return valorPuntos;
    }

    public void setValorPuntos(double valorPuntos) {
        this.valorPuntos = valorPuntos;
    }


    public void calcularValorPuntos(){
        this.valorPuntos = (this.precio*this.cantidad)/100;
    }


    
    
}
