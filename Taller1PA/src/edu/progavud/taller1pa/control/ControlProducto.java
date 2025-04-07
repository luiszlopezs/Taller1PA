/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1pa.control;

/**
 *
 * @author sangr
 */
<<<<<<< HEAD:Taller1PA/src/edu/progavud/taller1pa/control/ControlProducto.java
public class ControlProducto {
=======
public class Alita extends Producto  {
    
    private boolean esVegano;

    public Alita(int precio, int cantidad, String nombre, String descripcion, String categoría, int valorPuntos) {
        super(precio, cantidad, nombre, descripcion, categoría, valorPuntos);
    }

    

    public Alita() {
    }

    public boolean esVegano() {
        return esVegano;
    }

    public void esVegano(boolean esVegano) {
        this.esVegano = esVegano;
    }
    
    
>>>>>>> 06cf3212f99b5b09dd467f6ef376877d9c4cefe1:Taller1PA/src/edu/progavud/taller1pa/modelo/Alita.java
    
}
