package PrimeraParteCurso;
import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        float precio, precioConDesc;
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Ingrese el valor del producto para determinar su descuento:");
            precio = s.nextFloat();
            if (precio >= 100) {
                precioConDesc = (precio * 0.90f);
                System.out.println(String.format("En hora buena! Obtuviste un descuento de: %.2f ", precioConDesc));
            }else{
                System.out.println("Suerte la proxima :)");
            }
        }
    }
}