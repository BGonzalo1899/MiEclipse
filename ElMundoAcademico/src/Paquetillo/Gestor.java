package Paquetillo;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
import java.util.Set;
public class Gestor {

	public static void main(String[] args) {
		int opcion;
	 Libro libro = new Libro (null, null, 0, null,0);
	 Revista revista = new Revista(null, null, 0,0);
	 ArtCientifico articulo = new ArtCientifico(null, null, 0);
	System.out.println("Bienvenido al sistema");
	

	do {
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Bienvenido");
		System.out.println("Ingresa opcion deseada:");
		System.out.println("1- Ingresar Libro");
		System.out.println("2- Ingresar revista");
		System.out.println("3- Ingresar Articulo cientifico");
		System.out.println("4- Salir");
		opcion = lector.nextInt();
		
		
		switch (opcion) {
		case 1:
			lector.nextLine();
			System.out.println("Ingrese el título del libro ");
				libro.setTitulo(lector.nextLine());
			System.out.println("Ingresa el autor");
				libro.setAutor(lector.nextLine());
			System.out.println("en que año se publico?");
				libro.setAnoPubli(lector.nextInt());
			System.out.println("Ingresa editorial");
			lector.nextLine();
				libro.setEditorial(lector.nextLine());
			System.out.println("Ingresa cantidad de páginas");
				libro.setCantPag(lector.nextInt());
				
				System.out.println("El título es: "+libro.getTitulo() +" El autor es: "+libro.getAutor()+" se publicó en: "+ libro.getAnoPubli()+ " la editorial es: " + libro.getEditorial()+ " tiene "+ libro.getCantPag()+ " paginas");
			
			
			break;
			
		case 2:
			lector.nextLine();
		System.out.println("Ingresa el titulo");
		revista.setTitulo(lector.nextLine());
		System.out.println("Quién publicó la revista ? ");
		revista.setAutor(lector.nextLine());
		System.out.println("En que año se publicó la revista? ");
		revista.setAnoPubli(lector.nextInt());
		System.out.println("Cuál es el número de la revista ");
		revista.setNumRevista(lector.nextInt());
		System.out.println("Cuantas páginas tiene? ");
		
		System.out.println("El título es: "+revista.getTitulo() +" El autor es: "+ revista.getAutor()+" se publicó en: "+ revista.getAnoPubli()+" tiene "+ libro.getCantPag()+ " paginas");
			break;
			
		case 3:
			lector.nextLine();
		System.out.println("Ingresa el nombre del artículo");	
		articulo.setTitulo(lector.nextLine());
		System.out.println("Quien escribió el artículo ");
		articulo.setAutor(lector.nextLine());
		System.out.println("En que año se publicó ");
		articulo.setAnoPubli(lector.nextInt());
		lector.nextLine();
		System.out.println(" a que revista pertenece?");
		articulo.setRevista(lector.nextLine());
		
		System.out.println("El título es: "+articulo.getTitulo() +" El autor es: "+ articulo.getAutor()+" se publicó en: "+ revista.getAnoPubli()+"Pertenece a la revista: "+revista.getNumRevista());
			break;
			
		case 4:
			System.out.println("Se terminó");
			break;

		default:
			System.out.println("Opcion no disponible");
			break;
		}
		
	} while (opcion!=4);
		
		
		
		
		
		
		
		
	}

}
