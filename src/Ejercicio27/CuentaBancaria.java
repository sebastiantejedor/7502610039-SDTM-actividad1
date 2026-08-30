package Ejercicio27;

public class CuentaBancaria {

    public String titular;
    public double saldoInicial;
    public int numero;

    public CuentaBancaria(String titular, double saldoInicial, int numero) {
        this.titular = titular;
        this.saldoInicial = saldoInicial;
        this.numero = numero;
    }

    void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo inicial: $" + saldoInicial);
        System.out.println("Número de cuenta: " + numero);
    }
}
