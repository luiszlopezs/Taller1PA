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

public class ResumenPedidoView extends JFrame {

    private JTable tablaResumen;
    private DefaultTableModel modeloTabla;
    private JButton btnContinuarPago;
    private JLabel lblTotal;

    public ResumenPedidoView(List<Producto> productos) {
        setTitle("Resumen del Pedido");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents(productos);
    }

    private void initComponents(List<Producto> productos) {
        // Panel principal
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Tabla
        String[] columnas = {"Producto", "Cantidad", "Precio Unitario", "Subtotal"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaResumen = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaResumen);

        // Cargar productos
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

        // Total y botón
        lblTotal = new JLabel("Total a pagar: $" + total);
        lblTotal.setFont(new Font("Arial", Font.BOLD, 16));
        btnContinuarPago = new JButton("Continuar a Pago");

        JPanel panelInferior = new JPanel(new BorderLayout());
        panelInferior.add(lblTotal, BorderLayout.WEST);
        panelInferior.add(btnContinuarPago, BorderLayout.EAST);

        // Agregar al panel
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(panelInferior, BorderLayout.SOUTH);

        add(panel);
    }

    public void addContinuarPagoListener(ActionListener listener) {
        btnContinuarPago.addActionListener(listener);
    }

    public static void main(String[] args) {
        // Datos de prueba
        List<Producto> productos = List.of(
            new Producto(15000, 2, "Hamburguesa Clásica", "Carne 100% res", "Hamburguesas", 15),
            new Producto(12000, 1, "Wrap de Pollo", "Pollo crocante", "Wraps", 12)
        );

        SwingUtilities.invokeLater(() -> {
            ResumenPedidoView vista = new ResumenPedidoView(productos);
            vista.setVisible(true);
        });
    }
}
