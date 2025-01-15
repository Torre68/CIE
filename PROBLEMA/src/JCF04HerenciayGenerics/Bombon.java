package JCF04HerenciayGenerics;

public class Bombon implements Producto{
	
	private String tipo;
	private double precio;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Bombon(String tipo, double precio) {
		super();
		this.tipo = tipo;
		this.precio = precio;
	}
	
	

}
