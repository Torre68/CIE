package semana16dic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonaRepositoryNueva {
	//CAPA DE PERSISTENCIA. En el simil del frigorifico y la lasaña, esta capa es el frigorifico.
	static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	   static final String USER = "root";
	   static final String PASS = "";
	   static final String QUERY = "SELECT * from Personas";
	
	public void insertar(Persona persona) {
		try {
			 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
		     Statement sentencia = conexion.createStatement();
		     
		    
		     
		     String consultaInsertar= "insert into personas values ('"+persona.getNombre()+"','"+persona.getApellidos()+"',"+persona.getEdad()+")";
		     System.out.println(consultaInsertar);
	
		     sentencia.executeUpdate(consultaInsertar);
		     
		   {		      
		    
		       
		     }
		  
	} catch (SQLException e) {
		// TODO Auto-generated catch block

	}
	}
	public void borrar (Persona persona) {
	try {
		 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
	     Statement sentencia = conexion.createStatement();
	    

	     sentencia.executeUpdate("delete from personas where Nombre = '"+persona.getNombre()+"'");
	     
	     {		      
	    
	       
	     }
	  
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
		
		
	}

}
