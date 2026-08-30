package Ejercicio34;

public class Main {
    public static void main(String[] args) {

        // Creamos el libro original
        Libro libroOriginal = new Libro();

        libroOriginal.titulo = "Cien años de soledad";
        libroOriginal.autor = "Gabriel García Márquez";
        libroOriginal.anioPublicacion = 1967;
        libroOriginal.genero = "Realismo mágico";

        // Creamos una copia del libro original
        Libro libroCopia = new Libro(libroOriginal);

        System.out.println("Libro original:");
        libroOriginal.mostrarInformacion();

        System.out.println("\nLibro copia:");
        libroCopia.mostrarInformacion();
    }
}