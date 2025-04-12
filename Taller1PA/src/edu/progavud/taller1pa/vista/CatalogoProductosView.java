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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatalogoProductosView extends JFrame {

    private final JPanel panelProductos;
    private final List<Producto> productos;
    private final Map<Producto, JButton> botonesAgregar = new HashMap<>();
    private final Map<Producto, JLabel> etiquetasImagen = new HashMap<>();
    private final Map<Producto, String[]> rutasImagenes = new HashMap<>();
    private final Map<Producto, Integer> indicesActuales = new HashMap<>();
    private final Map<Producto, JButton> botonesIzquierda = new HashMap<>();
    private final Map<Producto, JButton> botonesDerecha = new HashMap<>();

    public CatalogoProductosView(List<Producto> productos) {
        this.productos = productos;

        setTitle("Catálogo de Productos");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panelProductos = new JPanel(new GridLayout(0, 2, 15, 15));
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

        // Nombre base para las imágenes
        String baseName = producto.getNombre().replaceAll("\\s+", "").toLowerCase();

        // Rutas
        String[] rutas = new String[6];
        for (int i = 0; i < 6; i++) {
            rutas[i] = "imagenes/" + baseName + (i + 1) + ".png";
        }

        rutasImagenes.put(producto, rutas);
        indicesActuales.put(producto, 0);

        // Imagen inicial
        JLabel imagenLabel = new JLabel("", JLabel.CENTER);
        imagenLabel.setPreferredSize(new Dimension(150, 100));
        actualizarImagen(producto, imagenLabel);
        etiquetasImagen.put(producto, imagenLabel);

        // Botones < >
        JButton btnIzquierda = new JButton("<");
        JButton btnDerecha = new JButton(">");
        botonesIzquierda.put(producto, btnIzquierda);
        botonesDerecha.put(producto, btnDerecha);

        // Panel botones de navegación
        JPanel panelBotones = new JPanel(new BorderLayout());
        panelBotones.add(btnIzquierda, BorderLayout.WEST);
        panelBotones.add(btnDerecha, BorderLayout.EAST);

        JPanel panelImagen = new JPanel(new BorderLayout());
        panelImagen.add(imagenLabel, BorderLayout.CENTER);
        panelImagen.add(panelBotones, BorderLayout.SOUTH);

        // Descripción
        JTextArea descripcion = new JTextArea(producto.getDescripcion() + "\nPuntos: " + producto.getValorPuntos());
        descripcion.setWrapStyleWord(true);
        descripcion.setLineWrap(true);
        descripcion.setEditable(false);
        descripcion.setBackground(null);
        descripcion.setFont(new Font("Arial", Font.PLAIN, 12));

        // Botón Agregar
        JButton btnAgregar = new JButton("Agregar");
        botonesAgregar.put(producto, btnAgregar);

        // Panel general
        panel.add(panelImagen, BorderLayout.NORTH);
        panel.add(descripcion, BorderLayout.CENTER);
        panel.add(btnAgregar, BorderLayout.SOUTH);

        return panel;
    }

    private void actualizarImagen(Producto producto, JLabel etiqueta) {
        String[] rutas = rutasImagenes.get(producto);
        int indice = indicesActuales.get(producto);
        ImageIcon icono = new ImageIcon(rutas[indice]);
        Image imagen = icono.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
        etiqueta.setIcon(new ImageIcon(imagen));
    }

    // Métodos para el controlador:

    public JButton getBotonAgregar(Producto producto) {
        return botonesAgregar.get(producto);
    }

    public JButton getBotonIzquierda(Producto producto) {
        return botonesIzquierda.get(producto);
    }

    public JButton getBotonDerecha(Producto producto) {
        return botonesDerecha.get(producto);
    }

    public JLabel getEtiquetaImagen(Producto producto) {
        return etiquetasImagen.get(producto);
    }

    public void avanzarImagen(Producto producto) {
        int actual = indicesActuales.get(producto);
        actual = (actual + 1) % 6;
        indicesActuales.put(producto, actual);
        actualizarImagen(producto, etiquetasImagen.get(producto));
    }

    public void retrocederImagen(Producto producto) {
        int actual = indicesActuales.get(producto);
        actual = (actual - 1 + 6) % 6;
        indicesActuales.put(producto, actual);
        actualizarImagen(producto, etiquetasImagen.get(producto));
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
