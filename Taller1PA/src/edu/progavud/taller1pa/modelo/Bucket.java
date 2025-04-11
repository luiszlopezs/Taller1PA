
package edu.progavud.taller1pa.modelo;

import java.util.ArrayList;

public class Bucket extends Producto {
    
    private ArrayList<Producto> piezas;

    public Bucket(int precio, int cantidad, String nombre, String descripcion, TipoProducto tipo, int valorPuntos) {
        super(precio, cantidad, nombre, descripcion, tipo, valorPuntos);
    }

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
