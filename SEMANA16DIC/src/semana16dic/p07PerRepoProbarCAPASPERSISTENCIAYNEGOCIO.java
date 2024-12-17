package semana16dic;

public class p07PerRepoProbarCAPASPERSISTENCIAYNEGOCIO {

	public static void main(String[] args) {

		PersonaRepositoryNueva repo = new PersonaRepositoryNueva();
		//Esto insertaria
		Persona z= new Persona ("Lidiota","Sanchez",25);
		repo.insertar(z);
		
		//Esto borraria
		Persona p= new Persona ("Manolo");
		repo.borrar(p);
		

		System.out.println("Tarea Realizada");
	}

}
