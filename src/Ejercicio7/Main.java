package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "Toyota";
        vehiculo1.modelo = "Yaris Hatchback";
        vehiculo1.velocidad = 120;

        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.marca = "Honda";
        vehiculo2.modelo = "Civic";
        vehiculo2.velocidad = 200;

        System.out.println("Información del primer vehículo:");
        vehiculo1.MostrarInformacion();

        System.out.println("\nInformación del segundo vehículo:");
        vehiculo2.MostrarInformacion();
    }
}
