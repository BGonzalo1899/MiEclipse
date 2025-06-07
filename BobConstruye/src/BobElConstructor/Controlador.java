package BobElConstructor;
import java.util.Scanner;
public class Controlador {

	public static void main(String[] args) {
	int opcion; 	
		
	Casa casa = new Casa (null,0,0,false,0);
	Apartamento apart = new Apartamento(null, 0, 0, 0, 0);
	
	
	
	do {
			
			Scanner lector = new Scanner(System.in);
			
		System.out.println("Bienvenido");
		System.out.println("Ingresa opcion deseada:");
		System.out.println("1- Ingresar Casa");			
		System.out.println("2- Ingresar Apartamento");
		System.out.println("3- Salir");

			opcion = lector.nextInt();
			
			
			switch (opcion) {
			case 1:
			lector.nextLine();
		System.out.println("En que calle se ubica ?");
			casa.setCalle(lector.nextLine());
		System.out.println("Cuantos pisos tiene ?");
			casa.setCantidadPisos(lector.nextInt());
		System.out.println("Cuantas habitaciones tiene ?");
		 	casa.setCantHabitaciones(lector.nextInt());
		 System.out.println("Tiene Jardín ?");
		 	casa.setJardin(lector.nextBoolean());
		 System.out.println("canto mide el terreno (m2) ");
		 	casa.setTerreno(lector.nextInt());
		 
		 System.out.println("Calle: "+casa.getCalle()+" tiene "+casa.getCantHabitaciones()+" habitaciones "+ "tiene jardín ? "+casa.getJardin()+" el terreno mide "+casa.getTerreno()+"m2" );
				
			case 2:
				lector.nextLine();
				System.out.println("En que calle se ubica ?");
				apart.setCalle(lector.nextLine());
			System.out.println("Cuantos pisos tiene ?");
				apart.setCantidadPisos(lector.nextInt());
			System.out.println("Cuantas habitaciones tiene ?");
				apart.setCantHabitaciones(lector.nextInt());
			System.out.println("Cual es el número de apartamento?");
				apart.setNroApartamento(lector.nextInt());
			System.out.println("en que piso se encuentra ?");
				apart.setPiso(lector.nextInt());
				 System.out.println("Calle: "+apart.getCalle()+" tiene "+apart.getCantHabitaciones()+" habitaciones "+ "el nro de apartamento es:  "+apart.getNroApartamento()+" está en el piso: "+apart.getPiso() );
			break;
				
			

			default:
				System.out.println("Opcion no disponible");
				break;
			}
			
		} while (opcion!=3);
			
	
	}

}
