
package edu.progavud.taller1pa.modelo;

import java.util.ArrayList;

public class Bucket extends Producto {
    
    private ArrayList<Producto> piezas;
    protected double precio;
    protected String nombre;
    protected String descripcion;
    protected int cantidad;
    protected double valorPuntos; //valor en puntos que otorga, de acuerdo a su precio
    protected TipoProducto tipo; 



    public Bucket() {
    }
    
    
    
    public void agregarProducto(Producto piezas){
        this.piezas.add(piezas);
        this.precio += piezas.getPrecio();
    }
    

    public ArrayList<Producto> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Producto> piezas) {
        this.piezas = piezas;
    }
    
    
    
    
    
}
