package Ejercicio49;

public class Persona {
    String nombre;


    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.nombre = "Sebas";
        persona2.nombre = persona1.nombre;

        System.out.println(persona2.nombre);
    }
}

/*
Ejemplo errado

public class Persona {
    String nombre;
}

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.nombre = "Sebas";
        persona2.nombre = persona.nombre;
    }
}
 */