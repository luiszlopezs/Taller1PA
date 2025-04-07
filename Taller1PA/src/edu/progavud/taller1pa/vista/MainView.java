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
import java.awt.event.ActionListener;

public class MainView extends JFrame {

    private JButton btnParaMesa;
    private JButton btnParaLlevar;

    public MainView() {
        setTitle("Quiosco de Autoatención - Inicio");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        JLabel titulo = new JLabel("¿Cómo deseas tu pedido?", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));

        btnParaMesa = new JButton("🪑 Para la Mesa");
        btnParaLlevar = new JButton("🥡 Para Llevar");

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(titulo);
        panel.add(btnParaMesa);
        panel.add(btnParaLlevar);

        add(panel);
    }

    public void addParaMesaListener(ActionListener listener) {
        btnParaMesa.addActionListener(listener);
    }

    public void addParaLlevarListener(ActionListener listener) {
        btnParaLlevar.addActionListener(listener);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainView vista = new MainView();
            vista.setVisible(true);
        });
    }
}
