
// GestionStreamsAvanzado.java (Cubre Sección 3 y Sección 4)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */
import java.util.*;
import java.util.stream.*;

public class GestionStreamsAvanzado {

    public void ejecutarSeccion3() {
        // Ejercicio 3.1
        Stream.of("Juan", "Maria", "Ana")
            .map(s -> s.toUpperCase());

        // Ejercicio 3.2
        int sumaLetras = Stream.of("Juan", "Maria", "Ana")
            .mapToInt(s -> s.length())
            .sum();

        // Ejercicio 3.3
        List<List<String>> datos = Arrays.asList(
            Arrays.asList("Juan", "Maria"),
            Arrays.asList("Ana", "Pedro")
        );
        long totalMasDe4 = datos.stream()
                                .flatMap(l -> l.stream())
                                .filter(s -> s.length() > 4)
                                .count();

        // Ejercicio 3.4
        Stream.of("Juan", "Maria", "Ana")
            .sorted()
            .forEach(s -> System.out.println(s));

        Stream.of("Juan", "Maria", "Ana")
            .sorted((a, b) -> a.length() - b.length())
            .forEach(s -> System.out.println(s));
    }

    public void ejecutarSeccion4() {
        // Ejercicio 4.1
        boolean algunoMayor5 = Stream.of(2, 5, 7, 3, 6, 2, 3).anyMatch(n -> n > 5);
        boolean todosMayor5 = Stream.of(2, 5, 7, 3, 6, 2, 3).allMatch(n -> n > 5);
        boolean ningunoMayor5 = Stream.of(2, 5, 7, 3, 6, 2, 3).noneMatch(n -> n > 5);

        // Ejercicio 4.2
        Optional<Integer> primerPar = Stream.of(1, 2, 3, 4, 5)
                                            .filter(n -> n % 2 == 0)
                                            .findFirst();
        if (primerPar.isPresent()) {
            Integer valor = primerPar.get();
        }

        // Ejercicio 4.3
        Optional<Integer> sumaTotal = Stream.of(1, 2, 3, 4, 5)
                                            .reduce((a, b) -> a + b);
        if (sumaTotal.isPresent()) {
            Integer total = sumaTotal.get();
        }

        // Ejercicio 4.4
        List<Integer> listaLimpia = Stream.of(1, 2, 2, 3, 4, 4)
            .distinct()
            .collect(Collectors.toList());

        List<Persona> personas = Arrays.asList(
            new Persona("123", "Juan"),
            new Persona("456", "Maria")
        );
        Map<String, String> mapaPersonas = personas.stream()
            .collect(Collectors.toMap(p -> p.getDni(), p -> p.getNombre()));
    }
}