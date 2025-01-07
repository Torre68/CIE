package Semana012025A;

import java.util.ArrayList;

public class p01 {

	public static void main(String[] args) {
		
		
		ArrayList<Encendible> lista = new ArrayList<Encendible> ();
		Telefono t = new Telefono (942);
		Telefono t1 = new Telefono (985);
		Habitacion h = new Habitacion ();
		Tablet tb = new Tablet ();
		lista.add(t);
		lista.add(tb);
		lista.add(t1);
		lista.add(h);
		
		//O podriamos, con las clases que tienen constructor.
		lista.add(new Telefono(986));
		
		
		
		for (Encendible i : lista) {
			i.on();
		}
		for (Encendible i : lista) {
			i.off();
		}

	}

}
