package VentanaLayout;
import java.awt.Color;

import javax.swing.*;
public class MiVentana extends JFrame{

	public MiVentana() {
	
		JPanel panel = new JPanel ();
	//	panel.setBackground(Color.green);
			panel.setLayout(null);
		JButton boton = new JButton("Registrar");
			boton.setBounds(120, 200 , 100, 20);
		JLabel text = new JLabel("Nombre:");
			text.setBounds(10, 10, 150, 50);
		JTextField ingresa = new JTextField ();
			ingresa.setBounds(120, 30 , 100, 20);
		JLabel text2 = new JLabel("Apellido:");
			text2.setBounds(10,40, 150, 50);
		JLabel text3 = new JLabel("Cédula:");
			text3.setBounds(10,70, 150, 50);
		JTextField ingresa1 = new JTextField ();
			ingresa1.setBounds(120, 55 , 100, 20);
		JTextField ingresa2 = new JTextField ();
			ingresa2.setBounds(120, 85 , 100, 20);
		JLabel text4 = new JLabel("Edad:");
			text4.setBounds(10,100, 150, 50);
		JTextField ingresa3 = new JTextField ();
			ingresa3.setBounds(120, 115 , 100, 20);
		JLabel text5 = new JLabel("Rol:");
			text5.setBounds(10,125, 150, 50);
			
			String [] lista = {"Usuario Estándar", "Usuario Premium"};
			
		JComboBox desplegable = new JComboBox (lista);
		desplegable.setBounds(120, 145 , 120, 20);
		
		
		this.setTitle("Ventana Layout"); 
		this.setSize(300, 300); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null); 
		
		this.add(panel);
		panel.add(text);
		panel.add(text2);
		panel.add(text3);
		panel.add(text4);
		panel.add(text5);
		panel.add(ingresa);
		panel.add(ingresa1);
		panel.add(ingresa2);
		panel.add(ingresa3);
		panel.add(desplegable);
		panel.add(boton);
		
		 
		



	}
}