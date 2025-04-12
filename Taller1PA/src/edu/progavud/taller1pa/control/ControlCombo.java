/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1pa.control;

import java.util.ArrayList;
import edu.progavud.taller1pa.modelo.*;
import static edu.progavud.taller1pa.modelo.TipoProducto.prodCombo;
import java.util.List;

public class ControlCombo {

    ControlPrincipal cPrinc;
    ControlProductos cProd;
    private List<Combo> combos;
    

    public ControlCombo(ControlPrincipal cPrinc, ControlProductos cProd) {
        this.cPrinc = cPrinc;
        this.cProd = cProd;
        combos = new ArrayList<>();

    }

    public void crearCombo(List<Producto> productosSeleccionados, double precio, String nombreCombo, String descripcion, int cantidad, TipoProducto tipo) {
        double valorPuntos = precio / 100; 
        Combo nuevoCombo = new Combo(productosSeleccionados, precio, nombreCombo, descripcion, cantidad, valorPuntos, tipo);

        combos.add(nuevoCombo);
    }

    public void crearCombosIniciales(ControlProductos ctrlProductos) {
        // Lista de productos precargados
        List<Producto> productos = ctrlProductos.getProductos();

        // Combo 1: Hamburguesa + Coca Cola
        List<Producto> combo1 = List.of(productos.get(0), productos.get(6));
        crearCombo(combo1, 39000.0, "Combo Parrilla + Gaseosa", "Hamburguesa pollo parrilla + Coca Cola", 0, TipoProducto.prodCombo);

        // Combo 2: Whopper Queso + Pepsi
        List<Producto> combo2 = List.of(productos.get(1), productos.get(9));
        crearCombo(combo2, 36000.0, "Combo Whopper + Pepsi", "Whopper Queso + Pepsi", 0, TipoProducto.prodCombo);

        // Combo 3: Crispy Chicken BBQ + Manzana Postobon
        List<Producto> combo3 = List.of(productos.get(2), productos.get(8));
        crearCombo(combo3, 38000.0, "Combo Crispy + Manzana", "Hamburguesa Crispy Chicken BBQ + Manzana Postobón", 0, TipoProducto.prodCombo);

        // Combo 4: King Pollo + Sprite
        List<Producto> combo4 = List.of(productos.get(3), productos.get(10));
        crearCombo(combo4, 32000.0, "Combo King Pollo + Sprite", "King Pollo + Sprite", 0, TipoProducto.prodCombo);

        // Combo 5: Wrap Roast Beef + Quatro
        List<Producto> combo5 = List.of(productos.get(16), productos.get(11));
        crearCombo(combo5, 30000.0, "Combo Wrap + Quatro", "Wrap Roast Beef + Quatro", 0, TipoProducto.prodCombo);

        // Combo 6: Nuggets + Pepsi
        List<Producto> combo6 = List.of(productos.get(25), productos.get(9));
        crearCombo(combo6, 40000.0, "Combo Nuggets + Pepsi", "Nuggets + Pepsi", 0, TipoProducto.prodCombo);
    }
    
    public double calcularPrecioCombos(){
        double precioCombos = 0;
        for(Combo combo : combos){
            precioCombos += combo.getPrecio()*combo.getCantidad();
        }return precioCombos;
    } 
    
    
    
    



}
