package edu.progavud.taller1pa.modelo;

import java.util.ArrayList;
import java.util.List;

public class Bucket  {
    
    private List<Producto> piezasPollo;
    protected double precio;
    protected String nombre;
    protected String descripcion;
    protected int cantidad;
    protected double valorPuntos; //valor en puntos que otorga, de acuerdo a su precio
    protected TipoProducto tipo; 

    public Bucket( String nombre, String descripcion, int cantidad, TipoProducto tipo) {
        this.piezasPollo = new ArrayList<>();
        this.precio = 0.0;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.valorPuntos = 0.0;
        this.tipo = tipo;
    }
    
    public Bucket() {
    }
  
    public void agregarProducto(Producto piezasPollo){
        this.piezasPollo.add(piezasPollo);
        this.precio += piezasPollo.getPrecio();
    }
    
        // Método para calcular los puntos en base al precio
    public void calcularValorPuntos() {
        this.valorPuntos = this.precio / 100;
    }

    public List<Producto> getPiezas() {
        return piezasPollo;
    }

    public void setPiezas(List<Producto> piezasPollo) {
        this.piezasPollo = piezasPollo;
    }

    public List<Producto> getPiezasPollo() {
        return piezasPollo;
    }

    public void setPiezasPollo(List<Producto> piezasPollo) {
        this.piezasPollo = piezasPollo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorPuntos() {
        return valorPuntos;
    }

    public void setValorPuntos(double valorPuntos) {
        this.valorPuntos = valorPuntos;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }
    
    
    public int aumentarCantidadBucket(){
        this.cantidad++;
        return cantidad;
    }
    
    
    
    
    
    
}