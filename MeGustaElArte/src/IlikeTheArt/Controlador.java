package IlikeTheArt;
import java.util.Scanner;
public class Controlador {

	public static void main(String[] args) {
		
	Pintura pintura = new Pintura (null, null, null, null, false); 
	Escultura escultura = new Escultura (null, null, null, null, 0);
	Fotografia foto = new Fotografia (null, null, null, 0, null);
		int opcion;
	
	do {
		Scanner lector = new Scanner(System.in);
		System.out.println("Bienvenido, ingrese la opción deseada");
		System.out.println("1- Agregar Pintura");
		System.out.println("2- Agregar escultura");
		System.out.println("3- Agregar fotografia");
		System.out.println("4- Salir");
		opcion = lector.nextInt();
		
		
		switch (opcion) {
		case 1: {
			lector.nextLine();
		System.out.println("Ingresa el titulo: ");
			pintura.setTitulo(lector.nextLine());
		System.out.println("ingresa el autor: ");
			pintura.setAutor(lector.nextLine());
		System.out.println("que tecnica se utilizó en la obra: ");
		 	pintura.setTecnica(lector.nextLine());
		System.out.println("que soporte utilizó ");
		 	pintura.setSoporte(lector.nextLine());
		System.out.println("está enmarcada? ");
		 	pintura.setMarco(lector.nextBoolean());
		 	
		System.out.println("Título: " + pintura.getTitulo() + ", Autor: " + pintura.getAutor() + ", Técnica: " + pintura.getTecnica() + ", Soporte: " + pintura.getSoporte() + ", Enmarcada: " + pintura.isMarco());
		 
		 		
		
		 	
		 	
			break;
		}
		case 2 : 
			lector.nextLine();
			System.out.println("Ingresa el titulo: ");
			escultura.setTitulo(lector.nextLine());
		System.out.println("ingresa el autor: ");
			escultura.setAutor(lector.nextLine());
		System.out.println("que tecnica se utilizó en la obra: ");
			escultura.setTecnica(lector.nextLine());
		System.out.println("que material se usó? ");
			escultura.setMaterial(lector.nextLine());
		System.out.println("Ingresa el peso de la escultura");
			escultura.setPeso(lector.nextInt());
			
		System.out.println("Título: " + escultura.getTitulo() + ", Autor: " + escultura.getAutor() + ", Técnica: " + escultura.getTecnica() + ", Material: " + escultura.getMaterial() + ", Peso: " + escultura.getPeso() + " kg");
			
			break;
			
		case 3:
			lector.nextLine();
			System.out.println("Ingresa el titulo: ");
			foto.setTitulo(lector.nextLine());
		System.out.println("ingresa el autor: ");
			foto.setAutor(lector.nextLine());
		System.out.println("milímetros del lente utilizado: ");
		    foto.setLente(lector.nextInt());
		    lector.nextLine();
		System.out.println("formato de la foto? ");
		 	foto.setFormato(lector.nextLine());
		 	
		System.out.println("Título: " + foto.getTitulo() + ", Autor: " + foto.getAutor() + ", Lente (mm): " + foto.getLente() + ", Formato: " + foto.getFormato());
		
		
		
		
		
		default:if(opcion >4)
		System.out.println("Opción no disponible");
		}
		
	} while (opcion != 4);
	
	System.out.println("se terminó");
	
	}

}
