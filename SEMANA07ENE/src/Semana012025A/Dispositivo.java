package Semana012025A;

public abstract class Dispositivo implements Encendible {

	// En vez de hacer que las subclases implementen la interfaz, con que lo haga la
	// superclase, las subclases lo heredan.

	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public abstract void on();

	public abstract void off();

}
