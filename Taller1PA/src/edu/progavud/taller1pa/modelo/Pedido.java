package edu.progavud.taller1pa.modelo;

import java.util.ArrayList;

public class Pedido {
    
    private String tipoPedido;
    private ArrayList<Producto> productos;
    private double sumaPuntos;
    double precioTotal = 0;
    private Bucket bucket;

    public Pedido( String tipoPedido, ArrayList<Producto> productos, int sumaPuntos) {

        this.tipoPedido = tipoPedido;
        this.productos = productos;
        this.sumaPuntos = sumaPuntos;
    }

    public Pedido() {
    }
    
    public double calcularPrecioTotal(){
        
        for(Producto prod: this.productos){
            precioTotal += (prod.getPrecio()*prod.getCantidad());
            
        }
        return precioTotal;
    }
    ////////
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
    
    public double calcularPuntosTotales(){ // recorre la lista de productos y suma los puntos acumulados
        ///// quite sumapuntos = 0
        for (Producto producto : productos) {
            sumaPuntos += producto.getValorPuntos();
        }
        return sumaPuntos;
    }
    
    public void anadirProducto(Producto producto){ // Metodo para añadir productos al pedido
        productos.add(producto);
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


    public double getSumaPuntos() {
        return sumaPuntos;
    }

    public void setSumaPuntos(int sumaPuntos) {
        this.sumaPuntos = sumaPuntos;
    }

    
    
}
