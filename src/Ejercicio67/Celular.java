package Ejercicio67;

public class Celular {
    String marca;
    String modelo;
    int almacenamiento;
    int bateria;
    boolean encendido;

    public void encender() {
        encendido = true;
        System.out.println("El celular está encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("El celular está apagado.");
    }

    public void cargar() {
        bateria = 100;
        System.out.println("El celular está cargado.");
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("Batería: " + bateria + "%");
    }
}
