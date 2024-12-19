package semana16dic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FacturaRepository {

	//CAPA DE PERSISTENCIA. En el simil del frigorifico y la lasaña, esta capa es el frigorifico.
		static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
		   static final String USER = "root";
		   static final String PASS = "";
		   static final String QUERY = "SELECT * from Factura";
		
		public void insertar(Factura factura) {
			try {
				 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			     Statement sentencia = conexion.createStatement();
			     
			     //METODO DE TRAZABILIDAD. Esto de abajo es escribir mas codigo pero al hacerlo asi es capaz de lanzar un chivato
			     //que te avisa en caso de haber un error en el codigo (especialmente util con complicaciones de '+")
			     
			     String consultaInsertar= "insert into factura values ('"+factura.getNumero()+"','"+factura.getConcepto()+"',"+factura.getImporte()+")";
			     System.out.println(consultaInsertar);
		
			     sentencia.executeUpdate(consultaInsertar);
			     
			   {		      
			    
			       
			     }
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block

		}
		}
		public void borrar (Factura factura) {
		try {
			 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
		     Statement sentencia = conexion.createStatement();
		    

		     sentencia.executeUpdate("delete from factura where concepto = '"+factura.getConcepto()+"'");
		     //Comando para borrar de SQL desde Java. Con introducir una variable es suficiente porque borra la linea completa
		  // CUIDADISIMO CON las '' y las "" y su orden y concordancia
		     {		      
		    
		       
		     }
		  
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
			
			
		}

	}

