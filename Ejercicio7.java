/**Este programa calcula el total de una factura 
 * a partir del IVA.
AmandaNR*/
import java.util.Scanner;

public class Ejercicio7 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la cantidad de la factura: ");
		double cantidad = s.nextDouble();
	
		
		//String factura;
		//System.out.print("Introduce la cantidad de la factura: ");
		//factura = System.console().readLine();
		//double cantidad;
		//cantidad = Double.parseDouble(factura);
		
		double iva, ivaFactura, total;
		iva = 0.21;
		ivaFactura = iva * cantidad;
		total = cantidad + ivaFactura;
		
		System.out.print("El importe de la factura con IVA incluido es: "+ total +" euros");
	
	}
}
