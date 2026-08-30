package Ejercicio17;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Sebastian Tejedor";
        estudiante1.codigo = "7502610039";
        estudiante1.semestre = 2;

        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Santiago Tejedor";
        estudiante2.codigo = "7502610040";
        estudiante2.semestre = 1;

        System.out.println("Información del primer estudiante:");
        estudiante1.mostrarInfo();

        System.out.println("\nInformación del segundo estudiante:");
        estudiante2.mostrarInfo();

        // Cambiar semestre del primer estudiante
        System.out.println("\nActualizando semestre del primer estudiante...");
        estudiante1.CambiarSemestre(3);
    }
}
