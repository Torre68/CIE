package JCF04HerenciayGenerics;

public class CajaProducto<T extends Producto> extends Caja<T> {
	// T es un parámetro de tipo genérico. Esto significa que CajaProducto puede
	// trabajar con diferentes tipos de datos, pero esos tipos deben cumplir ciertas
	// restricciones.

	// T extends Producto significa que T debe ser un tipo que extienda la clase
	// Producto o que sea Producto mismo. Esto permite que CajaProducto use
	// cualquier clase que sea un tipo de Producto, garantizando que se pueda
	// acceder a todas las propiedades y métodos definidos en la clase Producto.

	// Caja<T> es la clase base que CajaProducto está extendiendo. Esto significa
	// que CajaProducto hereda de la clase Caja, que también es genérica, y puede
	// utilizar el tipo T.

	public CajaProducto(int tope) {
		super(tope);//Para que funcione hemos tenido que implementar los constructores.
		//Es decir el problema era cuestion de los constructores.
		this.tope = tope;
	}

	public double precioTotal() {

		double total = 0;
		for (T i : lista) {
			total = total + i.getPrecio();

		}
		return total;
	}

}
