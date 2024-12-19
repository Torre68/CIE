package semana16dic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RepoNuevaTestingResultSet {

	public static void main(String[] args) {
		
		

			// instancio el repositorio
			PersonaRepositoryNueva2MEJORADO repo = new PersonaRepositoryNueva2MEJORADO();
			//llamo al metodo buscarTodos()
			// ese metodo devuelve un resultSet
			// lo asocio
			ArrayList<Persona> lista = repo.buscarTodos();

			//ya tengo un resultset 
			//lo recorro como lo recorri otras veces 
			for (Persona p: lista) {
				
				System.out.println(p.getNombre());
				System.out.println(p.getApellidos());
				System.out.println(p.getEdad());
				
			}

		}

}
