package edu.progavud.taller1pa.modelo;
import java.util.List;
import java.util.ArrayList;

public class Combo {
    
    private List<String> extras; //Añadidos como salsas,extra-queso,adicional de chips
    private static final int costoAgrandar = 5000; //Costo para agrandar cualquier ración de comida
    private static final int costoExtra = 1000; //Costo por añadir cualquier extra
    
    private List<Producto> productosCombo;
    private boolean esAgrandado = false;
    private boolean tieneExtras = false;
    
    protected double precio;
    protected String nombre;
    protected String descripcion;
    protected int cantidad;
    protected double valorPuntos; //valor en puntos que otorga, de acuerdo a su precio
    protected TipoProducto tipo; 

    public Combo(List<Producto> productosCombo, double precio, String nombre, String descripcion, int cantidad, double valorPuntos, TipoProducto tipo) {
        this.productosCombo = productosCombo;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.valorPuntos = valorPuntos;
        this.tipo = tipo;
    }

    

    public Combo() {
        this.extras = new ArrayList<>();
        this.productosCombo = new ArrayList<>();
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
