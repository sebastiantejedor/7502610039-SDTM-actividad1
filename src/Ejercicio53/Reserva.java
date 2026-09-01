package Ejercicio53;

public class Reserva {
    String nombreCliente;
    String fecha;
    boolean activa;

    public void confirmar() {
        activa = true;
        System.out.println("Reserva confirmada.");
    }

    public void cancelar() {
        activa = false;
        System.out.println("Reserva cancelada.");
    }

    public void mostrarReserva() {
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Activa: " + activa);
    }

    public static void main(String[] args) {
        Reserva reserva = new Reserva();

        reserva.nombreCliente = "Sebastian Tejedor";
        reserva.fecha = "31/09/2026";

        reserva.confirmar();
        reserva.mostrarReserva();

        reserva.cancelar();
    }
}