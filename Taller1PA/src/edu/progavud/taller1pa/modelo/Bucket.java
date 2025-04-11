
package edu.progavud.taller1pa.modelo;

import java.util.ArrayList;

public class Bucket  {
    
    private ArrayList<PiezaPollo> piezasPollo;
    protected double precio;
    protected String nombre;
    protected String descripcion;
    protected int cantidad;
    protected double valorPuntos; //valor en puntos que otorga, de acuerdo a su precio
    protected TipoProducto tipo; 

    public Bucket(ArrayList<PiezaPollo> piezasPollo, double precio, String nombre, String descripcion, int cantidad, double valorPuntos, TipoProducto tipo) {
        this.piezasPollo = piezasPollo;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.valorPuntos = valorPuntos;
        this.tipo = tipo;
    }
    


    public Bucket() {
    }
    
    
    
    public void agregarProducto(PiezaPollo piezasPollo){
        this.piezasPollo.add(piezasPollo);
        this.precio += piezasPollo.getPrecio();
    }
    

    public ArrayList<PiezaPollo> getPiezas() {
        return piezasPollo;
    }

    public void setPiezas(ArrayList<PiezaPollo> piezasPollo) {
        this.piezasPollo = piezasPollo;
    }
    
    
    
    
    
}
