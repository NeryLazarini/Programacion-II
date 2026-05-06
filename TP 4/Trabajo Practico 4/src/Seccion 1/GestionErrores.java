// GestionErrores.java (Cubre Ejercicio 1.1, 1.2 y 1.3)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */
public class GestionErrores {

    public void ejecutarConversion() {
        try {
            int numero = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getName());
        }
    }

    public void ejecutarDivision() {
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Limpieza final");
        }
    }

    public void ejecutarMultiCatch(String entrada) {
        try {
            int numero = Integer.parseInt(entrada);
            int resultado = 100 / numero;
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error de cálculo o conversión");
        }
    }
}