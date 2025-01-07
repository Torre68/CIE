package Semana012025A;

public class Telefono extends Dispositivo{
	
	private int numero;

	public Telefono(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void on () {
		System.out.println("encender telefono");
	}
	public void off () {
		System.out.println("apagar telefono");
	}
	
	

}
