package Prueba9DicLunes;

public class E04OrdenadorPrincipal {

	public static void main(String[] args) {

		E04ClaseOrdenador pc = new E04ClaseOrdenador (false);
 System.out.println(pc.estaEncendido());
 pc.encender();
 System.out.println(pc.estaEncendido());
 pc.apagar();

	}

}
