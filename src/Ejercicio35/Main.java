package Ejercicio35;

public class Main {
    public static void main(String[] args) {

        Lampara lampara = new Lampara();

        lampara.marca = "Philips";
        lampara.encendida = true;
        lampara.mostrarEstado();

        lampara.apagar();
        lampara.mostrarEstado();
    }
}