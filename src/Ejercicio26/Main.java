package Ejercicio26;

public class Main {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1200.50, 10);
        producto1.mostrarInformacion();

        Producto producto2 = new Producto();
        producto2.nombre = "Smartphone";
        producto2.precio = 800.00;
        producto2.cantidad = 20;
        producto2.mostrarInformacion();
    }
}
