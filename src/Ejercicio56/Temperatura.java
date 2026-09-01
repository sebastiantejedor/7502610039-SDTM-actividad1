package Ejercicio56;

public class Temperatura {
    double valorCelsius;

    public double convertirAFahrenheit() {
        return (valorCelsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura();

        temperatura.valorCelsius = 30;

        System.out.println("Celsius: " + temperatura.valorCelsius);
        System.out.println("Fahrenheit: " + temperatura.convertirAFahrenheit());
    }
}
