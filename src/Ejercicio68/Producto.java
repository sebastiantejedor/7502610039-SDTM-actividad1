package Ejercicio68;

public class Producto {
    String nombre;
    String codigo;
    double precio;
    int cantidad;
    String categoria;

    public void vender(int unidades) {
        cantidad = cantidad - unidades;
        System.out.println("Se vendieron " + unidades + " unidades.");
    }

    public void agregarStock(int unidades) {
        cantidad = cantidad + unidades;
        System.out.println("Se agregaron " + unidades + " unidades.");
    }

    public double calcularValorTotal() {
        return precio * cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Categoría: " + categoria);
    }
}
