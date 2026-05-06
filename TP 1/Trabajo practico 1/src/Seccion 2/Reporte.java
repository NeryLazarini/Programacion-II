// Reporte.java (Cubre Ejercicio 2.1 y 2.3)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */

public class Reporte {

    public void generarEncabezado() {
        System.out.println("REPORTE");
    }

    public String obtenerCuerpo() {
        return "Este es el contenido del reporte.";
    }

    public void procesarSecciones(String... secciones) {
        for (String seccion : secciones) {
            System.out.println(seccion);
        }
    }
}


