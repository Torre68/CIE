package semana16dic;

public class Persona {
	//CAPA DE NEGOCIO. En el simil del frigorifico y la lasaña, esta capa es la lasaña.
	private String nombre;
	private String apellidos;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	//Dos constructores para las dos funciones, Insertar y Borrar. Borramos solo a traves de una variable, 
	//pero al Insertar debemos insertar todas las variables requeridas.

}
