package COMPOSICION;

import java.util.ArrayList;

public class TuristaVIPp01 {

	public static void main(String[] args) {
		//Creamos un objeto TuristaVIP
		//Con el constructor asignamos nombre
		//cuya variable es manolo
		TuristaVIP manolo = new TuristaVIP ("manolo");
		
		
		//Aqui creamos las maletas con sus parametros
		MALETA m1= new MALETA ("Samso", 10);
		MALETA m2= new MALETA ("Ben", 23);
		
		//Usamos el metodo addmaleta de la clase TuristaVIP
		//para añadir a manolo las dos maletas
		manolo.addMALETA(m1);
		manolo.addMALETA(m2);
		
		ArrayList <MALETA> maletas = manolo.getMaletas();
		//CREO EL ARRAYLIST, le nombro y le asigno como valor = manolo.getMaletas()
		for (int i=0;i<maletas.size();i++) {
			//Recorremos el ARRAYLIST para imprimir los parametros de las maletas
			
			System.out.println(maletas.get(i).getModelo());
			System.out.println(maletas.get(i).getPeso());
			//
			MALETA maletaR=maletas.get(i);
			//Generamos esta variable para manipular solo esta parte del objeto y trabajar mas facil con el
			//Si declaramos esta variable nos ahorramos codigo y seria la forma compacta de lo de 
			//arriba, y quedaria asi:
			System.out.println(maletaR.getModelo());
			System.out.println(maletaR.getPeso());
		}



	}

}
