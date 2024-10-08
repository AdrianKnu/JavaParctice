import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            float num1, num2, result;
            System.out.println("Ingrese el primer valor:");
            num1 = s.nextInt();
            System.out.println("Ingrese el Segundo valor:");
            num2 = s.nextInt();
            System.out.println("Seleccione la operacion que desea realizar:");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            int op = s.nextInt();
            result = ((op == 1) ? num1 + num2 :
            (op == 2) ? num1 - num2 :
            (op == 3) ? num1 * num2 : num1 / num2  );
            System.out.println("El resultado es: "+ result);
        }
        
    }
}
