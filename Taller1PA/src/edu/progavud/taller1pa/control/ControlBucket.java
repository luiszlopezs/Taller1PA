
package edu.progavud.taller1pa.control;
import edu.progavud.taller1pa.modelo.*;
import java.util.ArrayList;
import java.util.List;

public class ControlBucket {
    private ArrayList<Bucket> buckets;
    
    public ControlBucket(ControlPrincipal cp) {
        ControlPrincipal cprincipal = cp;
        buckets = new ArrayList<Bucket>();
    }
    //Método para crear un nuevo Bucket, cada vez que se haga clic en la vista para desencadenar esta accion
    public void crearNuevoBucket(List<Producto> piezasSeleccionadas, double precio, String nombreCombo, String descripcion, int cantidad, TipoProducto tipo){
        double valorPuntos = precio / 100; 
        
        Bucket nuevoBucket= new Bucket(piezasSeleccionadas, precio, nombreCombo, descripcion, cantidad, valorPuntos, tipo);

        buckets.add(nuevoBucket);
    }
    
    public void crearCombosIniciales(ControlProductos ctrlProductos) {
        // Lista de productos precargados
        List<Producto> productos = ctrlProductos.getProductos();

        // Combo 1: Hamburguesa + Coca Cola
        List<Producto> bucket1 ;
        
        
        crearNuevoBucket(combo1, 39000.0, "Bucket", "Hamburguesa pollo parrilla + Coca Cola", 0, TipoProducto.prodCombo);

    }
    
}
