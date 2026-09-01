package Ejercicio69;

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

    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.nombre = "Laptop";
        producto1.codigo = "001";
        producto1.precio = 1500.00;
        producto1.cantidad = 10;
        producto1.categoria = "Electrónica";

        Producto producto2 = new Producto();
        producto2.nombre = "Smartphone";
        producto2.codigo = "002";
        producto2.precio = 800.00;
        producto2.cantidad = 20;
        producto2.categoria = "Electrónica";

        Producto producto3 = new Producto();
        producto3.nombre = "Tablet";
        producto3.codigo = "003";
        producto3.precio = 600.00;
        producto3.cantidad = 15;
        producto3.categoria = "Electrónica";

        Producto producto4 = new Producto();
        producto4.nombre = "Auriculares";
        producto4.codigo = "004";
        producto4.precio = 100.00;
        producto4.cantidad = 30;
        producto4.categoria = "Accesorios";

        Producto producto5 = new Producto();
        producto5.nombre = "Cámara";
        producto5.codigo = "005";
        producto5.precio = 1200.00;
        producto5.cantidad = 5;
        producto5.categoria = "Fotografía";
    }
}
