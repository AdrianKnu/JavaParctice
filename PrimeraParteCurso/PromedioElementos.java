package PrimeraParteCurso;
// Escribe un programa en el cual se cree una variable de tipo array que contenga cuatro elementos de tipo entero. 
// Estos elementos deben ser ingresados por el usuario. El programa debe sumar y promediar los cuatro elementos de forma manual e 
// imprimir por consola el resultado, utilizando solamente las herramientas adquiridas hasta el momento.

import java.util.Scanner;

public class PromedioElementos {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int res = 0;
            int[] array = new int[4];
            System.out.println("Ingrese 4 valores para calcular su promedio.");
            
            System.out.println("Ingrese el 1 valor: ");
            array[0] = s.nextInt();
            System.out.println("Ingrese el 2 valor: ");
            array[1] = s.nextInt();
            System.out.println("Ingrese el 3 valor: ");
            array[2] = s.nextInt();
            System.out.println("Ingrese el 4 valor: ");
            array[3] = s.nextInt();
            
            res =  ( array[0]+ array[1]+ array[2]+ array[3])/4;
            System.out.println("El promedio de los numero ingresados es: "+ res);
        }
    }
}
