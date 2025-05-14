package EjemplificandoBroo;
import java.util.Scanner;
public class Funcionario extends Persona{
Scanner l = new Scanner(System.in);
	private String salario;

	public Funcionario(String nombre, String apellido, int ci) {
		super(nombre,apellido );
		this.salario=salario;
		
		
		System.out.println("ingresa tu nombre");
		String nombre1 = l.nextLine();
		System.out.println("Ingres tu apellido");
		String apellido1 = l.nextLine();
		System.out.println("Ingresa tu ci");
		int ci1 = l.nextInt();
		System.out.println("ingresa tu salario ");
		int salario = l.nextInt();
		
		
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
	
}

