package vamoave1;

import java.util.Scanner;

public class Auto extends Vehiculo{
Scanner lector = new Scanner (System.in);
	
	boolean electrico;
	
	public Auto(String marca, String modelo, String matricula, int precio,boolean electrico) {
		super(marca, modelo, matricula, precio);
		this.electrico = electrico;
	
		

	}

	
		
	


}
