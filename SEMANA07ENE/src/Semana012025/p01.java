package Semana012025;

import java.util.HashMap;
import java.util.Set;

public class p01 {

	public static void main(String[] args) {
		
			
		Mesa m = new Mesa (10, "Marron");
		Mesa m1 = new Mesa (10, "Marron");
		Mesa m2 = new Mesa (7, "Blanco");
		System.out.println(m); //Con el metodo override de To String conseguimos esto.
		System.out.println(m.equals(m1));//Metodo Hashcode y equals. (Para comparar los valores de los objetos)
		System.out.println(m==m1); //Este metodo == o != solo se usa para tipos primitivos, o 
		//en caso de los objetos, solo para ver si dos objetos apuntan al mismo objeto en memoria y no
		//a sus valores.
		System.out.println(m.hashCode());
		System.out.println(m1.hashCode());
		
		HashMap<String,Mesa> diccionario = new HashMap<String, Mesa> ();
		diccionario.put("1A", m1);
		diccionario.put("1B", m);
		diccionario.put("1C", m2);
		System.out.println(diccionario.get("1C"));
		
		System.out.println("*************************");
		
		Set<String> claves = diccionario.keySet();
		for (String i: claves) {
			System.out.println(diccionario.get(i));
		}
		

	}

}
