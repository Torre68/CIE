package semana16dic;

import java.util.ArrayList;

public class FacturaRepo2TestingClosingConnection {

	public static void main(String[] args) {
		FacturaRepository2 repo= new FacturaRepository2 ();
		
		ArrayList<Factura> lista = repo.buscarTodas();
		//RECORDAR IMPORTAR LAS UTILIDADES DE JAVA COMO LA ARRAYLIST
		
		for (Factura f: lista) {
		
		
				
				System.out.println(f.getNumero());
				//NO FUNCIONABA PORQUE en la SQL Número estaba con tilde y en el programa de Java NO!!
				System.out.println(f.getConcepto());
				System.out.println(f.getImporte());
	
		
		

	}

	}
	
}

	


