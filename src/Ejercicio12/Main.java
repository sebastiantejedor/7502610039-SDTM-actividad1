package Ejercicio12;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.velocidad = 50;

        System.out.println("Velocidad inicial: " + vehiculo.velocidad);
        vehiculo.frenar();
        System.out.println("Velocidad después de frenar: " + vehiculo.velocidad);
    }
}
