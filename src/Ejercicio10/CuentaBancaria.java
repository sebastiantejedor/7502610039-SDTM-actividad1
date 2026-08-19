package Ejercicio10;

public class CuentaBancaria {
    String numeroCuenta;
    String titular;
    double saldo;

    void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }
}
