package Ejercicio21;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();

        estudiante1.nombre = "Sebastian";
        estudiante1.edad = 17;
        estudiante1.carrera = "Ingeniería de Software";
        estudiante1.semestre = 2;

        estudiante2.nombre = "Kevin";
        estudiante2.edad = 20;
        estudiante2.carrera = "Ingeniería de Software";
        estudiante2.semestre = 5;

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();

    }
}
