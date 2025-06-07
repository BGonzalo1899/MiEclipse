package Paquetillo;

public class Revista extends Publicacion{

	private int numRevista;
	
	
	public Revista(String titulo, String autor, int anoPubli, int numRevista) {
		super(titulo, autor, anoPubli);
		this.numRevista = numRevista;
	}


	public int getNumRevista() {
		return numRevista;
	}


	public void setNumRevista(int numRevista) {
		this.numRevista = numRevista;
	}






}
