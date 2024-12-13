package Prueba9DicLunes;

public class E02ArrayWhileSuma {

	public static void main(String[] args) {
		
double [] lista= new double[] {2,5,6,7,3};

		double suma=sumaNTerminos(lista);
		System.out.println("*******");
		System.out.println(suma);
	}
	public static double sumaNTerminos(double[] lista) {
		
		double suma=0;
       int i=0;
		while (i<lista.length) {
        	suma= suma + lista[i];
        	i++;
        	
        	}
        return suma;
			
	}
	//MEJOR VERSION HECHA POR CECILIO
	//double[] lista = new double [] {2,5,6,7,3};
	//int i=0;
	//double suma=0;
	//while (i<lista.length) {
		
		//suma=suma+lista[i];
		//i++;
	//}
	//System.out.println(suma);

	
	}


