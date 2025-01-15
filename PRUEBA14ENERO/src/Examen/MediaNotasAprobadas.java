package Examen;
import java.util.ArrayList;

public class MediaNotasAprobadas {
    public static void main(String[] args) {
       
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(4);
        notas.add(6);
        notas.add(8);
        notas.add(3);
        notas.add(5);
        notas.add(10);
        notas.add(2);
        
       
        int suma = 0;
        int contador = 0;

        
        for (Integer nota : notas) {
            if (nota >= 5) { 
                suma += nota;
                contador++;
            }
        }

       
        if (contador > 0) {
            int media =  suma / contador; 
            System.out.println("La media de las notas aprobadas es: " + media);
        } else {
            System.out.println("No hay notas aprobadas.");
        }
    }
}
