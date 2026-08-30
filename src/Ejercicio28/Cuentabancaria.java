package Ejercicio28;

public class Cuentabancaria {

    public String titular;
    public double saldoInicial;
    public int numero;

    public Cuentabancaria(String titular, double saldoInicial, int numero) {
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
