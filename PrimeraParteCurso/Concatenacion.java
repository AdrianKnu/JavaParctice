package PrimeraParteCurso;
import java.util.Scanner;

public class Concatenacion {
    public static void main(String[] args) {
        String nombre, apellido;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("ingrese su nombre:");
            nombre = s.nextLine();
            System.out.println("Ingrese su apellido:");
            apellido = s.nextLine();
        }
        System.out.println("Su nombre completo es:"+ nombre.concat(" "+ apellido));
    }
}
