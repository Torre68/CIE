package JCF04HerenciayGenerics;
//No implementa el interfaz Producto.
public class Libro  {
	
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Libro(String titulo) {
		super();
		this.titulo = titulo;
	}
	
	

}
