package Ejercicio22;

public class Libro {
    String titulo;
    String autor;
    int anioPublicacion;
    String genero;

    void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Género: " + genero);
    }
}
