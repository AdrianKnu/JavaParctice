package PrimeraParteCurso;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayando {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Ingrese el tamaño del Array: ");
            int size = s.nextInt();
            System.out.println("Ingrese el valor con el que desea llenar TODO el Array: ");
            int valor = s.nextInt();
            int[] array = new int[size];
            Arrays.fill(array, valor);
            System.out.println(Arrays.toString(array));
        }
    }
}
