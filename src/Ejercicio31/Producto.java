package Ejercicio31;

public class Producto {
    public String nombre;
    public double precio;
    public int cantidad;

    public Producto() {
    }

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
    }
    public static Producto crearProductoBasico() {
        return new Producto("Producto Básico", 10.0, 1);
    }
}
