package semana16dic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class p05TryCatch {

	public static void main(String[] args) {
		
		Path ruta = Paths.get("Pillar.txt");
		
		try {
			List<String> lineas = Files.readAllLines(ruta);
			
			for (String linea: lineas) {
				
				System.out.println(linea);
			}
		}catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			//Comando exclusivo de try/catch para cerrar recursos, por ejemplo las conexiones en sql
			System.out.println("cerrar");
		}

	}

}
