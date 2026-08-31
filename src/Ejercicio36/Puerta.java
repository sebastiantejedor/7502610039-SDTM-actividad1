package Ejercicio36;

public class Puerta {

    String material;
    boolean abierta;

    void abrir() {
        abierta = true;
    }

    void cerrar() {
        abierta = false;
    }

    void mostrarEstado() {
        System.out.println("Material: " + material);

        if (abierta) {
            System.out.println("Estado: Abierta");
        } else {
            System.out.println("Estado: Cerrada");
        }
    }
}