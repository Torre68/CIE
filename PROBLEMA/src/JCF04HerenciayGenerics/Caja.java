package JCF04HerenciayGenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Caja<T> implements Iterable<T> {
	//Si hacemos que la Clase implemente a la utilidad de JAVA Iterable vamos a conseguir una mayor 
	//naturalidad en la gestion de las Cajas.
	protected List<T> lista = new ArrayList<T>();
	protected int tope;

	public Caja(int tope) {
		super();
		this.tope = tope;
	}

	public void add(T elemento) {

		if (lista.size() < tope) {

			lista.add(elemento);
		}
	}

	public void remove(T elemento) {
		lista.remove(elemento);
	}
//	public List<T> getLista() {
//		
//		return lista;
//	}
// Intercambiamos el metodo getLista por el Iterator.
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return lista.iterator();
	}

	public int size() {
		return lista.size();
	}

}
