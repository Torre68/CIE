package semana16dic;

public class FacturaTesting {

	public static void main(String[] args) {
		
		FacturaRepository repo = new FacturaRepository();
		//Esto insertaria
		Factura f= new Factura (8,"Catering",275.55);
		repo.insertar(f);
		
		//Esto borraria
		Factura f1= new Factura ("Dietas Viernes");
		repo.borrar(f1);
		

		System.out.println("Tarea Realizada");
	}
	}


