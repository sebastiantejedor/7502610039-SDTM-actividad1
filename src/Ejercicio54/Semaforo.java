package Ejercicio54;

public class Semaforo {
    String colorActual;

    public void cambiarColor() {
        if (colorActual.equals("rojo")) {
            colorActual = "verde";
        } else if (colorActual.equals("verde")) {
            colorActual = "amarillo";
        } else {
            colorActual = "rojo";
        }
    }

    public void mostrarColor() {
        System.out.println("Color actual: " + colorActual);
    }

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        semaforo.colorActual = "rojo";

        semaforo.mostrarColor();

        semaforo.cambiarColor();
        semaforo.mostrarColor();

        semaforo.cambiarColor();
        semaforo.mostrarColor();

        semaforo.cambiarColor();
        semaforo.mostrarColor();
    }
}
