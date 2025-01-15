package Examen;

import java.util.ArrayList;

public class ArrayListInverso {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		lista.add(0, "hola");
		lista.add(1, "que");
		lista.add(2, "tal");
		lista.add(3, "estas");

		for (int i = lista.size() - 1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}

	}
}