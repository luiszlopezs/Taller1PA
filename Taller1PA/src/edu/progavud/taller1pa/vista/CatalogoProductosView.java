/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1pa.vista;

/**
 *
 * @author Julian-Rojas-eng
 */

import edu.progavud.taller1pa.modelo.Producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;

public class CatalogoProductosView extends JFrame {

    private JPanel panelProductos;
    private List<Producto> productos;
    private Map<Producto, JButton> botonesAgregar;

    public CatalogoProductosView(List<Producto> productos) {
        this.productos = productos;
        this.botonesAgregar = new HashMap<>();

        setTitle("Catálogo de Productos");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        panelProductos = new JPanel(new GridLayout(0, 3, 15, 15));
        panelProductos.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JScrollPane scrollPane = new JScrollPane(panelProductos);
        add(scrollPane, BorderLayout.CENTER);

        for (Producto producto : productos) {
            JPanel panel = crearPanelProducto(producto);
            panelProductos.add(panel);
        }
    }

    private JPanel crearPanelProducto(Producto producto) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder(producto.getNombre()));

        JLabel imagen = new JLabel("[Imagen]", JLabel.CENTER);
        imagen.setPreferredSize(new Dimension(150, 100));

        JTextArea descripcion = new JTextArea(producto.getDescripcion() + "\nPuntos: " + producto.getValorPuntos());
        descripcion.setWrapStyleWord(true);
        descripcion.setLineWrap(true);
        descripcion.setEditable(false);
        descripcion.setBackground(null);
        descripcion.setFont(new Font("Arial", Font.PLAIN, 12));

        JButton btnAgregar = new JButton("Agregar");
        botonesAgregar.put(producto, btnAgregar);

        panel.add(imagen, BorderLayout.NORTH);
        panel.add(descripcion, BorderLayout.CENTER);
        panel.add(btnAgregar, BorderLayout.SOUTH);

        return panel;
    }

    public void addAgregarListener(Producto producto, ActionListener listener) {
        if (botonesAgregar.containsKey(producto)) {
            botonesAgregar.get(producto).addActionListener(listener);
        }
    }
}
