package semana16dic;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RepoNueva2MEJORADOTesting {

	public static void main(String[] args) {
		
		PersonaRepositoryNueva repo= new PersonaRepositoryNueva ();
		//LLamo al metodo AllData
		//Este metodo devuelve un ResultSet
		// lo siguiente es asociado
		ResultSet rs = repo.AllData();
		// ya esta el resultset asociado
		//lo recorro como otras veces con el bucle while y la funcion .next()
		
		try {
			while (rs.next()) {
				
				System.out.println(rs.getString("nombre"));
				System.out.println(rs.getString("apellidos"));
				System.out.println(rs.getInt("edad"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
