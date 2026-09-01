package Ejercicio48;

public class Persona {
    String nombre;

    public void cambiarNombre() {
        this.nombre = "Sebas";
    }

    public void mostrarNombre() {
        System.out.println(this.nombre);
    }
}

/*
Codigo Errado

public class Persona {
    String nombre;

    public void cambiarNombre() {
        String nombre;
        nombre = "Sebas";
    }

    public void mostrarNombre() {
        System.out.println(nombre);
    }
}
 */