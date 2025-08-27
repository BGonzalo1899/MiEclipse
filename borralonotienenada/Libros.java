package VtnArrayList;

public class Libros {

	String isbn, nombre, autor;

	public Libros(String isbn, String nombre, String autor) {
		super();
		this.isbn = isbn;
		this.nombre = nombre;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
