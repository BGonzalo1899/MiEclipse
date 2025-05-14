package SuperClaseVehiculoPersonaFigura;

import java.util.Scanner;

public class Director extends Persona{
	String sueldo;
	int cantAlumnosExpulsados;
	
	public Director(String nombre, String CI, String sueldo, int cantAlumnosExpulsados )	{
		super(nombre, CI);
		this.sueldo = sueldo;;
		this.cantAlumnosExpulsados = cantAlumnosExpulsados;
	}
	public static void main(String[] args) {
		 Scanner lec = new Scanner(System.in);

	        System.out.println("Ingresa el nombre del director:");
	        String nombre = lec.nextLine();

	        System.out.println("Ingresa la cedula del director:");
	        String CI = lec.nextLine();
	        
	       System.out.println("Ingresa el sueldo del director: ");
	        String sueldo = lec.nextLine();
	        
	        System.out.println("Cuántos alumnos ha expulsado? ");
	        int cantAlumnosExpulsados = lec.nextInt();
	        
	        
	        Director dir = new Director(nombre, CI, sueldo, cantAlumnosExpulsados );
	        System.out.println(dir);
	
	}
	@Override
	public String toString() {
	return "Nombre: "+ nombre +" CI: "+ CI +" Cuántos alumnos ha expulsado? "+cantAlumnosExpulsados + "Cual es su sueldo "+sueldo;
 
	
	}}
