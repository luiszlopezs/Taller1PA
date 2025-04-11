/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1pa.control;

import java.util.ArrayList;


import edu.progavud.taller1pa.modelo.*;
import java.util.List;


/**
 *
 * @author hailen
 */
public class ControlCombo {
    
    ControlPrincipal cPrinc;
    ControlProductos cProd;
    private List<Combo> combos;
    
    public ControlCombo(ControlPrincipal cPrinc, ControlProductos cProd){
        this.cPrinc = cPrinc;
        this.cProd = cProd;
        combos = new ArrayList<>();
        new Combo();
    }
    
    public void activarArraylistCombo() {
        
        for (Producto prod : cProd.getProductos()){
            List<Producto> productosSeleccionados = new ArrayList<>();
            
            if (prod.getNombre().contains("HAMBURGUESA WHOPPER QUESO") || prod.getNombre().contains("Coca Cola")){
                productosSeleccionados.add(prod);
            }
            
        }
        
        Combo combo1 = new Combo(productosSeleccionados,0,"ss","ss",1,1,prodCombo);
        
        
    }
    
}
