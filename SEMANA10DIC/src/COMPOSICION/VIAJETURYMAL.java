package COMPOSICION;

public class VIAJETURYMAL {

	public static void main(String[] args) {
		
		
	TURISTA t1 = new TURISTA ("Manolo");
	MALETA m1 = new MALETA ("Samsonite",15.7);
	MALETA m2 = new MALETA ("SIOUX", 17.9);
	
	
	//Con esto asignamos las maletas al turista. Asignamos los objetos de una clase a otra.
	t1.setMaleta1(m1);
	t1.setMaleta2(m2);
	
	System.out.println("EL turista "+t1.getNombre()+" porta un peso total de: "+t1.getPesoTotal()+"Kg");
	System.out.println("EL turista "+t1.getNombre()+" porta un peso total (incluido el sobrepeso) de: "+t1.getPesoTotal(1)+"Kg");
	System.out.println("EL turista "+t1.getNombre()+" porta un peso total, incluyendo el sobrepeso del tipo de carcasa y del embalaje, de: "+t1.getPesoTotal()+t1.getPesoTotal("ligera")+"Kg");
	}
}
