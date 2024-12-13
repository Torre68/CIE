package Prueba9DicLunes;

public class E05StringArrayLetraE {

	public static void main(String[] args) {


		String cadena = "hola me llamo pepe y soy informatico";
		
		
	int suma=0;
		for (int i=0;i<cadena.length();i++) {
			System.out.println(cadena.charAt(i));
			
			if ( cadena.charAt(i) =='e')  {
				suma++;
				
				
			}
		
		}
		System.out.println("El número de veces que aparece la letra 'e' es de:"+suma);
			
			
			
		
	}

	}


