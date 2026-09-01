package Ejercicio47;

public class Persona {
    String nombre;

    public void saludar() {
        System.out.println("Hola " + nombre);
    }

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.nombre = "Sebas";
        persona.saludar();
    }
}

/*
Ejemplo errado

public class Persona {
    String nombre;

    public void saludar() {
        System.out.println("Hola " + nombre);
    }

    public static void main(String[] args) {
        Persona persona;

        persona.nombre = "Sebas";
        persona.saludar();
    }
}
 */