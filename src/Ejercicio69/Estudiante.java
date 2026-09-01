package Ejercicio69;

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

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Sebastian Tejedor";
        estudiante1.codigo = "001";
        estudiante1.carrera = "Ingeniería de Software";
        estudiante1.semestre = 2;
        estudiante1.promedio = 4.2;

        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Samuel Piñeros";
        estudiante2.codigo = "002";
        estudiante2.carrera = "Ingeniería de Software";
        estudiante2.semestre = 2;
        estudiante2.promedio = 4.6;

        Estudiante estudiante3 = new Estudiante();
        estudiante3.nombre = "Yulieth Herrera";
        estudiante3.codigo = "003";
        estudiante3.carrera = "Ingeniería de Software";
        estudiante3.semestre = 2;
        estudiante3.promedio = 4.5;

        Estudiante estudiante4 = new Estudiante();
        estudiante4.nombre = "Maria Fernanda Vasquez";
        estudiante4.codigo = "004";
        estudiante4.carrera = "Ingeniería de Software";
        estudiante4.semestre = 2;
        estudiante4.promedio = 4.6;

        Estudiante estudiante5 = new Estudiante();
        estudiante5.nombre = "Esteban Ruiz";
        estudiante5.codigo = "005";
        estudiante5.carrera = "Ingeniería de Software";
        estudiante5.semestre = 2;
        estudiante5.promedio = 4.4;

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();
        estudiante4.mostrarInformacion();
        estudiante5.mostrarInformacion();
    }
}
