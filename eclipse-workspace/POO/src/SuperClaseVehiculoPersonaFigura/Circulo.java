package SuperClaseVehiculoPersonaFigura;

import java.util.Scanner;

public class Circulo extends FiguraGeometrica{
	int circunsferencia, radio;
	
	public Circulo(String nombre, int area, int circunsferencia, int radio)	{
		super(nombre, area);
		this.circunsferencia = circunsferencia;
		this.radio = radio;
	}
	public static void main(String[] args) {
		 Scanner lec = new Scanner(System.in);

	        System.out.println("Ingresa el nombre:");
	        String nombre = lec.nextLine();

	        System.out.println("Ingresa el área:");
	        int area = lec.nextInt();
	        
	        System.out.println("Ingresa la circunferencia");
	        int circunsferencia = lec.nextInt();
	        
	        System.out.println("ingresa el radio");
	        int radio = lec.nextInt();

	        Circulo circulito = new Circulo(nombre, area, circunsferencia, radio);
     System.out.println(circulito);
		
	}
	
	@Override
	public String toString() {
	return "Nombre: "+ nombre +" area: "+ area +" circunsferencia "+circunsferencia + "radio "+radio;
		}
	
}


