/**Este programa es un conversor de euros a pesetas
@AmandaNR */
import java.util.Scanner;

public class Ejercicio2 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la cantidad en euros: ");
		double cantidad = s.nextDouble();
		double pesetas = 166.38;
	
		//String euros;
		//System.out.print("Introduce la cantidad en euros: ");
		//euros = System.console().readLine();
		//double cantidad;
		//cantidad = Double.parseDouble( euros );
	
		//double pesetas;
		//pesetas = 166.38;
		
		double total;
		total = cantidad * pesetas;
		
		System.out.print(cantidad +" euros son "+ total +" pesetas");
	
	}
}
