package Ejercicio16;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.nombre = "Camiseta";
        producto.precio = 29.99;
        producto.cantidad = 50;

        producto.mostrarInformacion();

        producto.vender(10);
        producto.reabastecer(20);
    }
}
