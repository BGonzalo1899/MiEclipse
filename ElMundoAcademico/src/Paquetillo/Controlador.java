package Paquete;
import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {
		
		int opcion;
		Estudiante[] arreglo = new Estudiante[10];
		int cantidadRegistros = 0;
		
		
		do {
			
			Scanner lector = new Scanner(System.in);
			
			System.out.println("Bienvenido");
			System.out.println("Ingresa opcion deseada:");
			System.out.println("1- Ingresar Estudiante");
			System.out.println("2- Mostrar Lista de Estudiantes");
			System.out.println("3- Borrar Estudiante");
			System.out.println("4- Salir");
			opcion = lector.nextInt();
			
			
			switch (opcion) {
			case 1:
				altaEstudiante(arreglo, cantidadRegistros, lector);
				cantidadRegistros++;
				break;
				
			case 2:
				listarEstudiantes(arreglo);
				break;
				
			case 3:
				System.out.println("Ingresa la CI del estudiante a dar de baja: ");
				int ci = lector.nextInt(); // Esta línea almacena en CI el dato ingresado por el usuario
				bajaEstudiante(arreglo, ci); // Esta linea llama a la funcion bajaEstudiante y le pasa por 
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
	
	public static void bajaEstudiante(Estudiante[] arreglo, int ci) {
		
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i] != null && arreglo[i].getCI() == ci) {
				arreglo[i] = null;
			}
		}
	}
	
	
	public static void altaEstudiante(Estudiante[] arreglo, int cantidadRegistros, Scanner lector) {
		System.out.println("Ingresa CI: ");
		int ci = lector.nextInt();
		System.out.println("Ingresa Nombre: ");
		String nombre = lector.next();
		System.out.println("Ingresa Apellido: ");
		String apellido = lector.next();
		
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i] == null) {
				arreglo[i] = new Estudiante(ci, nombre, apellido);
				break;
			}
		}
		
		
	}
	
	public static void listarEstudiantes(Estudiante[] arreglo) {
		
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i] != null) {
				System.out.print("Estudiante N°"+ i +" CI: " + arreglo[i].getCI());
				System.out.print(" NOMBRE: " + arreglo[i].getNombre());
				System.out.println(" APELLIDO: " + arreglo[i].getApellido());
			}else {
				System.out.println("Pos N°" + i + "es null");
			}
			
		}
		
		
	}

}
