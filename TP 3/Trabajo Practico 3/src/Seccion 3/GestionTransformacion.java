// GestionTransformacion.java (Cubre Ejercicio 3.1 y 3.2)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */
import java.util.*;

public class GestionTransformacion {

    public void ejecutarMapeoYConversion() {
        List<String> textos = Arrays.asList("juan", "pedro", "maria");

        textos.stream()
            .map(t -> t.toUpperCase())
            .forEach(t -> System.out.println(t));
    }

    public void ejecutarAplanamiento() {
        List<List<Integer>> listaDeListas = Arrays.asList(
            Arrays.asList(1, 2),
            Arrays.asList(3, 4),
            Arrays.asList(5, 6)
        );

        listaDeListas.stream()
            .flatMap(lista -> lista.stream())
            .forEach(n -> System.out.println(n));
    }
}