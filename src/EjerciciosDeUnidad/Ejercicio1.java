package EjerciciosDeUnidad;
public class Ejercicio1 {
    public static class Main {
        static void main(String[] args) {
            IO.println("Ejercicio 1: Programacion Orientada a Objetos");

            Estudiante estudiante1 = new Estudiante();
            estudiante1.name = "Sebastian David tejedor";
            estudiante1.code = 7502610039L;
            estudiante1.semester = "2026-2 (2do semestre)";
            estudiante1.MostrarInfo();
    }

    public static class Estudiante {
        String name;
        Long code;
        String semester;

        void MostrarInfo() {
            IO.println("Nombre: " + name);
            IO.println("Semestre: " + semester);
            IO.println("Código: " + code);
         }
        }
    }
}

