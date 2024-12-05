package PrimeraParteCurso;
import java.util.Scanner;

public class Primosnumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de números primos que deseas obtener: ");
        int cantidadPrimos = scanner.nextInt();
        
        int contadorPrimos = 0;  // Contador de números primos encontrados
        int numero = 2;  // Empezamos a buscar desde el número 2, ya que es el primer número primo

        System.out.println("Los primeros " + cantidadPrimos + " números primos son:");

        while (contadorPrimos < cantidadPrimos) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contadorPrimos++;
            }
            numero++;
        }
        
        scanner.close();
    }
    
    // Método que verifica si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;  // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // Si es divisible por cualquier número distinto de 1 y de sí mismo, no es primo
            }
        }
        return true;
    }
}
