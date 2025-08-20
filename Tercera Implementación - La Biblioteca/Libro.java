package LaBiblioteca;

public class Libro {


	
public Libro(String iSBN, String autor, String titulo) {
		
		this.ISBN = iSBN;
		this.Autor = autor;
		this.Titulo = titulo;
	}
private String ISBN;
private String Autor;
private String Titulo;
public String getISBN() {
	return ISBN;
}
public void setISBN(String iSBN) {
	ISBN = iSBN;
}
public String getAutor() {
	return Autor;
}
public void setAutor(String autor) {
	Autor = autor;
}
public String getTitulo() {
	return Titulo;
}
public void setTitulo(String titulo) {
	Titulo = titulo;
}




}
