package Paquetillo;

public class Libro extends Publicacion{

	private String editorial;
	private int cantPag;
	
public Libro(String titulo, String autor, int anoPubli, String editorial,int cantPag) {
		super(titulo, autor, anoPubli);
	this.editorial = editorial;
	this.cantPag = cantPag;
	
}

public String getEditorial() {
	return editorial;
}

public void setEditorial(String editorial) {
	this.editorial = editorial;
}

public int getCantPag() {
	return cantPag;
}

public void setCantPag(int cantPag) {
	this.cantPag = cantPag;
}





}
