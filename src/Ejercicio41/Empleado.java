package Ejercicio41;

public class Empleado {
    String nombre;
    String cargo;
    double salario;

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
    }
}

/*
Es mejor modelar un empleado mediante una clase y objetos porque
permite reunir en un solo lugar sus características y comportamientos.
En lugar de tener muchas variables sueltas, la clase Empleado funciona
como una plantilla que permite crear diferentes empleados con sus propios datos.
Esto hace que el código sea más organizado, fácil de entender y reutilizable.
 */
