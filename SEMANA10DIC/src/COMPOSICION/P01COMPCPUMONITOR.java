package COMPOSICION;

public class P01COMPCPUMONITOR {

	public static void main(String[] args) {
		
		Monitor m1= new Monitor("LG",200);
		System.out.println("Monitor: ");
		System.out.println("Marca - "+m1.getMarca());
		System.out.println(" Precio - "+m1.getPrecio()+"€");
		
		CPU c= new CPU ("Intel","i7",400);
		System.out.println("CPU: ");
		System.out.println("Marca - "+c.getMarca());
		System.out.println(" Procesador - "+c.getProcesador());
		System.out.println("  "+"Precio - "+c.getPrecio()+"€");
		
		ORDENADOR pc = new ORDENADOR (m1,c);
		System.out.println("El precio del PC es: "+pc.getPrecioTotal()+"€");
		//System.out.println(pc); //Esta instruccion te devuelve la informacion de donde está guardado en la memoria
		
	}

}
