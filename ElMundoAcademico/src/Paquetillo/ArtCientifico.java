package Paquetillo;

public class ArtCientifico extends Publicacion{
	private String revista;
	public ArtCientifico(String titulo, String autor, int anoPubli) {
		super(titulo, autor, anoPubli);
	this.revista = revista;
	 
	}
	public String getRevista() {
		return revista;
	}
	public void setRevista(String revista) {
		this.revista = revista;
	}



}
