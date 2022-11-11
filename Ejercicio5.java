/**Este programa calcula el area de un rectangulo.
AmandaNR*/
import java.util.Scanner;

public class Ejercicio5 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el ancho y la altura del rectangulo seguidos de un espacio: ");
		double ancho = s.nextDouble();
		double altura = s.nextDouble();
	
		//String dato;
		//System.out.print("Introduce el ancho del rectangulo: ");
		//dato = System.console().readLine();
		//double ancho;
		//ancho = Double.parseDouble( dato);
		
		//System.out.print("Introduce la altura de un rectangulo; ");
		//dato = System.console().readLine();
		//double largo;
		//largo = Double.parseDouble( dato);
		
		double total;
		total = ancho * altura;
		
		System.out.print("El area del rectangulo es: "+ total +" cm");
		
	}
}
