
import java.util.Scanner;

public class ImprimiendoInfo {
    public static void main(String[] args) {
        String name;
        int edad;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            name = scan.nextLine();
            System.out.println("Ingrese su edad: ");
            edad = scan.nextInt();
        }
        System.out.println("Su nombre es: " + name + " y su edad es: " + edad);
        System.out.println("UHa uha viste che, adivino todo :)");
    }
}
