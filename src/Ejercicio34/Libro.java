package Ejercicio34;

public class Libro {
    String titulo;
    String autor;
    int anioPublicacion;
    String genero;

    public Libro() {
    }

    // Constructor copia
    public Libro(Libro libro) {
        this.titulo = libro.titulo;
        this.autor = libro.autor;
        this.anioPublicacion = libro.anioPublicacion;
        this.genero = libro.genero;
    }

    void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Género: " + genero);
    }
}