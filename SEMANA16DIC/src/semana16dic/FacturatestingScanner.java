package semana16dic;

import java.util.Scanner;

public class FacturatestingScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		FacturaRepository repo = new FacturaRepository();
		System.out.println("¿Qué deseas hacer, insertar o borrar?");
		String accion = sc.next();
		
		if (accion.equalsIgnoreCase("insertar")) {
			
			System.out.println("Por favor introduzca número de factura: " );
			int numero = sc.nextInt();
			System.out.println("Por favor introduzca el concepto de la factura : ");
			String concepto = sc.next();
			System.out.println("Por favor introduzca el importe de la factura: ");
			double importe = sc.nextDouble();
			Factura f= new Factura (numero,concepto,importe);
			repo.insertar(f);
			System.out.println("Tarea Realizada");
			
		}  
		
		else if (accion.equalsIgnoreCase("borrar")) {
			
			System.out.println("Por favor introduzca el concepto para borrar la factura correspondiente:");
			String concepto = sc.next();
			Factura f1= new Factura (concepto);
			repo.borrar(f1);
			System.out.println("Tarea Realizada");
		}else {
			
			System.out.println("Opción o gramática incorrecta");
		
		}
		
		
		
		
	
		
		
		


	}

}
