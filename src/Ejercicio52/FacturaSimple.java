package Ejercicio52;

public class FacturaSimple {
    int numero;
    String cliente;
    double valor;

    public void aplicarDescuento() {
        valor = valor * 0.90;
    }

    public void mostrarFactura() {
        System.out.println("Número: " + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor: $" + valor);
    }

    public static void main(String[] args) {
        FacturaSimple factura = new FacturaSimple();

        factura.numero = 1001;
        factura.cliente = "Sebas";
        factura.valor = 100000;

        factura.aplicarDescuento();
        factura.mostrarFactura();
    }
}
