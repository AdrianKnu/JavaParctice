package Banco;
import Banco.SaldoInsuficienteException;
import java.util.Scanner;

public class AplicacionBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una cuenta bancaria con saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria(1000.0);

        try {
            // Mostrar el saldo inicial
            System.out.println("Saldo inicial: " + cuenta.getSaldo());

            // Solicitar al usuario una cantidad para retirar
            System.out.print("Ingrese la cantidad a retirar: ");
            double cantidad = scanner.nextDouble();

            // Intentar realizar el retiro
            cuenta.retirar(cantidad);

        } catch (SaldoInsuficienteException e) {
            // Manejo específico de la excepción SaldoInsuficienteException
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Manejo genérico de otras excepciones
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            // Aseguramos el cierre del Scanner
            scanner.close();
            System.out.println("Operación finalizada.");
        }
    }
}

