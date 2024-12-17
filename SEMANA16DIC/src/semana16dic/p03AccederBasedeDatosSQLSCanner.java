package semana16dic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class p03AccederBasedeDatosSQLSCanner {
		
		   static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
		   static final String USER = "root";
		   static final String PASS = "";
		   static final String QUERY = "SELECT * from Personas";

		   public static void main(String[] args) {
			   
			   Scanner sc = new Scanner(System.in);
			   System.out.println("Inserta nombre");
			   String nombre = sc.next();
			   System.out.println("inserta apellidos");
			   String apellidos =sc.next();
			   System.out.println("inserta edad");
			   int edad = sc.nextInt();
		      // Open a connection
		    try {
					 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				     Statement sentencia = conexion.createStatement();
				    
			//ATENCION para cambiar de texto fijo a texto de variables hay que estar al loro con la especificidad del la sintaxis
				     //sentencia.executeUpdate("insert into personas values ('Ceci','Alvarez',50)");
				     //Comparada con
				     sentencia.executeUpdate("insert into personas values ('"+nombre+"','"+apellidos+"',"+edad+")");
				     //Donde hay que tener mucho cuidado cuando y donde se abre, para cerrar de manera acorde. CONCORDANCIA
				     //En edad no hace falta ' ' porque es una int no String
				   {		      
				    
				       
				     }
				  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		   }
		

}

