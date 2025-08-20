package LaBiblioteca;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MiVentana extends JFrame{
	Libro [] arreglo = new Libro[10];
	public MiVentana() {
	    
	    JPanel panel = new JPanel();
	    panel.setLayout(new GridLayout(6, 2)); 
	    JButton boton = new JButton("Registrar");
	    JButton btnListar = new JButton("Listar");
	    JLabel lblISBN = new JLabel("ISBN:");
	    JTextField txtfIsbn = new JTextField();
	    JLabel lblAutor = new JLabel("Autor:");
	    JTextField txtfAutor = new JTextField();
	    JLabel lblTitulo = new JLabel("Título:");
	    JTextField txtfTitulo = new JTextField();
	    JLabel registro = new JLabel("Registrado exitosamente");
	    
	    this.setTitle("3ra Implementación-La Biblioteca");
	    this.setSize(800, 800);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);

	    this.add(panel);
	    
	    panel.add(lblISBN);
	    panel.add(txtfIsbn);
	    panel.add(lblAutor);
	    panel.add(txtfAutor);
	    panel.add(lblTitulo);
	    panel.add(txtfTitulo);
	    panel.add(boton);
	    panel.add( btnListar);
	   

	   

	    boton.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            
	        	 for (int i = 0; i < arreglo.length; i++) {
	     	        if (arreglo[i] == null) {
	     	            Libro libro = new Libro(null, null, null);
	     	            libro.setISBN(txtfIsbn.getText());
	     	            libro.setAutor(txtfAutor.getText());
	     	            libro.setTitulo(txtfTitulo.getText());

	     	            arreglo[i] = libro; 
	     	           panel.add(registro);
	     	            break;
	     	           
	     	        }
	     	    }
	        	
	        
	        
	        
	        
	        }
	    });
	
	    btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 for (int i = 0; i < arreglo.length; i++) {
                     if (arreglo[i] != null) { // solo los que tengan datos
                         System.out.println(
                             "Libro " + (i+1) +
                             ": ISBN=" + arreglo[i].getISBN() +
                             ", Autor=" + arreglo[i].getAutor() +
                             ", Título=" + arreglo[i].getTitulo()
                         );
                     }
                 }
             }
         });	
	
	
	}
	}


