package Ejercicio25;

public class Motocicleta {

    public String marca;
    public String modelo;
    public int  cilindrada;

    public Motocicleta() {
    }
    public Motocicleta(String marca, String modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
