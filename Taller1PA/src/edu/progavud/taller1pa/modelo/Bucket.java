
package edu.progavud.taller1pa.modelo;

import java.util.List;

public class Bucket  {
    
    private List<Producto> piezasPollo;
    protected double precio;
    protected String nombre;
    protected String descripcion;
    protected int cantidad;
    protected double valorPuntos; //valor en puntos que otorga, de acuerdo a su precio
    protected TipoProducto tipo; 

    public Bucket(List<Producto> piezasPollo, double precio, String nombre, String descripcion, int cantidad, double valorPuntos, TipoProducto tipo) {
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
  
    public void agregarProducto(Producto piezasPollo){
        this.piezasPollo.add(piezasPollo);
        this.precio += piezasPollo.getPrecio();
    }
    

    public List<Producto> getPiezas() {
        return piezasPollo;
    }

    public void setPiezas(List<Producto> piezasPollo) {
        this.piezasPollo = piezasPollo;
    }
    
    
    
    
    
}
