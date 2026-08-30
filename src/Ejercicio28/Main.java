package Ejercicio28;

public class Main {

    public static void main(String[] args) {
        Cuentabancaria cuenta1 = new Cuentabancaria("Juan Pérez", 1000.0, 123456);
        cuenta1.mostrarInformacion();

        Cuentabancaria cuenta2 = new Cuentabancaria("María García", 1500.0, 789012);
        cuenta2.mostrarInformacion();

        Cuentabancaria cuenta3 = new Cuentabancaria("Carlos López", 2000.0, 345678);
        cuenta3.mostrarInformacion();

    }
}
