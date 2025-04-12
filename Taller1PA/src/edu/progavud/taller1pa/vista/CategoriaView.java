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
import java.util.HashMap;
import java.util.Map;

public class CategoriaView extends JFrame {

    private final Map<String, JButton> botonesCategoria;

    public CategoriaView() {
        setTitle("Selecciona una Categoría");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        botonesCategoria = new HashMap<>();
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridLayout(2, 3, 15, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        String[] categorias = {"Buckets", "Hamburguesas", "Wraps", "Alitas", "Nuggets", "Combos"};

        for (String categoria : categorias) {
            JButton boton = new JButton(categoria);
            boton.setFont(new Font("Arial", Font.BOLD, 16));
            botonesCategoria.put(categoria, boton);
            panel.add(boton);
        }

        add(panel);
    }

    // Permite al controlador acceder a los botones
    public Map<String, JButton> getBotonesCategoria() {
        return botonesCategoria;
    }
}
