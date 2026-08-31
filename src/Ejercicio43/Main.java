package Ejercicio43;

public class Main {
    public static void main(String[] args) {

        Computador computador = new Computador();

        computador.marca = "Lenovo";
        computador.procesador = "Intel Core i5";
        computador.ram = 16;

        computador.mostrarInformacion();
    }
}

class Computador {

    String marca;
    String procesador;
    int ram;

    void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Procesador: " + procesador);
        System.out.println("RAM: " + ram + " GB");
    }
}

/*
La clase Computador representa el plano conceptual, porque define qué
características puede tener un computador, como marca, procesador y
memoria RAM, pero no representa una máquina específica.
El objeto computador es una máquina concreta creada a partir de ese plano,
ya que tiene valores específicos para cada característica.
En otras palabras, la clase es el diseño y el objeto es un computador real basado en ese diseño.
 */