// Usuario.java (Cubre Ejercicio 2.2)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */

public class Usuario {

    private String nombre;
    private int edad;
    private String correo;
    private int telefono;

    public Usuario() {
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void actualizarPerfil(String correo) {
        this.correo = correo;
    }

    public void actualizarPerfil(String correo, int telefono) {
        this.correo = correo;
        this.telefono = telefono;
    }
}