package PrimeraParteCurso;
import java.util.Scanner;

public class ConversionMm {
    public static void main(String[] args) {
        String cadena;
        int op;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Ingrese una cadena: ");
            cadena = s.nextLine();
            System.out.println("Como desea ver la cadena?");
            System.out.println("1.Mayuscula");
            System.out.println("2.Minuscula");
            op = s.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("En mayuscula: "+ cadena.toUpperCase());
                break;
        
            case 2:
                System.out.println("En minuscula: "+ cadena.toLowerCase());
                break;
        
            default:
            System.out.println("Opcion Incorrecta.");
                break;
        }
        
        
    }
}
