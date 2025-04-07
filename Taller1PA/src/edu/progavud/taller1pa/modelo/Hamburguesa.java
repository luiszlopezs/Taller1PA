
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1pa.modelo;

public class Hamburguesa extends Producto  {
    
    private boolean esVegano;

    public Hamburguesa(int precio, int cantidad, String nombre, String descripcion, String categoría, int valorPuntos) {
        super(precio, cantidad, nombre, descripcion, categoría, valorPuntos);
    }

    

    public Hamburguesa() {
    }

   

    public boolean isEsVegano() {
        return esVegano;
    }

    public void setEsVegano(boolean esVegano) {
        this.esVegano = esVegano;
    }
    
    
    
}