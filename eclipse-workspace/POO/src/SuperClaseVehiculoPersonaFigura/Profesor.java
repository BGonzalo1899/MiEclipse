package SuperClaseVehiculoPersonaFigura;
import java.util.Scanner;
public class Profesor extends Persona{
	
	String cantAlumnos;
	boolean profesorado;
	 
		
	
	public Profesor(String nombre, String CI, String cantAlumnos, boolean profesorado)	{
		super(nombre, CI);
		this.cantAlumnos = cantAlumnos;
		this.profesorado = profesorado;
	}
	public static void main(String[] args) {
		 Scanner lec = new Scanner(System.in);

	        System.out.println("Ingresa el nombre del profesor:");
	        String nombre = lec.nextLine();

	        System.out.println("Ingresa la cedula del profesor:");
	        String CI = lec.nextLine();
	        
	        System.out.println("Ingresa la cantidad de alumnos");
	        String cantAlumnos = lec.nextLine();
	        
	        System.out.println("Tiene profesorado?");
	        boolean profesorado = lec.nextBoolean();

	        Profesor prof1 = new Profesor(nombre, CI, cantAlumnos, profesorado);
        System.out.println(prof1);
		
	}
	
	@Override
	public String toString() {
	return "Nombre: "+ nombre +" CI: "+ CI +" Cuántos alumnos? "+cantAlumnos + "tiene profesorado? "+profesorado;
		}
	
	
	
}
