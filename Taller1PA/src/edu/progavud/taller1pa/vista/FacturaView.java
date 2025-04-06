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
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.UUID;

public class FacturaView extends JFrame {

    private JTable tablaFactura;
    private DefaultTableModel modeloTabla;
    private JLabel lblTotal;
    private JLabel lblTurno;
    private JButton btnVolverInicio;

    public FacturaView(List<Producto> productos) {
        setTitle("Factura Generada");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents(productos);
    }

    private void initComponents(List<Producto> productos) {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Tabla de productos
        String[] columnas = {"Producto", "Cantidad", "Precio Unitario", "Subtotal"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaFactura = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaFactura);

        double total = 0;
        for (Producto p : productos) {
            double subtotal = p.getPrecio() * p.getCantidad();
            total += subtotal;
            modeloTabla.addRow(new Object[]{
                p.getNombre(),
                p.getCantidad(),
                "$" + p.getPrecio(),
                "$" + subtotal
            });
        }

        // Total
        lblTotal = new JLabel("Total pagado: $" + total);
        lblTotal.setFont(new Font("Arial", Font.BOLD, 16));

        // Turno generado (simulado con UUID acortado)
        String turno = UUID.randomUUID().toString().substring(0, 6).toUpperCase();
        lblTurno = new JLabel("Turno asignado: " + turno);
        lblTurno.setFont(new Font("Arial", Font.BOLD, 18));
        lblTurno.setHorizontalAlignment(SwingConstants.CENTER);

        // Botón
        btnVolverInicio = new JButton("Volver al Inicio");

        JPanel panelInferior = new JPanel(new BorderLayout());
        panelInferior.add(lblTotal, BorderLayout.WEST);
        panelInferior.add(btnVolverInicio, BorderLayout.EAST);

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(lblTurno, BorderLayout.NORTH);
        panel.add(panelInferior, BorderLayout.SOUTH);

        add(panel);
    }

    public void addVolverInicioListener(ActionListener listener) {
        btnVolverInicio.addActionListener(listener);
    }

    public static void main(String[] args) {
        List<Producto> productos = List.of(
            new Producto(15000, 2, "Hamburguesa Clásica", "Carne 100% res", "Hamburguesas", 15),
            new Producto(12000, 1, "Wrap de Pollo", "Pollo crocante", "Wraps", 12)
        );

        SwingUtilities.invokeLater(() -> {
            FacturaView vista = new FacturaView(productos);
            vista.setVisible(true);
        });
    }
}
