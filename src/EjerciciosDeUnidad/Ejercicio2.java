package EjerciciosDeUnidad;
public class Ejercicio2 {
    public static class Main {
        static void main(String[] args) {
            IO.println("Ejercicio 2: Programacion Orientada a Objetos");

            Vehiculo vehiculo1 = new Vehiculo();
            vehiculo1.marca = "Lamborghini";
            vehiculo1.Modelo = "Aventador SVJ";
            vehiculo1.VelocidadActual = "350 km/h";
            vehiculo1.printVehiculoInfo();
        }
    }
    public static class Vehiculo {
        String marca;
        String Modelo;
        String VelocidadActual;

        void printVehiculoInfo() {
            IO.println("Marca: " + marca);
            IO.println("Modelo: " + Modelo);
            IO.println("Velocidad Actual: " + VelocidadActual);
         }
    }
}
