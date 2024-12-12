package ejercicios;

import java.util.ArrayList;

public class p01ARRAYLIST {

	public static void main(String[] args) {
		
		
		ArrayList <Integer> lista = new ArrayList <Integer> ();
		lista.add(5);
		lista.add(8);
		lista.add(9);
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		System.out.println("Tamaño de la lista= " +lista.size());
		
		
		System.out.println(lista);
		

		System.out.println("La lista número a número es:");
		for (int i=0;i<lista.size();i++)
		{
			
			System.out.println("<"+lista.get(i)+">");
		}
		
		System.out.println("La lista número a número al reves es:");	
		for (int i=lista.size()-1;i>=0;i--)
			//OJO al ir al reves por el factor -1 y los <>= a para que no se coma ninguna posicion
		{
			System.out.println("<"+lista.get(i)+">");
		}
		
	}

}
