package Ejercicio16;
public class Producto {
    String nombre;
    double precio;
    int cantidad;

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
    }

    void vender(int cantidadVendida) {
        if (cantidadVendida <= cantidad) {
            cantidad -= cantidadVendida;
            System.out.println("Venta realizada correctamente.");
            System.out.println("Nueva cantidad en inventario: " + cantidad);
        } else {
            System.out.println("Stock insuficiente.");
        }
    }

    void reabastecer(int cantidadReabastecida) {
        cantidad += cantidadReabastecida;
        System.out.println("Reabastecimiento realizado correctamente.");
        System.out.println("Nueva cantidad en inventario: " + cantidad);
    }
}
