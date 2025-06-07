package BobElConstructor;

public class Casa extends Edificio{

	private boolean jardin;
	private int terreno;
	
	public Casa(String calle, int cantidadPisos, int cantHabitaciones,boolean jardin,int terrno) {
		super(calle, cantidadPisos, cantHabitaciones);
		this.jardin = jardin;
		this.terreno = terreno;
		
	}

	public boolean getJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}

	public int getTerreno() {
		return terreno;
	}

	public void setTerreno(int terreno) {
		this.terreno = terreno;
	}




}
