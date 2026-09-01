package Ejercicio66;

public class Estudiante {
    String nombre;
    String codigo;
    String carrera;
    int semestre;
    double promedio;

    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    public void presentarExamen() {
        System.out.println(nombre + " está presentando un examen.");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
    }
}
