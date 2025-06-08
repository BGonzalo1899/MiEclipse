package IlikeTheArt;

public class Fotografia extends ObraArte{

	private int lente;
	private String formato;
	
	
	
	public Fotografia(String titulo, String autor, String tecnica, int lente, String formato) {
		super(titulo, autor, tecnica);
		this.lente = lente;
		this.formato = formato;
	}



	public int getLente() {
		return lente;
	}



	public void setLente(int lente) {
		this.lente = lente;
	}



	public String getFormato() {
		return formato;
	}



	public void setFormato(String formato) {
		this.formato = formato;
	}






}
