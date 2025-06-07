package BobElConstructor;

public class Apartamento extends Edificio{

	private int nroApartamento;
	private int piso;
	
	public Apartamento(String calle, int cantidadPisos, int cantHabitaciones,int nroApartamento,int piso) {
		super(calle, cantidadPisos, cantHabitaciones);
		this.nroApartamento = nroApartamento;
		this.piso = piso;
		

	}

	public int getNroApartamento() {
		return nroApartamento;
	}

	public void setNroApartamento(int nroApartamento) {
		this.nroApartamento = nroApartamento;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

}
