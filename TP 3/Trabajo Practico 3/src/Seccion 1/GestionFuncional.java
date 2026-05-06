// GestionFuncional.java (Cubre Ejercicio 1.1, 1.2 y 1.3)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */
import java.util.*;
import java.util.function.*;

public class GestionFuncional {

    public void ejecutarInterfacesBase() {
        Predicate<Integer> esPar = numero -> numero % 2 == 0;
        System.out.println(esPar.test(4));

        Function<String, Integer> longitudTexto = texto -> texto.length();
        System.out.println(longitudTexto.apply("Java"));

        Consumer<Integer> imprimirNumero = numero -> System.out.println(numero);
        imprimirNumero.accept(10);

        Supplier<Double> numeroAleatorio = () -> Math.random();
        System.out.println(numeroAleatorio.get());
    }

    public void ordenarConComparator() {
        List<String> textos = new ArrayList<>();
        textos.add("Programación");
        textos.add("Web");
        textos.add("Java");
        textos.add("Stream");

        textos.sort((a, b) -> a.length() - b.length());
    }

    public void ejecutarVariantesPrimitivas() {
        ToIntFunction<String> longitudPrimitiva = texto -> texto.length();
        System.out.println(longitudPrimitiva.applyAsInt("Funcional"));

        IntPredicate esParPrimitivo = numero -> numero % 2 == 0;
        System.out.println(esParPrimitivo.test(8));
    }
}