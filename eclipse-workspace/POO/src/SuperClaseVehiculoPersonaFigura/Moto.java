package SuperClaseVehiculoPersonaFigura;

import java.util.Scanner;


public class Moto extends Vehiculo{
	
	int pesoLimite;
	boolean casco;
		
public Moto(String matricula, String marca,int pesoLimite, boolean casco) {
	super (matricula, marca);
	this.pesoLimite = pesoLimite;
	this.casco = casco;
	}
	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
			System.out.println("Ingresa la matricula: ");
				String matricula = lector.nextLine();
			System.out.println("Ingresa la marca: ");
				String marca = lector.nextLine();
			System.out.println("Ingresa el peso limite: ");
				int pesoLimite =lector.nextInt();
			System.out.println("La moto tiene casco? ");
				boolean casco = lector.nextBoolean();	
				
	Moto func1 = new Moto(matricula, marca, pesoLimite, casco);
	System.out.println(func1);
		}
		@Override
		public String toString() {
			return "Matricula: "+matricula+" Marca: "+marca+" Peso Limite: "+pesoLimite+" Casco: "+casco;
	}
}