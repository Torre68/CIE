package JCF04HerenciayGenerics;

public class JCF01InterfaceGenericsHerencia {

	public static void main(String[] args) {

		
		Galleta g1 = new Galleta("Fresa", 0.75);
		Galleta g2 = new Galleta("Vainilla", 0.75);
		Galleta g3 = new Galleta("Naranja", 0.75);
		
		CajaProducto<Galleta> CookieBox = new CajaProducto<Galleta>(3); 
		
		CookieBox.add(g3);
		CookieBox.add(g1);
		CookieBox.add(g2);
		
		for (Galleta i: CookieBox) {
			
			System.out.println(i.getSabor()+" "+i.getPrecio());
			
		}
		
		System.out.println("Precio total de la caja: "+CookieBox.precioTotal());
		
		//Ahora podriamos crear cajas de cualquier cosa.
		
		Libro l = new Libro("Dune");
		Libro l1 = new Libro("El Quijote");
		Libro l2 = new Libro("Frankenstein");
		Caja<Libro> cl = new Caja<Libro> (4);
		cl.add(l);
		cl.add(l1);
		cl.add(l2);
		System.out.println(cl.size());
		for (Libro i: cl) {
			System.out.println(i.getTitulo());
		}

		
		
		
	}

}
