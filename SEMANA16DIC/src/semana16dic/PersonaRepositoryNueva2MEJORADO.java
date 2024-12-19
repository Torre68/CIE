package semana16dic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonaRepositoryNueva2MEJORADO {
	//CAPA DE PERSISTENCIA. En el simil del frigorifico y la lasaña, esta capa es el frigorifico.
	static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	   static final String USER = "root";
	   static final String PASS = "";
	   static final String QUERY = "SELECT * from Personas";
	
	public void insertar(Persona persona) {
		//Al introducir la CAPA NEGOCIO RECORDAR Cambiar de "variable, variable, variable" a Persona persona o Factura factura o lo que toque.
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
	e.printStackTrace();}
} 
	
		
	
public ResultSet Apellidos () {
		
		ResultSet rs= null;
		try {
			//con esto conecto a la base de datos
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
		     // preparo la sentencia
			Statement sentencia = conexion.createStatement();
			//Ejecuto
		     
		     rs = sentencia.executeQuery("Select apellidos from Personas");
		}
	 catch (SQLException e) {
		e.printStackTrace();
		
	 }
		return rs;
}
		public ArrayList<Persona> buscarTodos() {

			ResultSet rs=null;
			Connection conexion=null;
			ArrayList<Persona> lista= new ArrayList<Persona>();
			try {
				//conecto a la base de datos
				conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				//preparo la sentencia
				Statement sentencia = conexion.createStatement();
				//ejecuto
				rs = sentencia.executeQuery("select * from Personas");
				while (rs.next()) {
					
					Persona p= new Persona(rs.getString("nombre"),
							rs.getString("apellidos"), rs.getInt("edad"));
					
					lista.add(p);
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
				if (conexion!=null) {
					try {
						conexion.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return lista;
}
}
