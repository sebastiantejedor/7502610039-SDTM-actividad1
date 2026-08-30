package Ejercicio30;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Sebastian Tejedor", 75026100);
        Estudiante estudiante2 = new Estudiante("Santiago Tejedor", 75026140, 1);
        Estudiante estudiante3 = new Estudiante();
        estudiante3.nombre = "Maria Gomez";
        estudiante3.codigo = 75026160;
        estudiante3.semestre = 2;

        System.out.println("Información del primer estudiante:");
        estudiante1.mostrarInformacion();

        System.out.println("\nInformación del segundo estudiante:");
        estudiante2.mostrarInformacion();

        System.out.println("\nInformación del tercer estudiante:");
        estudiante3.mostrarInformacion();
    }
}
