import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        int numero;
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Ingrese un numero para determinar si es divisible por 5 o 3:");
            numero = s.nextInt();
            if ((numero % 3 == 0)&&(numero % 5 == 0)) {
                System.out.println("El numero es divisible por TRES y CINCO");
            } else if (numero % 3 == 0) {
                System.out.println("El numero es divisible por TRES");
            } else if (numero % 5 == 0) {
                System.out.println("El numero es divisible por CINCO");
            }else {
                System.out.println("El numero no es divisible por TRES o CINCO");
            }
        }
    }
}
