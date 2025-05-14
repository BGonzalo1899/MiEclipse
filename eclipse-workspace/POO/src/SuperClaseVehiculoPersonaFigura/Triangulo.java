package SuperClaseVehiculoPersonaFigura;

import java.util.Scanner;

public class Triangulo extends FiguraGeometrica{
	String cantAngulos;
	boolean esEquilatreo;
	
	public Triangulo(String nombre, int area, String cantAngulos, boolean esEquilatreo)	{
		super(nombre, area);
		this.cantAngulos = cantAngulos;
		this.esEquilatreo = esEquilatreo;
	}
	public static void main(String[] args) {
		 Scanner lec = new Scanner(System.in);

	        System.out.println("Ingresa el nombre:");
	        String nombre = lec.nextLine();

	        System.out.println("Ingresa el área:");
	        int area = lec.nextInt();
	        
	        System.out.println("Ingresa la cantidad de angulos");
	        String cantAngulos = lec.next();
	        
	        System.out.println("Es equilatero?");
	        boolean esEquilatero = lec.nextBoolean();

	        Triangulo triangulito = new Triangulo(nombre, area, cantAngulos, esEquilatero);
    System.out.println(triangulito);
		
	}
	
	@Override
	public String toString() {
	return "Nombre: "+ nombre +" area: "+ area +" cantidad angulos "+cantAngulos + "equilatero: "+esEquilatreo;
		}
	
}
