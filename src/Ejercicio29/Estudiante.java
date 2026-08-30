package Ejercicio29;

public class Estudiante {
    String nombre;
    int codigo;
    String carrera;
    int semestre;

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }

    Estudiante() {
    }

    Estudiante(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    Estudiante(String nombre, int codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = "Desconocida";
        this.semestre = semestre;
    }
}
