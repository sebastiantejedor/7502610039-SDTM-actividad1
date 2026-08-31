package Ejercicio38;

public class Main {
    public static void main(String[] args) {

        Ventilador ventilador = new Ventilador();

        ventilador.marca = "Oster";
        ventilador.velocidad = 1;

        ventilador.encender();

        System.out.println("Marca: " + ventilador.marca);
        System.out.println("Velocidad: " + ventilador.velocidad);
        System.out.println("Encendido: " + ventilador.encendido);

        ventilador.subirVelocidad();

        System.out.println("Velocidad después de subir: " + ventilador.velocidad);

        ventilador.apagar();

        System.out.println("Encendido después de apagar: " + ventilador.encendido);
    }
}