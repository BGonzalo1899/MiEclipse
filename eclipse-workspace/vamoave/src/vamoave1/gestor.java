package vamoave1;
import java.util.Scanner;

import vamoave1.autos;
public class gestor {

	public static void main(String[] args) {
	
        Scanner lector = new Scanner(System.in);
        Auto auto1 = new Auto("marca", "modelo", "matricula", 12, false);

System.out.println("Ingresa la marca: ");
        String marca = lector.nextLine();
System.out.println("Ingresa el modelo: ");
        String modelo = lector.nextLine();
System.out.println("Ingresa la matricula: ");
        String matricula = lector.nextLine();
System.out.println("Ingresa el precio: ");
        int precio = lector.nextInt();
System.out.println("El vehiculo es electrico: ");
        boolean electrico = lector.nextBoolean();


	
	
	System.out.println("marca: "+marca + "modelo: "+modelo+"matricula: "+matricula+"precio: "+precio + "electrico?: "+electrico);
	
	
	}


	
	}