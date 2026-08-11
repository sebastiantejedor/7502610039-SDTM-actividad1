package EjerciciosDeUnidad;

public class Ejercicio2 {
    public static class Main {
        public static void main(String[] args) {
            IO.println("Ejercicio 2: Programacion Orientada a Objetos");

            Vehiculo vehiculo1 = new Vehiculo();
            vehiculo1.marca = "Toyota";
            vehiculo1.Modelo = "Corolla";
            vehiculo1.VelocidadActual = "120 km/h";
            vehiculo1.printVehiculoInfo();
        }
    }
    public static class Vehiculo {
        String marca;
        String Modelo;
        String VelocidadActual;

        void printVehiculoInfo() {
            IO.println("Name: " + marca);
            IO.println("Modelo: " + Modelo);
            IO.println("Velocidad Actual: " + VelocidadActual);
         }
    }
}
