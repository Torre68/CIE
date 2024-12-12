package COMPOSICION;

public class TURISTA {
	
	private String nombre;
	private MALETA maleta1;
	private MALETA maleta2;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public MALETA getMaleta1() {
		return maleta1;
	}
	public void setMaleta1(MALETA maleta1) {
		this.maleta1 = maleta1;
	}
	public MALETA getMaleta2() {
		return maleta2;
	}
	public void setMaleta2(MALETA maleta2) {
		this.maleta2 = maleta2;
	}
	public TURISTA(String nombre) {
		super();
		this.nombre = nombre;
	}

	public double getPesoTotal () {
		//Estos if and double lo que hacen es prevenir que si no se asigne una maleta el programa no de error
		double getPesoTotal=0;
		if (maleta1!=null)
			getPesoTotal=getPesoTotal+maleta1.getPeso();
		if (maleta2!=null)
			getPesoTotal=getPesoTotal+maleta2.getPeso();
		return getPesoTotal;
		//MUCHO CUIDADO al asignar el nombre de las variables y que estas concuerden adecuadamente
	}
	public double getPesoTotal (double sobrepeso) {
		//La funcion se puede llamar igual porque tiene parametros distintos (POLIMORFISMO ESTATICO)
		// SOBRECARGA ESTATICA=POLIMORFISMO ESTATICO
		//Podemos ahorrarnos lineas de codigo a traves de eliminar las partes que se repiten 
		// siguiento el principio DRY Don't Repeat Yourself
		//Aqui eliminamos los double y el if
		
		return getPesoTotal()+sobrepeso;
	}
		
		

	
	public double getPesoTotal (String tipoCarcasa) {
		//La funcion se puede llamar igual porque tiene parametros distintos (POLIMORFISMO ESTATICO)
		//COMENTADO EN VEZ DE BORRADO
		double getPesoTotal=0;
		//if (maleta1!=null)
			//getPesoTotal=getPesoTotal+maleta1.getPeso();
		//if (maleta2!=null)
		//	getPesoTotal=getPesoTotal+maleta2.getPeso();
		//si el tipo de carcasa que paso pone "ligera" se añaden 2kg de lo contrario añado 4kg
		if (tipoCarcasa.equals("ligera")) {
			//ATENCION a como se comparan los String con String.equals()
			getPesoTotal = getPesoTotal+2;}
		else {getPesoTotal =getPesoTotal+4;}
			
		
		//LAS FUNCIONES DE SOBREPESO Y CARCASA SE PODRIAN UNIR EN UNA SOLA FUNCION
		//public double getPesoTotal (double sobrepeso, String tipoCarcasa) {
			//double getPesoTotal=0;
			//if (maleta1!=null)
				//getPesoTotal=getPesoTotal+maleta1.getPeso();
			//if (maleta2!=null)
				//getPesoTotal=getPesoTotal+maleta2.getPeso();
			//si el tipo de carcasa que paso pone "ligera" se añaden 2kg de lo contrario añado 4kg
			//if (tipoCarcasa.equals("ligera")) {
				//ATENCION a como se comparan los String con String.equals()
				//getPesoTotal = getPesoTotal+2;}
			//else {getPesoTotal =getPesoTotal+4;
				
		
		return getPesoTotal;
		
		
		
		

	
	}
}
