package Ejercicio59;

public class UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;

    public void activar() {
        activo = true;
        System.out.println("Usuario activado.");
    }

    public void desactivar() {
        activo = false;
        System.out.println("Usuario desactivado.");
    }

    public void mostrarUsuario() {
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Activo: " + activo);
    }

    public static void main(String[] args) {
        UsuarioSistema usuario = new UsuarioSistema();

        usuario.nombreUsuario = "Sebas";
        usuario.clave = "12345";

        usuario.activar();
        usuario.mostrarUsuario();

        usuario.desactivar();
        usuario.mostrarUsuario();
    }
}
