package edu.progavud.taller1pa.modelo;
import java.util.List;
import java.util.ArrayList;

public class Combo extends Producto{
    
    private List<String> extras; //Añadidos como salsas,extra-queso,adicional de chips
    private static final int costoAgrandar = 5000; //Costo para agrandar cualquier ración de comida
    private static final int costoExtra = 1000; //Costo por añadir cualquier extra
    
    private List<Producto> productosCombo;
    private boolean esAgrandado;
    private boolean tieneExtras;

    public Combo(int precio, int cantidad, String nombre, String descripcion, TipoProducto tipo, int valorPuntos) {
        super(precio, cantidad, nombre, descripcion, tipo, valorPuntos);
    }

    public Combo() {
    }
    
    public void agrandarProducto(int costoAgrandar){
        this.esAgrandado = true;
        this.precio += costoAgrandar;
    }
    
    public void agregarExtras(int costoExtra){
        this.tieneExtras = true;
        this.precio += costoExtra;
    }

    public List<String> getExtras() {
        return extras;
    }

    public void setExtras(List<String> extras) {
        this.extras = extras;
    }

    public List<Producto> getProductosCombo() {
        return productosCombo;
    }

    public void setProductosCombo(List<Producto> productosCombo) {
        this.productosCombo = productosCombo;
    }

    public boolean isEsAgrandado() {
        return esAgrandado;
    }

    public void setEsAgrandado(boolean esAgrandado) {
        this.esAgrandado = esAgrandado;
    }

    public boolean isTieneExtras() {
        return tieneExtras;
    }

    public void setTieneExtras(boolean tieneExtras) {
        this.tieneExtras = tieneExtras;
    }
    
    
    
    
    
}
