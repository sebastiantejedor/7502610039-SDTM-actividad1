package Ejercicio11;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.velocidad = 50;
        v1.acelerar();
        System.out.println("Velocidad: " + v1.velocidad);
    }
}
