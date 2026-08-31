package Ejercicio38;
public class Ventilador {

    String marca;
    int velocidad;
    boolean encendido;

    void encender() {
        encendido = true;
    }

    void apagar() {
        encendido = false;
    }

    void subirVelocidad() {
        velocidad++;
    }
}