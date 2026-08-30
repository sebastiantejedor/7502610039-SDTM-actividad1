package Ejercicio22;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Libro libro4 = new Libro();

        libro1.titulo = "Cien años de soledad";
        libro1.autor = "Gabriel García Márquez";
        libro1.anioPublicacion = 1967;
        libro1.genero = "Realismo mágico";

        libro2.titulo = "1984";
        libro2.autor = "George Orwell";
        libro2.anioPublicacion = 1949;
        libro2.genero = "Distopía";

        libro3.titulo = "El Principito";
        libro3.autor = "Antoine de Saint-Exupéry";
        libro3.anioPublicacion = 1943;
        libro3.genero = "Fábula";

        libro4.titulo = "Matar a un ruiseñor";
        libro4.autor = "Harper Lee";
        libro4.anioPublicacion = 1960;
        libro4.genero = "Novela";


        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();
        libro4.mostrarInformacion();

    }
}
/*
    La clase Libro funciona como una plantilla porque define las características
     que todos los libros pueden tener, como título, autor, año de publicación y
     género. Los cuatro objetos son casos concretos porque cada uno utiliza esa
     plantilla, pero tiene sus propios datos y representa un libro diferente.
 */