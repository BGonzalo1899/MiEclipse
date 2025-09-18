package paqueteEv;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Logica extends JFrame{
MYSQL bd = new MYSQL();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ventana Ventana1 = new Ventana();
		Ventana1.setVisible(true);
		
		
		
	
	}

	public void listarProductos(DefaultTableModel modelo) {
		bd.listar(modelo);
	
}
	}