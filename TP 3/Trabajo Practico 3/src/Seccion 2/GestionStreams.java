// GestionStreams.java (Cubre Ejercicio 2.1 y 2.2)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */
import java.util.stream.Stream;

public class GestionStreams {

    public void ejecutarCreacionYExtraccion() {
        long cantidad = Stream.of(2, 5, 3, 3, 6, 2, 4)
        .distinct()
        .skip(1)
        .limit(3)
        .count();

        System.out.println(cantidad);
    }

    public void ejecutarFiltradoYProcesamiento() {
        long cantidadFiltrada = Stream.of(1, 2, 3, 4, 5, 6)
        .filter(s -> s > 3)
        .peek(n -> System.out.println(n))
        .count();
    }
}