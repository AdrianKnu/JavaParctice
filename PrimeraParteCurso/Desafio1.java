package PrimeraParteCurso;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String unidad;
            double temp = 0, result = 0;
            
            try {
                System.out.println("Ingrese la temperatura: ");
                temp = s.nextDouble();
                System.out.println("Ingrese la unidad de medida para la conversion (C/F): ");
                s.nextLine();
                unidad = s.nextLine().toUpperCase();
                
                switch (unidad) {
                    case "F":
                        result = (temp - 32)* 5 / 9;
                        System.out.println(temp + " grados Fahrenheit equivale a %.2f%n"+ result + " grados Celsius.");
                        break;
                
                    case "C":
                        result = (temp * 9 / 5) + 32;
                        System.out.println(temp + " grados Celsius equivale a %.2f%n "+ result + " grados Fahrenheit.");
                        break;
                
                    default:
                    System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
                // TODO: handle exception
            }
        }
        
    }
}

// import java.util.InputMismatchException;
// import java.util.Scanner;
// import java.text.DecimalFormat;

// public class ConvTemp {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// DecimalFormat df = new DecimalFormat("#.00");

// try {
// System.out.print("Ingrese la temperatura: ");
// double temperatura = scanner.nextDouble();

// System.out.print("Ingrese la unidad de medida (C/F): ");
// String unidad = scanner.next().toUpperCase();

// switch (unidad) {
// case "C" -> {
// double fahrenheit = (temperatura * 9 / 5) + 32;
// System.out.println(temperatura + " grados Celsius equivale a " + df.format(fahrenheit) + " grados Fahrenheit.");
// }
// case "F" -> {
// double celsius = (temperatura - 32) * 5 / 9;
// System.out.println(
// temperatura + " grados Fahrenheit equivale a " + df.format(celsius) + " grados Celsius.");
// }
// default -> System.out
// .println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
// }

// } catch (InputMismatchException e) {
// System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
// }

// scanner.close();
// }
// }

// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class Desafio1 {
// public static void main(String[] args) {
// try (Scanner s = new Scanner(System.in)) {
// String unidad;
// double temp = 0;

// try {
// System.out.println("Ingrese la temperatura: ");
// temp = s.nextDouble();
// System.out.println("Ingrese la unidad de medida para la conversion (C/F): ");
// s.nextLine();
// unidad = s.nextLine().toUpperCase();

// switch (unidad) {
// case "F":
// System.out.printf(temp + " °F a Celcius es: %.2f °C%n", (temp - 32) * 5 / 9);
// break;

// case "C":
// System.out.printf(temp + " °C a Fahrenheit es: %.2f °F%n", (temp * 9 / 5) + 32);
// break;

// default:
// System.out.println(
// "Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
// break;
// }

// } catch (InputMismatchException e) {
// System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
// }
// }

// }
// }

