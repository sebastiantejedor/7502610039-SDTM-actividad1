package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Sebastian Tejedor";
        estudiante1.codigo = "7502610039";
        estudiante1.semestre = 2;

        System.out.println("Información del primer estudiante:");
        estudiante1.mostrarInfo();
    }
}
