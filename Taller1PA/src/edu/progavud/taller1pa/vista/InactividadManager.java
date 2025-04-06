/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1pa.vista;

/**
 *
 * @author Julian-Rojas-eng
 */

import javax.swing.*;
import java.awt.event.*;

public class InactividadManager {

    private Timer timer;
    private final int tiempoLimite; // en milisegundos
    private Runnable accionInactividad;

    public InactividadManager(int segundosInactividad, Runnable accionInactividad) {
        this.tiempoLimite = segundosInactividad * 1000;
        this.accionInactividad = accionInactividad;
        crearListenerGlobal();
        iniciarTemporizador();
    }

    private void crearListenerGlobal() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(e -> {
            reiniciarTemporizador();
            return false;
        });

        Toolkit.getDefaultToolkit().addAWTEventListener(e -> {
            reiniciarTemporizador();
        }, AWTEvent.MOUSE_EVENT_MASK | AWTEvent.MOUSE_MOTION_EVENT_MASK);
    }

    private void iniciarTemporizador() {
        timer = new Timer(tiempoLimite, e -> accionInactividad.run());
        timer.setRepeats(false);
        timer.start();
    }

    private void reiniciarTemporizador() {
        if (timer != null) {
            timer.restart();
        }
    }

    public void detener() {
        if (timer != null) {
            timer.stop();
        }
    }
}
