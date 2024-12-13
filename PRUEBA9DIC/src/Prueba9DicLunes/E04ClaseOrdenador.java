package Prueba9DicLunes;

public class E04ClaseOrdenador {
  //CORRECCION DE CECILIO
	private boolean encendido;
	
	public boolean estaEncendido() {
		
		return encendido;
	}
public void encender () {
	if (!encendido) //que seria la abreviacion de (encendido!=true;)
		encendido=true;
}
	public void apagar () {
		if (encendido)
			encendido=false;
	}
	public E04ClaseOrdenador(boolean encendido) {
		
		this.encendido = encendido;
	}

}
	