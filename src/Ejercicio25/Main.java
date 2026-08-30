package Ejercicio25;

public class Main {

    public static void main(String[] args) {

        Motocicleta moto1 = new Motocicleta("Kawasaki", "Ninja 400", 399);
        moto1.mostrarInformacion();

        Motocicleta moto2 = new Motocicleta();
        moto2.marca = "Yamaha";
        moto2.modelo = "MT-07";
        moto2.cilindrada = 689;
        moto2.mostrarInformacion();
    }
}
