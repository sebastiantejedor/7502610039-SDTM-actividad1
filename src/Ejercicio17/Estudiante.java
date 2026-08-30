package Ejercicio17;

public class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
    }

    void CambiarSemestre(int nuevoSemestre) {
        semestre = nuevoSemestre;
        System.out.println("Semestre actualizado a: " + semestre);
    }
}
