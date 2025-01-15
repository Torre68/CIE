package Examen;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
public class ScannerDate {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una fecha dd-MM-yyyy");
		
		
		String fechaTexto =  sc.nextLine();
		sc.close();

		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date fecha = null;
		try {
			fecha = df.parse(fechaTexto);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		Calendar calen = Calendar.getInstance();
		calen.setTime(fecha);


		
		System.out.println(Calendar.YEAR);

	}

}
