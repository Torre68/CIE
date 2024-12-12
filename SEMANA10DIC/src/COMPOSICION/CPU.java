package COMPOSICION;

public class CPU {
	
	private String marca;
	private String procesador;
	private double precio;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public CPU(String marca, String procesador, double precio) {
		super();
		this.marca = marca;
		this.procesador = procesador;
		this.precio = precio;
	}

}
