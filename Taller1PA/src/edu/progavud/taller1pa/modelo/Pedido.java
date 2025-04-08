/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1pa.modelo;

import java.util.ArrayList;

/**
 *
 * @author hailen
 */
public class Pedido {
    
    private String nombre;
    private String tipoPedido;
    private ArrayList<Producto> productos;
    private int sumaPuntos;

    public Pedido(String nombre, String tipoPedido, ArrayList<Producto> productos, int sumaPuntos) {
        this.nombre = nombre;
        this.tipoPedido = tipoPedido;
        this.productos = productos;
        this.sumaPuntos = sumaPuntos;
    }

    public Pedido() {
    }
    
    public double calcularPrecioTotal(){
        double precioTotal = 0;
        for(Producto prod: this.productos){
            precioTotal += (prod.getPrecio()*prod.getCantidad());
            
        }
        return precioTotal;
    }
    
    public int sumarPuntos(){ // recorre la lista de productos y suma los puntos acumulados
        sumaPuntos = 0;
        for (Producto producto : productos) {
            sumaPuntos += producto.getValorPuntos();
        }
        return sumaPuntos;
    }
    
    public void anadirProducto(Producto producto){ // Metodo para añadir productos al pedido
        productos.add(producto);
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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getSumaPuntos() {
        return sumaPuntos;
    }

    public void setSumaPuntos(int sumaPuntos) {
        this.sumaPuntos = sumaPuntos;
    }
    
    
}
