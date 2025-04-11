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

        // Ruta dinámica para la imagen
        String rutaImagen = "imagenes/" + obtenerNombreImagen(producto.getNombre());
        ImageIcon icono = new ImageIcon(rutaImagen);
        Image imagenEscalada = icono.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
        JLabel imagenLabel = new JLabel(new ImageIcon(imagenEscalada), JLabel.CENTER);
        imagenLabel.setPreferredSize(new Dimension(150, 100));

        JTextArea descripcion = new JTextArea(producto.getDescripcion() + "\nPuntos: " + producto.getValorPuntos());
        descripcion.setWrapStyleWord(true);
        descripcion.setLineWrap(true);
        descripcion.setEditable(false);
        descripcion.setBackground(null);
        descripcion.setFont(new Font("Arial", Font.PLAIN, 12));

        JButton btnAgregar = new JButton("Agregar");
        botonesAgregar.put(producto, btnAgregar);

        panel.add(imagenLabel, BorderLayout.NORTH);
        panel.add(descripcion, BorderLayout.CENTER);
        panel.add(btnAgregar, BorderLayout.SOUTH);

        return panel;
    }

    private String obtenerNombreImagen(String nombreProducto) {
        switch (nombreProducto.toLowerCase()) {
            // Hamburguesas
            case "hamburguesa clásica": return "hamburguesaClasica.png";
            case "hamburguesa carne": return "hamburguesaCarne.png";
            case "hamburguesa papas pollo": return "hamburguesaPapasPollo.png";
            case "hamburguesa pollo": return "hamburguesaPollo.png";
            case "hamburguesa tocino": return "hamburguesaTocino.png";

            // Combos
            case "combo clásico": return "comboClasico.png";
            case "combo nuggets": return "comboNuggets.png";
            case "combo wrap de pollo": return "comboWrapDePollo.png";
            case "combo familiar": return "comboFamiliar.png";
            case "combo ensalada": return "comboEnsalada.png";

            // Buckets
            case "bucket 5 piezas": return "bucket5Piezas.png";
            case "bucket alitas": return "bucketAlitas.png";
            case "bucket vacío": return "bucketVacio.png";

            // Gaseosas
            case "gaseosa 7up": return "gaseosa7Up.png";
            case "gaseosa coca cola": return "gaseosaCocaCola.png";
            case "gaseosa manzana": return "gaseosaManzana.png";
            case "gaseosa pepsi": return "gaseosaPepsi.png";
            case "gaseosa quattro": return "gaseosaQuatro.png";
            case "gaseosa sprite": return "gaseosaSprite.png";

            // Otros productos
            case "nuggets de pollo": return "nuggetsDePollo.png";
            case "wrap de pollo": return "wrapDePollo.png";
            case "alitas picantes": return "alitasPicantes.png";
            case "alitas bbq": return "alitasBbq.png";

            default: return "default.png"; // En caso de imagen faltante
        }
    }

    public void addAgregarListener(Producto producto, ActionListener listener) {
        if (botonesAgregar.containsKey(producto)) {
            botonesAgregar.get(producto).addActionListener(listener);
        }
    }
}
