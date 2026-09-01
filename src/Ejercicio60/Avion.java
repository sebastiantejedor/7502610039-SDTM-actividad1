package Ejercicio60;

public class Avion {
    String aerolinea;
    String destino;
    int pasajeros;

    public void abordar(int cantidad) {
        pasajeros = pasajeros + cantidad;
        System.out.println(cantidad + " pasajeros abordaron.");
    }

    public void mostrarInformacion() {
        System.out.println("Aerolínea: " + aerolinea);
        System.out.println("Destino: " + destino);
        System.out.println("Pasajeros: " + pasajeros);
    }

    public static void main(String[] args) {
        Avion avion = new Avion();

        avion.aerolinea = "Avianca";
        avion.destino = "Bogotá";
        avion.pasajeros = 50;

        avion.abordar(20);

        avion.mostrarInformacion();
    }
}