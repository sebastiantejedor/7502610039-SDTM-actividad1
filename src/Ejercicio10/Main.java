package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numeroCuenta = "123456789";
        cuenta1.titular = "Juan Campos";
        cuenta1.saldo = 1000.0;

        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta2.numeroCuenta = "987654321";
        cuenta2.titular = "María López";
        cuenta2.saldo = 500.0;

        System.out.println("Información de la cuenta 1:");
        cuenta1.mostrarInformacion();

        System.out.println("\nInformación de la cuenta 2:");
        cuenta2.mostrarInformacion();
    }
}
