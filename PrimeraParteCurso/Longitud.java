package PrimeraParteCurso;
import java.util.Scanner;

public class Longitud {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("ingrese una frase para saber su longitud");
            String cadena = s.nextLine();
            System.out.println("La frase: "+ cadena + "Contiene " + cadena.length() + " Caracteres.");
        }
    }
}
