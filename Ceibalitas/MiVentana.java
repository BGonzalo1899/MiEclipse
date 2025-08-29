package PrototipoVisual;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MiVentana extends JFrame {

    public MiVentana() {
        this.setTitle("Préstamo de Computadoras");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // ==== TABLA ====
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CI");
        modelo.addColumn("Equipo");
        modelo.addColumn("Cantidad");
        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);

        // =====================================================================
      
        JPanel panelForm = new JPanel();
        panelForm.setLayout(new BoxLayout(panelForm, BoxLayout.Y_AXIS));

        JLabel lblCI = new JLabel("CI: ");
        JTextField txtCI = new JTextField();
        txtCI.setMaximumSize(new Dimension(150, 25));
        
       
        JLabel lblEst = new JLabel("A que grupo pertenece el estudiante?");
        String[] grupos = {"No es estudiante","Grupo 1", "Grupo 2", "Grupo 3"};
        JComboBox Grupos = new JComboBox(grupos);
        Grupos.setMaximumSize(new Dimension(150, 25));
        
        
        JLabel lblcantCeibal = new JLabel("Cantidad de equipos a prestar");
        JSpinner txtCeibal = new JSpinner();
        txtCeibal.setMaximumSize(new Dimension(150, 25));
       
        JLabel lblNumero = new JLabel("Nro de equipo");
        JTextField txtNumero = new JTextField();
        txtNumero.setMaximumSize(new Dimension(150, 25));

        JButton boton = new JButton("Registrar Préstamo");

   
        panelForm.add(lblCI);
        panelForm.add(txtCI);
        panelForm.add(lblcantCeibal);
        panelForm.add(txtCeibal);
        panelForm.add(lblNumero);
        panelForm.add(txtNumero);   
        panelForm.add(lblEst);
        panelForm.add(Grupos);
        panelForm.add(new JLabel("    "));
        panelForm.add(boton);

        // ====ESTRUCTURA PRINCIPAL====
        this.setLayout(new BorderLayout());
        this.add(panelForm, BorderLayout.WEST);
        this.add(scroll, BorderLayout.CENTER);
    }
}
