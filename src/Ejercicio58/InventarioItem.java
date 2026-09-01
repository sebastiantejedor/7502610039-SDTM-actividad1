package Ejercicio58;

public class InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;

    public double calcularValorTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Valor total: $" + calcularValorTotal());
    }

    public static void main(String[] args) {
        InventarioItem producto = new InventarioItem();

        producto.nombre = "Teclado";
        producto.cantidad = 5;
        producto.precioUnitario = 50000;

        producto.mostrarInformacion();
    }
}
