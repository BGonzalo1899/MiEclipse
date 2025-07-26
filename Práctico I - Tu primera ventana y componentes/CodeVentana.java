package VentanaC;

import java.awt.Color;

import javax.swing.*;

public class CodeVentana extends JFrame{


	public CodeVentana() {
		
		JPanel panel = new JPanel ();
		panel.setBackground(Color.green);
		panel.setLayout(null);
		JButton boton = new JButton("Aceptar");
		boton.setBounds(120, 95 , 100, 20);
		JLabel text = new JLabel("Bienvenido a mi programa");
		text.setBounds(10, 10, 150, 50);
		JLabel text2 = new JLabel("Ingresa tu nombre:");
		text2.setBounds(10,40, 150, 50);
		JTextField ingresa = new JTextField ();
		ingresa.setBounds(120, 55 , 100, 20);
		this.setTitle("Ventana de prueba"); 
		this.setSize(600, 400); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null); 
		
		this.add(panel);
		panel.add(text);
		panel.add(text2);
		panel.add(ingresa);
		panel.add(boton);
		
		 
		
		
		
		
	}















}
