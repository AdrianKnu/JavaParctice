package PrimeraParteCurso;
import java.util.Scanner;

public class Barraestado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];

        // Solicitar los números al usuario
        for (int i = 0; i < numeros.length; i++) {
            int numero;
            do {
                System.out.print("Introduce el número " + (i + 1) + " (entre 1 y 20): ");
                numero = scanner.nextInt();
                if (numero < 1 || numero > 20) {
                    System.out.println("Error: el número debe estar entre 1 y 20.");
                }
            } while (numero < 1 || numero > 20);

            numeros[i] = numero;
        }

        System.out.println("\nGráfico de barras:");
        
        // Generar el gráfico de barras
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" (" + numeros[i] + ")");
        }

        scanner.close();
    }
}

