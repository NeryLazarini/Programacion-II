// Persona.java (Necesario para Ejercicio 4.4)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */
public class Persona {
    private String dni;
    private String nombre;

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
}


