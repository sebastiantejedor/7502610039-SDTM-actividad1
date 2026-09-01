package Ejercicio70;

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

    public static void main(String[] args) {
        Celular celular1 = new Celular();
        celular1.marca = "Xiaomi";
        celular1.modelo = "12 Lite";
        celular1.almacenamiento = 128;
        celular1.bateria = 80;

        Celular celular2 = new Celular();
        celular2.marca = "Samsung";
        celular2.modelo = "Galaxy A55";
        celular2.almacenamiento = 256;
        celular2.bateria = 90;

        Celular celular3 = new Celular();
        celular3.marca = "Apple";
        celular3.modelo = "iPhone 15";
        celular3.almacenamiento = 128;
        celular3.bateria = 75;

        Celular celular4 = new Celular();
        celular4.marca = "Motorola";
        celular4.modelo = "Edge 50";
        celular4.almacenamiento = 256;
        celular4.bateria = 60;

        Celular celular5 = new Celular();
        celular5.marca = "Honor";
        celular5.modelo = "X8b";
        celular5.almacenamiento = 256;
        celular5.bateria = 85;
    }
}
