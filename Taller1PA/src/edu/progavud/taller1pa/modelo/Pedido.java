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
    
    private ArrayList<Producto> productos;
    private ArrayList<Bucket> buckets;
    private ArrayList<Combo> combos;
    private double sumaPuntos;
    double precioProductos = 0;
    double precioBuckets = 0;
    double precioCombos= 0;
    

 

    public Pedido(ArrayList<Producto> productos, ArrayList<Bucket> buckets, ArrayList<Combo> combos, double sumaPuntos) {
        this.productos = productos;
        this.buckets = buckets;
        this.combos = combos;
        this.sumaPuntos = sumaPuntos;
        
    }
    

    public Pedido() {
    }
    
    public double calcularPrecioProductos(){
        
        for(Producto prod: this.productos){
            precioProductos += (prod.getPrecio()*prod.getCantidad());
            
        }
        return precioProductos;
    }
    


    public ArrayList<Bucket> getBuckets() {
        return buckets;
    }

    public void setBuckets(ArrayList<Bucket> buckets) {
        this.buckets = buckets;
    }

    public ArrayList<Combo> getCombos() {
        return combos;
    }

    public void setCombos(ArrayList<Combo> combos) {
        this.combos = combos;
    }

  
    
    
    
    /*
    
    public void calcularPrecioBucket(){ //Método que calcula el precio del bucket, accediendo al precio de cada producto y multiplicándolo por la cantidad
        for(Producto pieza: bucket.getPiezas()){
            precioTotal += (pieza.getPrecio()* pieza.getCantidad());
        }
        this.precioTotal = precioTotal;
    }
    
    public double calcularPuntosBucket(){ // metodo que calcula solo la suma de puntos del bucket para que al momento de que se calculen todos los puntos no haya error 
        for(Producto pieza: bucket.getPiezas()){
            sumaPuntos += (pieza.getValorPuntos()* pieza.getCantidad());
        }
        return sumaPuntos;
    }
    */
    
    
    public double calcularPuntos(){ // recorre la lista de productos y suma los puntos acumulados
        ///// quite sumapuntos = 0
        for (Producto producto : productos) {
            sumaPuntos += producto.getValorPuntos();
        }
        return sumaPuntos;
    }
    
    public void anadirProducto(Producto producto){ // Metodo para añadir productos al pedido
        productos.add(producto);
    }

    
    
}
