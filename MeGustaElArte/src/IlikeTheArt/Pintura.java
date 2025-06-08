package IlikeTheArt;

public class Pintura extends ObraArte{

private String soporte;
private boolean marco;

public Pintura (String titulo, String autor, String tecnica, String soporte, boolean marco) {
	super(titulo, autor, tecnica);
	this.soporte = soporte;
	this.marco = marco;
	
	
	
}

public String getSoporte() {
	return soporte;
}

public void setSoporte(String soporte) {
	this.soporte = soporte;
}

public boolean isMarco() {
	return marco;
}

public void setMarco(boolean marco) {
	this.marco = marco;
}



}
