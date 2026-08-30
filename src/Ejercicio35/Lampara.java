package Ejercicio35;

public class Lampara {
    String marca;
    boolean encendida;

    void encender(){
        encendida = true;
    }

    void apagar(){
        encendida = false;
    }

    void mostrarEstado(){
        System.out.println("Marca:" + marca);
        if(encendida){
            System.out.println("Estado: Encendida");
        }else {
            System.out.println("Estado: Apagada");
        }
    }
}


