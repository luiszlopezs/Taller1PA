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

public class MainView extends JFrame {

    private JButton btnCatalogo;
    private JButton btnVerPedidos;
    private JButton btnSalir;

    public MainView() {
        setTitle("Sistema de Pedidos - KFC");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridLayout(4, 1, 15, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        JLabel titulo = new JLabel("Bienvenido al Sistema de Pedidos", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));

        btnCatalogo = new JButton("🛍️ Ver Catálogo de Productos");
        btnVerPedidos = new JButton("📦 Ver Pedidos");
        btnSalir = new JButton("❌ Salir");

        panel.add(titulo);
        panel.add(btnCatalogo);
        panel.add(btnVerPedidos);
        panel.add(btnSalir);

        add(panel);
    }

    // Métodos para que el controlador acceda a los botones
    public JButton getBtnCatalogo() {
        return btnCatalogo;
    }

    public JButton getBtnVerPedidos() {
        return btnVerPedidos;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }
}
