package semana16dic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class p04DeletefromSQL2 {
		
		   static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
		   static final String USER = "root";
		   static final String PASS = "";
		   static final String QUERY = "SELECT * from Personas";

		   public static void main(String[] args) {
			   
			  
		      // Open a connection
		    try {
					 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				     Statement sentencia = conexion.createStatement();
				    
			
				     sentencia.executeUpdate("delete from personas where Nombre = 'Pepe'");
				     //Comando para borrar de SQL desde Java. Con introducir una variable es suficiente porque borra la linea completa
				  
				     {		      
				    
				       
				     }
				  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		   }
		

}

