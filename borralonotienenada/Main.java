package VtnArrayList;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {
	Logica gestor = new Logica();
	public Main(){
		
	this.setTitle("Ventana Principal"); 
	this.setSize(800, 600); 
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	this.setLocationRelativeTo(null); 

	DefaultTableModel modelo = new DefaultTableModel();
			
	modelo.addColumn("ISBN");
	modelo.addColumn("Nombre");
	modelo.addColumn("Autor");
	JTable tabla = new JTable(modelo);
	          
	
	tabla.getSelectedColumn();
	
	JScrollPane scroll = new JScrollPane(tabla);
	
	JButton btnAlta = new JButton();
	JButton btnBaja = new JButton();
	JButton btnActu = new JButton();
	btnAlta.setBackground(Color.green);
	btnBaja.setBackground(Color.red);
	btnActu.setBackground(Color.blue);
	
	 ImageIcon iconAlta = new ImageIcon(getClass().getResource("/VtnArrayList/altaicono.png"));
	 ImageIcon iconBaja = new ImageIcon(getClass().getResource("/VtnArrayList/botonbaja.png"));
	 ImageIcon iconActu = new ImageIcon(getClass().getResource("/VtnArrayList/botonact.png"));
	 
	 btnAlta.setIcon(iconAlta);
	 btnBaja.setIcon(iconBaja);
	 btnActu.setIcon(iconActu);
    
	JPanel panelBotones = new JPanel();
	panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS));
	
	panelBotones.add(btnAlta);
	panelBotones.add(btnBaja);
	panelBotones.add(btnActu);
	this.add(panelBotones, BorderLayout.WEST);
	this.add(scroll,BorderLayout.CENTER);
	
	btnAlta.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			gestor.mostrarAlta();
		}
	});
 btnActu.addActionListener(new ActionListener() {
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		gestor.limpiar(modelo);
		gestor.listar(modelo);
	}
 });
 
 btnBaja.addActionListener(new ActionListener() {
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 gestor.eliminarLibro(tabla.getSelectedRow(), modelo);
		 
	 }
 });
	}}
	
