package PrimeraParteCurso;
import java.util.Scanner;

public class ContarOcurrencia {
    public static void main(String[] args) {
        char[] frase = new char[50];
        Scanner s = new Scanner(System.in);
        String frase1 = "estamos aprendiendo java y vos";
        for (int i = 0;i < frase1.length(); i++)  {
            frase[i]= frase1.charAt(i);
        }
        System.out.println("Ingrese la letra que desea contar: ");
        char letra = s.next().charAt(0);
        int cont =0;
        for (char c : frase) {
            if (c == letra) {
             cont++;   
            }
        }
        if (cont != 0) {
            System.out.println("Se encontraron "+cont+ " caracteres "+letra);
        }else{
            System.out.println("No se encontro ninguna ocurrencia de la letra "+letra);
        }
    }
}
