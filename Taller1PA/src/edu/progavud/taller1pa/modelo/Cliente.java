
package edu.progavud.taller1pa.modelo;

/**
 *
 * @author hailen
 */
public class Cliente {
    private int puntos;
    private int cedula;
    private boolean esMayorDeEdad;
    private boolean esIndigena;

    public Cliente(int puntos, int cedula, boolean esMayorDeEdad, boolean esIndigena) {
        this.puntos = puntos;
        this.cedula = cedula;
        this.esMayorDeEdad = esMayorDeEdad;
        this.esIndigena = esIndigena;
    }

    public Cliente() {
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public boolean isEsMayorDeEdad() {
        return esMayorDeEdad;
    }

    public void setEsMayorDeEdad(boolean esMayorDeEdad) {
        this.esMayorDeEdad = esMayorDeEdad;
    }

    public boolean isEsIndigena() {
        return esIndigena;
    }

    public void setEsIndigena(boolean esIndigena) {
        this.esIndigena = esIndigena;
    }
    
    
    
    
    
}
