
package edu.progavud.taller1pa.modelo;

import java.util.ArrayList;

public class Bucket extends Producto {
    
    private ArrayList<Producto> piezas;

    public Bucket(int precio, int cantidad, String nombre, String descripcion, String categoría, int valorPuntos) {
        super(precio, cantidad, nombre, descripcion, categoría, valorPuntos);
    }

    public Bucket() {
    }
    
    
    
    public void agregarProducto(Producto piezas){
        this.piezas.add(piezas);
        this.precio += piezas.getPrecio();
    }
    
    public void calcularPrecioTotal(){ //Método que calcula el precio de pedido, accediendo al precio de cada producto y multiplicándolo por la cantidad
        double precioTotal = 0;
        for(Producto pieza: piezas){
            precioTotal += (pieza.getPrecio()* pieza.getCantidad());
        }
        this.precio = precioTotal;
    }

    public ArrayList<Producto> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Producto> piezas) {
        this.piezas = piezas;
    }
    
    
    
    
    
}
