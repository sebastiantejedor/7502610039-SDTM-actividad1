package Ejercicio7;

public class Vehiculo {
    String marca;
    String modelo;
    int velocidad;

    void MostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad + " km/h");
    }
}
