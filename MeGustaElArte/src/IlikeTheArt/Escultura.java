package IlikeTheArt;

public class Escultura extends ObraArte{

	private String material;
	private int peso;
	
	public Escultura(String titulo, String autor, String tecnica, String material , int peso) {
		super(titulo, autor, tecnica);
		this.material = material;
		this.peso = peso;
		
		
		
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
