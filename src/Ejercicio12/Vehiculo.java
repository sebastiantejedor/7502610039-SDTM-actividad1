package Ejercicio12;

public class Vehiculo {
    int velocidad;

    public void frenar() {
        velocidad -= 10;

        if (velocidad < 0) {
            velocidad = 0;
        }
    }
}
