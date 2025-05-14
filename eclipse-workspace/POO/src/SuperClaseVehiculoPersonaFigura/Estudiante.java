package SuperClaseVehiculoPersonaFigura;

public class Estudiante extends Persona{
	String nivelAño;
	int notas;
	
	public Estudiante(String nombre, String CI, String nivelAño, int notas)	{
		super(nombre, CI);
		this.nivelAño = nivelAño;
		this.notas = notas;
	}

	public static void main(String[] args) {

	}

}
