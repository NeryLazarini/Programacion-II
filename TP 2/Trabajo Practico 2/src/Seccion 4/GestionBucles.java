// GestionBucles.java (Cubre Ejercicio 4.1 y 4.2)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */
import java.util.*;

public class GestionBucles {

    public void gestionarIterator() {
        ArrayList<String> productos = new ArrayList<>();

        productos.add("Teclado");
        productos.add("Mouse");
        productos.add("Monitor");

        Iterator<String> iterador = productos.iterator();

        while (iterador.hasNext()) {
            String producto = iterador.next();
            System.out.println(producto);
        }
    }

    public void gestionarForEach() {
        ArrayList<Integer> notas = new ArrayList<>();

        notas.add(8);
        notas.add(4);
        notas.add(10);
        notas.add(7);

        for (Integer nota : notas) {
            System.out.println(nota);
        }
    }
}