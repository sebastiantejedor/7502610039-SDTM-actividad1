package Ejercicio51;

public class Rectangulo {
    double base;
    double altura;

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void mostrarResultados() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();

        rectangulo.base = 10;
        rectangulo.altura = 5;

        rectangulo.mostrarResultados();
    }
}