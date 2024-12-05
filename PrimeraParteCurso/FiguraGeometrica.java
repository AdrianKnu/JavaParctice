package PrimeraParteCurso;
import java.util.Scanner;

public class FiguraGeometrica {
    public static void main(String[] args) {
        int figura, lado, base, altura;
        double radio, area = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Eliga un figura par calcular su Area");
        System.out.println("1.Circulo");
        System.out.println("2.Cuadrado");
        System.out.println("3.Triangulo");
        figura = s.nextInt();
        switch (figura) {
            case 1:
                System.out.println("Complete los datos requieridos");
                System.out.println("Ingrese el radio del circulo");
                radio = s.nextInt();
                area = (3.14 * radio * 2);
                break;
            case 2:
                System.out.println("Complete los datos requieridos");
                System.out.println("ingrese la medida de un lado");
                lado = s.nextInt();
                area = lado * lado;
                break;
            case 3:
                System.out.println("Complete los datos requieridos");
                System.out.println("Ingrese la base:");
                base = s.nextInt();
                System.out.println("Ingrese la altura:");
                altura = s.nextInt();
                area = (base * altura)/2 ;
                break;
        
            default:
            System.out.println("Opcion Invalida. :(");
                break;
        }
        System.out.println("El area de la figura es :" + area);
    }
}
