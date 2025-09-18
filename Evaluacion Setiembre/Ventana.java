package paqueteEv;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.*;

public class Ventana extends JFrame{
	
Logica gestor = new Logica();	

public Ventana () {
	
	
	
	JPanel panel1 = new JPanel();
	JButton btn = new JButton("Listar");
	
	
	String[] columnas = {"ID","Producto","Precio"};
	
	DefaultTableModel modelo = new DefaultTableModel(null,columnas);
	JTable tabla = new JTable(modelo); 
	JScrollPane jscroll = new JScrollPane(tabla);
	
	
	this.setTitle("Ventana Evaluación");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(800,600);
	this.setLocationRelativeTo(null);

	
	
	this.add(panel1);
	panel1.add(btn);
	panel1.add(jscroll);
	
	
btn.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	gestor.listarProductos(modelo);
		
	}
});
	
	

}


}
