package SuperClaseVehiculoPersonaFigura;

import java.util.Scanner;

public class Auto extends Vehiculo{
	
	int ventanas,espejos;
		
public Auto(String matricula, String marca,int ventanas, int espejos) {
	super (matricula, marca);
	this.ventanas = ventanas;
	this.espejos =espejos;
}
	public static void main(String[] args) {
		 Scanner lec = new Scanner(System.in);
		 	System.out.println("Ingresa la matricula del coche");
		 	String matricula = lec.nextLine();
		 	
	        System.out.println("Ingresa la marca del coche:");
	        String marca = lec.nextLine();
	        
	        System.out.println("cuantas ventanas tiene el coche");
	        int ventanas = lec.nextInt();

	       System.out.println("cuantos espejos tiene el coche");
	       int espejos = lec.nextInt();
	       
	       
	        Auto autos = new Auto( matricula,marca,ventanas, espejos);
     System.out.println(autos);
		 
	}
	
	@Override
	public String toString() {
	return "marca: "+ marca +" matricula: "+ matricula +" ventanas? "+ventanas + "espejos? "+espejos;
		}
	
}
	