package edu.progavud.taller1pa.control;

import edu.progavud.taller1pa.modelo.*;
import java.util.ArrayList;
import java.util.List;

public class ControlProductos {
    private List<Producto> productos;
  
    public ControlProductos(ControlPrincipal cp) {
        ControlPrincipal cprincipal = cp;
    }
    
    public void cargarProductos(){
        
        productos.add(new Producto(35000.0,0,"Hamburguesa Pollo a la parrilla","El delicioso sabor del pollo a la parrilla, viene con una capa de mayonesa cremosa,lechuga fresca picada, tomate,y un sabroso filete", prodInd,35));
    }
    
    
    
    
    
    
    
    //public ArrayList<Producto> obtenerProductoPorCategoria(String tipo){
       // ArrayList<Producto> productosFiltrados = new ArrayList<>();
        //for(Producto producto : productos){
            //if(producto.getTipo() == tipo){
                //productosFiltrados.add(producto);
           // }
        //}
       // return productosFiltrados;
    //}
      
    public void calcularValorPuntos(){
        
    }
    
}