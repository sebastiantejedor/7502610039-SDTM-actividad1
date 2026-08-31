package Ejercicio44;

public class Main {
    public static void main(String[] args) {

        Paciente paciente = new Paciente();

        paciente.nombre = "Juan";
        paciente.edad = 25;
        paciente.documento = "123456789";

        paciente.mostrarInformacion();
    }
}

class Paciente {
    String nombre;
    int edad;
    String documento;

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Documento: " + documento);
    }
}

/*
“Crear un paciente” se refiere a representar en el programa una persona
que existe como paciente, con sus propios datos y características.
En cambio, “instanciar la clase Paciente” es el proceso técnico de crear
un objeto en Java usando new. Las dos ideas están relacionadas porque al
instanciar la clase obtenemos un objeto que representa a un paciente,
pero no significan exactamente lo mismo: una es la idea que queremos
representar y la otra es la forma de llevar esa idea al código.
 */