package PrimeraParteCurso;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Redondeo {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            float numero;
            System.out.println("Ingrese un numero para ver su valor redondeado: ");
            try {
                numero = s.nextFloat();
                System.out.println("El numero redondea es igual a: "+ Math.round(numero));
            } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Ingrese unicamente numeros por favor, utilizando el punto");
               // TODO: handle exception
            }
            
            
        }
    }
}
