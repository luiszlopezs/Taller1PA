/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1pa.control;

/**
 *
 * @author sangr
 */
<<<<<<< HEAD:Taller1PA/src/edu/progavud/taller1pa/control/ControlPedido.java
public class ControlPedido {
=======
public class Nugget extends Producto  {
    
    private boolean esVegano;

    public Nugget(int precio, int cantidad, String nombre, String descripcion, String categoría, int valorPuntos) {
        super(precio, cantidad, nombre, descripcion, categoría, valorPuntos);

    }

    public Nugget() {
    }

    public boolean isEsVegano() {
        return esVegano;
    }

    public void setEsVegano(boolean esVegano) {
        this.esVegano = esVegano;
    }


    
    
>>>>>>> 06cf3212f99b5b09dd467f6ef376877d9c4cefe1:Taller1PA/src/edu/progavud/taller1pa/modelo/Nugget.java
    
}
