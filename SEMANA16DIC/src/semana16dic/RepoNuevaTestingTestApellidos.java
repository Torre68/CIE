package semana16dic;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RepoNuevaTestingTestApellidos {

	public static void main(String[] args) {
		PersonaRepositoryNueva repo= new PersonaRepositoryNueva ();
		
		ResultSet rs = repo.Apellidos();		
		try {
			while (rs.next()) {
				
				
				System.out.println(rs.getString("apellidos"));
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}


}
