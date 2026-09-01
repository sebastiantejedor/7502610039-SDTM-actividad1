package Ejercicio73;

public class Rectangulo {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(Rectangulo otro) {
        this.base = otro.base;
        this.altura = otro.altura;
    }

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
        Rectangulo rectangulo1 = new Rectangulo(10, 5);
        rectangulo1.mostrarResultados();

        Rectangulo rectangulo2 = new Rectangulo(rectangulo1);
        rectangulo2.mostrarResultados();
    }
}