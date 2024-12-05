package PrimeraParteCurso;
import java.util.Scanner;

public class CalculandoCadenas {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String cadena;
            System.out.println("Ingrese una cadena para saber su longitud sin espacions en blanco");
            cadena = s.nextLine();
            System.out.println("La cadena sin espacios es:"+ cadena.replaceAll(" ",""));
            System.out.println("La cadena contiene " + cadena.length() + " caracteres");
        }
    }
}
