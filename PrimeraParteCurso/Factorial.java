package PrimeraParteCurso;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int num =0, resultado=1, aux=1;
            System.out.println("Ingrese un numero para calcular su factorial: ");
            num = s.nextInt();
            do {
                resultado = resultado * aux;
                aux++;
            } while (aux <= num);
            System.out.println("El factorial del numero ingresado es: "+ resultado);
        }  
    }
}
