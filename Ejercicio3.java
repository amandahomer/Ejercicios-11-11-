/**Este programa es un conversor de pesetas a euros.
@AmandaNR */
import java.util.Scanner;

public class Ejercicio3 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la cantidad en pesetas: ");
		double cantidad = s.nextDouble();
		double euros = 166.38;
	
		//String pesetas;
		//System.out.print("Introduce la cantidad en pesetas: ");
		//pesetas = System.console().readLine();
		//double cantidad;
		//cantidad = Double.parseDouble( pesetas );
	
		//double euros;
		//euros = 166.38;
		
		double total;
		total = cantidad / euros;
		
		//System.out.printf(pesetas" pesetas son %d.3f", total +" euros");
		System.out.print(cantidad +" pesetas son "+ total +" euros");
		
	}
}
