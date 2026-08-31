package Ejercicio42;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.nombre = "Programación";
        curso1.profesor = "Carlos";
        curso1.creditos = 4;

        Curso curso2 = new Curso();
        curso2.nombre = "Cálculo";
        curso2.profesor = "Atilano";
        curso2.creditos = 3;

        curso1.mostrarInformacion();
        System.out.println();

        curso2.mostrarInformacion();
    }
}

class Curso {

    String nombre;
    String profesor;
    int creditos;

    void mostrarInformacion() {
        System.out.println("Curso: " + nombre);
        System.out.println("Profesor: " + profesor);
        System.out.println("Créditos: " + creditos);
    }
}

/*
Ambos objetos pertenecen a la misma clase porque fueron creados a
partir de la clase Curso, que funciona como una plantilla.
Aunque tienen datos diferentes, los dos tienen las mismas
características definidas por la clase, como nombre, profesor y créditos.
Por eso curso1 y curso2 son objetos diferentes, pero pertenecen al mismo tipo Curso.
 */