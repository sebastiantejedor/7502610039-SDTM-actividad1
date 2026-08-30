package Ejercicio20;

public class Main {
    public static void main(String[] args) {
        Humano humano1 = new Humano();
        Humano humano2 = new Humano();
        Humano humano3 = new Humano();

        humano1.nombre = "Sebastian";
        humano1.edad = 17;
        humano1.dormir();
        humano1.comer();
        humano1.mostrarHumano();

        humano2.nombre = "Dayana";
        humano2.edad = 38;
        humano2.dormir();
        humano2.comer();
        humano2.mostrarHumano();

        humano3.nombre = "Alvaro";
        humano3.edad = 40;
        humano3.dormir();
        humano3.comer();
        humano3.mostrarHumano();
    }
}

/*
    Estos 3 objetos se diferencian principalmente en sus atributos,
    ya que cada uno tiene un nombre y una edad diferente.
    Además, al llamar a los métodos dormir() y comer(), cada objeto realiza estas acciones de manera independiente,
    mostrando mensajes específicos para cada humano. Por lo tanto,
    aunque los objetos son instancias de la misma clase Humano, sus estados y comportamientos pueden variar según los valores asignados a sus atributos.
 */
