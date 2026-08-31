package Ejercicio37;

public class Celular {

    String marca;
    int bateria;
    boolean prendido;

    void encender() {
        prendido = true;
    }

    void apagar() {
        prendido = false;
    }

    void cargarBateria() {
        bateria = 100;
    }
}