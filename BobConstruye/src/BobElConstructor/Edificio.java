package BobElConstructor;

public class Edificio {

private String calle;
private int cantidadPisos;
private int cantHabitaciones;
public Edificio(String calle, int cantidadPisos, int cantHabitaciones) {
	super();
	this.calle = calle;
	this.cantidadPisos = cantidadPisos;
	this.cantHabitaciones = cantHabitaciones;
}
public String getCalle() {
	return calle;
}
public void setCalle(String calle) {
	this.calle = calle;
}
public int getCantidadPisos() {
	return cantidadPisos;
}
public void setCantidadPisos(int cantidadPisos) {
	this.cantidadPisos = cantidadPisos;
}
public int getCantHabitaciones() {
	return cantHabitaciones;
}
public void setCantHabitaciones(int cantHabitaciones) {
	this.cantHabitaciones = cantHabitaciones;
}











}
