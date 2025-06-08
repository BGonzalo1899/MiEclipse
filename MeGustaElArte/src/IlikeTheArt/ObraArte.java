package IlikeTheArt;

public class ObraArte {

private String titulo;
private String autor;
private String tecnica;


public ObraArte(String titulo, String autor, String tecnica) {
	this.titulo = titulo;
	this.autor = autor;
	this.tecnica = tecnica;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getTecnica() {
	return tecnica;
}
public void setTecnica(String tecnica) {
	this.tecnica = tecnica;
}




}
