package ejercicios;

import java.util.ArrayList;

public class p02ArrayLISTNumMayor {

	public static void main(String[] args) {
		
		ArrayList <Integer> lista = new ArrayList <Integer> ();
		lista.add(33);
		lista.add(8);
		lista.add(9);
		
	int mayor=0;
	
	for (int i=0;i<lista.size();i++) {
		
		if (lista.get(i)> mayor) {
    		mayor=lista.get(i);
    	}
	}
	System.out.println(mayor);
	

		}
}


	


