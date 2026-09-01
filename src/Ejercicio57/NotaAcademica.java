package Ejercicio57;

public class NotaAcademica {
    String asignatura;
    double nota1;
    double nota2;
    double nota3;

    public double calcularDefinitiva() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void mostrarResultado() {
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Definitiva: " + calcularDefinitiva());
    }

    public static void main(String[] args) {
        NotaAcademica nota = new NotaAcademica();

        nota.asignatura = "Programación Orientada a Objetos";
        nota.nota1 = 4.0;
        nota.nota2 = 4.5;
        nota.nota3 = 4.8;

        nota.mostrarResultado();
    }
}
