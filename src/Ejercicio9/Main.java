package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();

        mascota1.nombre = "Onix";
        mascota1.edad = 2;

        System.out.println("Edad inicial: " + mascota1.edad);

        mascota1.edad = 3;
        System.out.println("Nueva edad: " + mascota1.edad);

        mascota1.edad = 4;
        System.out.println("Nueva edad: " + mascota1.edad);
    }
}
