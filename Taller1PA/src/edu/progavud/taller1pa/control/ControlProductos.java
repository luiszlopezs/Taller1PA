package edu.progavud.taller1pa.control;

import edu.progavud.taller1pa.modelo.*;
import static edu.progavud.taller1pa.modelo.TipoProducto.prodBucket;
import static edu.progavud.taller1pa.modelo.TipoProducto.prodCombo;
import static edu.progavud.taller1pa.modelo.TipoProducto.prodInd;
import java.util.ArrayList;
import java.util.List;

public class ControlProductos {
    private List<Producto> productos;
  
    public ControlProductos(ControlPrincipal cp) {
        ControlPrincipal cprincipal = cp;
        productos = new ArrayList<Producto>();
    }
    
    public void cargarProductos(){
        
        productos.add(new Producto(35000.0,0,"HAMBURGUESA POLLO A LA PARRILLA","El delicioso sabor del pollo a la parrilla, viene con una capa de mayonesa cremosa,lechuga fresca picada, tomate,y un sabroso filete", prodInd,35));
        productos.add(new Producto(30000.0,0,"HAMBURGUESA WHOPPER QUESO","Nuestra WHOPPER® Queso está preparada con queso americano, carne de res a la parrilla de 113gr, jugosos tomates, lechuga recién cortada, mayonesa, pepinillos y cebollas en rodajas, sobre un pan suave con ajonjolí", prodInd,30));
        productos.add(new Producto(36000.0,0,"HAMBURGUESA CRISPY CHICKEN BBQ","El sabroso sabor a pollo crujiente que ya conoces con lechuga fresca picada, tomate, una capa de mayonesa cremosa, servida sobre un pan suave, le agregamos el delicioso sabor a tocino rebanado, salsa BBQ.", prodInd,36));
        productos.add(new Producto(26000.0,0,"HAMBURGUESA KING POLLO","Nuestro original King de Pollo® se prepara con pollo empanizado con lechugas y mayonesa cremosa sobre un pan suave alargado con ajonjolí.", prodInd,26));
        productos.add(new Producto(29000.0,0,"HAMBURGUESA KING POLLO QUESO TOCINETA","Nuestro King de pollo® Queso Tocineta cuenta con un delicioso pollo empanizado de 106gr, Queso americano, tocineta, lechuga y mayonesa sobre un pan sandwich tostado con ajonjolí.", prodInd,29));
        productos.add(new Producto(19000.0,0,"HAMBURGUESA BK CHICKEN","Hamburguesa de Pollo apanado de 78 gr, lechuga y nuestra deliciosa mayonesa sobre un pan tostado con ajonjolí", prodInd,19));
        
        productos.add(new Producto(6000.0,0,"Coca Cola","Bebida gaseosa sabor a cola negra, 1.5L", prodInd,6));
        productos.add(new Producto(5000.0,0,"SevenUp","Bebida gaseosa sabor a lima,1.5L", prodInd,5));
        productos.add(new Producto(5000.0,0,"Manzana Postobon","Bebida gaseosa sabor a manzana 1.5", prodInd,5));
        productos.add(new Producto(6000.0,0,"Pepsi","Bebida gaseosa sabor a cola negra, 1.5L", prodInd,6));
        productos.add(new Producto(6000.0,0,"Sprite","Bebida gaseosa sabor a lima, 1.5L", prodInd,6));
        productos.add(new Producto(6000.0,0,"Quatro","Bebida gaseosa sabor a toronja, 1.5L", prodInd,6));
        
        productos.add(new Producto(22000.0,0,"Wrap hawaino","Jamon de Cerdo, Piña Calada, Queso Mozzarella y Mayonesa", prodInd,22));
        productos.add(new Producto(17000.0,0,"Wrap especial","Jamon de Cerdo, Jamonada, Jamon de Cerdo con Cordero, Queso Mozzarella, Lechuga y Salsa", prodInd,17));
        productos.add(new Producto(23000.0,0,"Wrap super especial","Jamon de Cerdo, Jamonada, Jamon de Cerdo con Cordero, Salami, Tomate, Queso Mozzarella, Lechuga y Salsa", prodInd,23));
        productos.add(new Producto(23000.0,0,"Wrap pollo","Pechuga de Pollo Desmechada, Tomate, Queso Mozzrella, Lechuga, y Mayonesa", prodInd,23));
        productos.add(new Producto(24000.0,0,"Wrap roast Beef","Roast Beef, Tomate, Queso Mozzarella, Lechuga, Salsa BBQ y Salsa Qbano", prodInd,24));
        productos.add(new Producto(25000.0,0,"Wrap costilla","Costilla de Cerdo, Salsa BBQ, Maiz Tierno, Queso Mozzarella, Lechuga y Salsa Qbano", prodInd,25));
        
        productos.add(new Producto(7000.0,0,"Pierna crispy","Pierna de pollo crujiente", prodInd,7));
        productos.add(new Producto(7000.0,0,"Pierna BBQ","Pierna de pollo con sabor BBQ", prodInd,7));
        productos.add(new Producto(8000.0,0,"Pechuga crispy","Pechuga de pollo crujiente", prodInd,8));
        productos.add(new Producto(8000.0,0,"Pechuga BBQ","Pechuga de pollo sabor BBQ", prodInd,8));
        
        productos.add(new Producto(1300.0,0,"Alitas crispy","Alitas de pollo crujiente", prodInd,1.3));
        productos.add(new Producto(1300.0,0,"Alitas BBQ","Alitas de pollo sabor a BBQ", prodInd,1.3));
        
        productos.add(new Producto(35000.0,0,"Nuggets","Nuggets de pollo", prodCombo,35));
        
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
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
<<<<<<< HEAD

    
} 
=======
      
    public void calcularValorPuntos(){
        
    }
    
}
>>>>>>> ca0331918c4c2d549f0eedb87bb716bf5e1f069d
