package COMPOSICION;

import java.util.ArrayList;

public class TuristaVIP {
	
	private String nombre;
	
	private ArrayList<MALETA> maletas = new ArrayList <MALETA> ();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<MALETA> getMaletas() {
		return maletas;
	}

	public void setMaletas(ArrayList<MALETA> maletas) {
		this.maletas = maletas;
	}

	public TuristaVIP(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void addMALETA (MALETA maletita ) {
		
		maletas.add(maletita);
	}
	
	

}
