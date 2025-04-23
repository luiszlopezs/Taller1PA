/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1pa.control;


import edu.progavud.taller1pa.modelo.Bucket;
import edu.progavud.taller1pa.modelo.TipoProducto;
import java.util.ArrayList;

/**
 *
 * @author hailen
 */
public class ControlBucket {
    private ArrayList<Bucket> buckets;
    
    public ControlBucket(ControlPrincipal cp) {
        ControlPrincipal cprincipal = cp;
        buckets = new ArrayList<>();
    }

    // Método para crear un nuevo Bucket vacío
    public void crearNuevoBucket(String nombreBucket, String descripcion, int cantidad, TipoProducto tipo) {
        Bucket nuevoBucket = new Bucket(nombreBucket, descripcion, cantidad, tipo);
        buckets.add(nuevoBucket);
    }
    


}
