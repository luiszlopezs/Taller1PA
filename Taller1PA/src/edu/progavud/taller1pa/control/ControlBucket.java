
package edu.progavud.taller1pa.control;


import edu.progavud.taller1pa.modelo.Bucket;
import edu.progavud.taller1pa.modelo.TipoProducto;
import java.util.ArrayList;

public class ControlBucket {
    private ArrayList<Bucket> buckets;
    private Bucket bucket;
    
    public ControlBucket(ControlPrincipal cp) {
        ControlPrincipal cprincipal = cp;
        buckets = new ArrayList<>();
    }

    // Método para crear un nuevo Bucket vacío
    public void crearNuevoBucket(String nombreBucket, String descripcion, int cantidad, TipoProducto tipo) {
        Bucket nuevoBucket = new Bucket(nombreBucket, descripcion, cantidad, tipo);
        buckets.add(nuevoBucket);
    }
    /*
    public double calcularPrecioBucket(){
        double precioBucket = bucket.getPrecio();
        return precioBucket;
    }
    */
    public double calcularPrecioBuckets(){
        double precioBuckets = 0;
        for(Bucket bucket : buckets){
            precioBuckets += bucket.getPrecio()*bucket.getCantidad();
        }return precioBuckets;
    } 
    


}