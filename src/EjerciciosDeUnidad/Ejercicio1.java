package EjerciciosDeUnidad;
public class Ejercicio1 {
    public static class Main {
        public static void main(String[] args) {
            IO.println("Unidad 1 Programacion Orientada a Objetos!");

            Student student1 = new Student();
            student1.name = "Sebastian David tejedor";
            student1.code = 7502610039L;
            student1.semester = "2026-2 (2do semestre)";
            student1.printStudentInfo();
    }

    public static class Student {
        String name;
        Long code;
        String semester;

        void printStudentInfo() {
            IO.println("Name: " + name);
            IO.println("Semester: " + semester);
            IO.println("Code: " + code);
         }
        }
    }
}

