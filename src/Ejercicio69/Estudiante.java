package Ejercicio69;

public class Estudiante {
    String nombre;
    String codigo;
    String carrera;
    int semestre;
    double promedio;

    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    public void presentarExamen() {
        System.out.println(nombre + " está presentando un examen.");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Sebastian Tejedor";
        estudiante1.codigo = "001";
        estudiante1.carrera = "Ingeniería de Software";
        estudiante1.semestre = 2;
        estudiante1.promedio = 4.2;

        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Samuel Piñeros";
        estudiante2.codigo = "002";
        estudiante2.carrera = "Ingeniería de Software";
        estudiante2.semestre = 2;
        estudiante2.promedio = 4.6;

        Estudiante estudiante3 = new Estudiante();
        estudiante3.nombre = "Yulieth Herrera";
        estudiante3.codigo = "003";
        estudiante3.carrera = "Ingeniería de Software";
        estudiante3.semestre = 2;
        estudiante3.promedio = 4.5;

        Estudiante estudiante4 = new Estudiante();
        estudiante4.nombre = "Maria Fernanda Vasquez";
        estudiante4.codigo = "004";
        estudiante4.carrera = "Ingeniería de Software";
        estudiante4.semestre = 2;
        estudiante4.promedio = 4.6;

        Estudiante estudiante5 = new Estudiante();
        estudiante5.nombre = "Esteban Ruiz";
        estudiante5.codigo = "005";
        estudiante5.carrera = "Ingeniería de Software";
        estudiante5.semestre = 2;
        estudiante5.promedio = 4.4;

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();
        estudiante4.mostrarInformacion();
        estudiante5.mostrarInformacion();
    }

    public static class Celular {
        String marca;
        String modelo;
        int almacenamiento;
        int bateria;
        boolean encendido;

        public void encender() {
            encendido = true;
            System.out.println("El celular está encendido.");
        }

        public void apagar() {
            encendido = false;
            System.out.println("El celular está apagado.");
        }

        public void cargar() {
            bateria = 100;
            System.out.println("El celular está cargado.");
        }

        public void mostrarInformacion() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Almacenamiento: " + almacenamiento + " GB");
            System.out.println("Batería: " + bateria + "%");
        }

        public static void main(String[] args) {
            Celular celular1 = new Celular();
            celular1.marca = "Xiaomi";
            celular1.modelo = "12 Lite";
            celular1.almacenamiento = 128;
            celular1.bateria = 80;

            Celular celular2 = new Celular();
            celular2.marca = "Samsung";
            celular2.modelo = "Galaxy A55";
            celular2.almacenamiento = 256;
            celular2.bateria = 90;

            Celular celular3 = new Celular();
            celular3.marca = "Apple";
            celular3.modelo = "iPhone 15";
            celular3.almacenamiento = 128;
            celular3.bateria = 75;

            Celular celular4 = new Celular();
            celular4.marca = "Motorola";
            celular4.modelo = "Edge 50";
            celular4.almacenamiento = 256;
            celular4.bateria = 60;

            Celular celular5 = new Celular();
            celular5.marca = "Honor";
            celular5.modelo = "X8b";
            celular5.almacenamiento = 256;
            celular5.bateria = 85;
        }
    }
}
