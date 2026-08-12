package Ejercicio1;
public class Estudiante {
    String name;
    Long code;
    String semester;

    void MostrarInfo() {
        IO.println("Nombre: " + name);
        IO.println("Semestre: " + semester);
        IO.println("Código: " + code);
    }
}
