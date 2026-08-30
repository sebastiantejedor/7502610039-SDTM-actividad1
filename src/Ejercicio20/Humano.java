package Ejercicio20;
public class Humano {
    String nombre;
    int edad;

    void mostrarHumano() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    void comer() {
        System.out.println(nombre + " está comiendo.");
    }
}
