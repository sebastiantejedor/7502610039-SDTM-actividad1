package Ejercicio19;

// Clase Estudiante
// La clase es un molde para crear objetos que representan estudiantes. Contiene atributos como nombre, edad y carrera, y un metodo para mostrar la información del estudiante.
public class Estudiante {
    String nombre;
    int edad;
    String carrera;

    void mostrarEstudiante() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }
}
