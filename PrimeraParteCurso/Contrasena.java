package PrimeraParteCurso;
import java.util.Random;
import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Introduce la longitud de la contraseña: ");
        int longitud = scanner.nextInt();
        
        char[] contrasena = new char[longitud];
        
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;

        do {
            tieneMayuscula = false;
            tieneMinuscula = false;
            tieneDigito = false;
            
            for (int i = 0; i < longitud; i++) {
                int tipoCaracter = random.nextInt(3);

                if (tipoCaracter == 0) { // Dígito
                    contrasena[i] = (char) (random.nextInt(10) + '0');
                    tieneDigito = true;
                } else if (tipoCaracter == 1) { // Minúscula
                    contrasena[i] = (char) (random.nextInt(26) + 'a');
                    tieneMinuscula = true;
                } else { // Mayúscula
                    contrasena[i] = (char) (random.nextInt(26) + 'A');
                    tieneMayuscula = true;
                }
            }
        } while (!tieneMayuscula || !tieneMinuscula || !tieneDigito);

        StringBuilder contrasenaFinal = new StringBuilder();
        for (char c : contrasena) {
            contrasenaFinal.append(c);
        }

        System.out.println("Contraseña generada: " + contrasenaFinal.toString());

        scanner.close();
    }
}
