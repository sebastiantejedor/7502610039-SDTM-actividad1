package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.nombre = "Laptop";
        producto1.precio = 1200.50;
        producto1.stock = 10;

        Producto producto2 = new Producto();
        producto2.nombre = "Smartphone";
        producto2.precio = 800.00;
        producto2.stock = 25;

        Producto producto3 = new Producto();
        producto3.nombre = "Tablet";
        producto3.precio = 500.00;
        producto3.stock = 15;

        System.out.println("Información del primer producto:");
        producto1.mostrarInformacion();

        System.out.println("\nInformación del segundo producto:");
        producto2.mostrarInformacion();
        System.out.println("\nInformación del tercer producto:");
        producto3.mostrarInformacion();
    }
}
