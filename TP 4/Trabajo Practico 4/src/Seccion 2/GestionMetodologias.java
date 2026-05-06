// GestionMetodologias.java (Cubre Ejercicio 2.1 y 2.2)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */
public class GestionMetodologias {

    public void registrarUsuario(String nombre, int edad) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o estar en blanco.");
        }

        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
    }

    public void simularRegistro() {
        try {
            registrarUsuario("Juan", -5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}