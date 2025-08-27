package VtnArrayList;

import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Logica {
	static ArrayList<Libros> arreglo = new ArrayList<>();
	public static void main(String[] args) {
		
		Main pres1 = new Main();
		pres1.setVisible(true);

	}

	public void mostrarAlta() {
		vtnAlta vtnA = new vtnAlta();
		vtnA.setVisible(true);
		
		
	}
	
	public void listar(DefaultTableModel modelo) {
		for(int i = 0; i < arreglo.size(); i++) {
			Object[] datos = { arreglo.get(i).getIsbn(), arreglo.get(i).getNombre()};
			modelo.addRow(datos);
		}
			
		}
	
	public void limpiar(DefaultTableModel modelo) {
		while(modelo.getRowCount()> 0) {
			modelo.removeRow(0);
			
		}}
	
		public void eliminarLibro(int seleccionada, DefaultTableModel modelo) {
			arreglo.remove(seleccionada);
			limpiar(modelo);
			listar(modelo);
		
		}

	public boolean guardarLibro(String isbn, String nombre, String autor) {
		boolean resultado = false;

		if(arreglo.add(new Libros(isbn, nombre, autor)));
        resultado = true;
	
		return resultado;
	}
}
