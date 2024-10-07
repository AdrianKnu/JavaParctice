import java.util.Scanner;

public class ClasificadorParImpar {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numero;
            System.out.println("Ingrese un numero para determinar si es Par o Impar: ");
            numero = scan.nextInt();
            if (numero%2 == 0 ) {
                System.err.println("Es un numero PAR");
            }else{
                System.err.println("Es un numero IMPAR");
            }
        }
    }
}
