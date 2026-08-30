package Ejercicio33;

public class Main {
    public static void main(String[] args) {

        // Crear el libro original
        Libro libro1 = new Libro();

        libro1.titulo = "Cien años de soledad";
        libro1.autor = "Gabriel García Márquez";
        libro1.anioPublicacion = 1967;
        libro1.genero = "Realismo mágico";

        // Crear una copia de libro1
        Libro libro2 = new Libro(libro1);

        libro2.mostrarInformacion();
    }
}
