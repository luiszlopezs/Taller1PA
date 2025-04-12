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
import java.awt.*;

public class PagoView extends JFrame {

    private JButton btnDatafono;
    private JButton btnCaja;
    private JButton btnPuntos;

    public PagoView() {
        setTitle("Selecciona Método de Pago");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        JLabel lblTitulo = new JLabel("¿Cómo deseas pagar?", JLabel.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));

        btnDatafono = new JButton("💳 Tarjeta (Datafono)");
        btnCaja = new JButton("🧾 Pagar en Caja");
        btnPuntos = new JButton("🪙 Pagar con Puntos");

        panel.add(lblTitulo);
        panel.add(btnDatafono);
        panel.add(btnCaja);
        panel.add(btnPuntos);

        add(panel);
    }

    // Getters para que el controlador acceda a los botones
    public JButton getBtnDatafono() {
        return btnDatafono;
    }

    public JButton getBtnCaja() {
        return btnCaja;
    }

    public JButton getBtnPuntos() {
        return btnPuntos;
    }
}
