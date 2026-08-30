package Ejercicio14;

public class CuentaBancaria {

    String numeroCuenta;
    String titular;
    double saldo;

    void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("saldo: $" + saldo);
        System.out.println("Número de cuenta: " + numeroCuenta);
    }

    void consignar(double valor) {
        saldo += valor;
        System.out.println("Consignación realizada correctamente.");
        System.out.println("Nuevo saldo: $" + saldo);
    }


    void retirar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Retiro realizado correctamente.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}