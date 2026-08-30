package Ejercicio33;

public class Libro {
    String titulo;
    String autor;
    int anioPublicacion;
    String genero;

    public Libro(Libro libro1) {
        this.titulo = libro1.titulo;
        this.autor = libro1.autor;
        this.anioPublicacion = libro1.anioPublicacion;
        this.genero = libro1.genero;
    }

    public Libro() {
    }

    void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Género: " + genero);
    }
}
