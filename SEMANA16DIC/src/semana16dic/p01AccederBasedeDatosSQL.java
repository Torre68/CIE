package semana16dic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class p01AccederBasedeDatosSQL {
		
		   static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
		   static final String USER = "root";
		   static final String PASS = "";
		   static final String QUERY = "SELECT * from Personas";

		   public static void main(String[] args) {
		      // Open a connection
		    try {
					 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				     Statement sentencia = conexion.createStatement();
				     ResultSet conjuntoResultados = sentencia.executeQuery(QUERY);
				    
				   {		      
				     while(conjuntoResultados.next()){
				        //Display values
				        System.out.println(conjuntoResultados.getString("nombre"));
				        System.out.println(conjuntoResultados.getString("apellidos"));
				        System.out.println(conjuntoResultados.getInt("edad"));
				       
				     }
				  }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		   }
		

}

