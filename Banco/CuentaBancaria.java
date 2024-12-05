package Banco;
import Banco.SaldoInsuficienteException;
public class CuentaBancaria {
    private double saldo;

    // Constructor
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para retirar dinero
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Intentaste retirar: " + 
                                                  cantidad + ", pero tu saldo es: " + saldo);
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }

    // Método para consultar el saldo
    public double getSaldo() {
        return saldo;
    }
}
