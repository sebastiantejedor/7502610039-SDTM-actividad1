package Ejercicio55;

public class Reloj {
    int hora;
    int minuto;
    int segundo;

    public void mostrarHora() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    public static void main(String[] args) {
        Reloj reloj = new Reloj();

        reloj.hora = 10;
        reloj.minuto = 30;
        reloj.segundo = 45;

        reloj.mostrarHora();
    }
}
