package vamoave1;
import java.util.Scanner;
public class autos extends Vehiculo{
Scanner lector = new Scanner (System.in);
	
	boolean electrico;
	
	public autos(String marca, String modelo, String matricula, int precio, boolean electrico) {
		super(marca, modelo, matricula, precio);
		this.electrico = electrico;
		
		

	}

	public boolean isElectrico() {
		return electrico;
	}

	public void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}
	








}
