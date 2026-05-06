// GestionListas.java (Cubre Ejercicio 2.1 y 2.2)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GestionListas {

    public void gestionarArrayList() {
        ArrayList<String> elementos = new ArrayList<>();

        elementos.add("Elemento 1");
        elementos.add("Elemento 2");
        elementos.add("Elemento 3");

        elementos.set(1, "Elemento 2 Actualizado");

        String primerValor = elementos.get(0);
        System.out.println(primerValor);

        elementos.remove(elementos.size() - 1);
    }

    public void gestionarListasMutables() {
        List<String> listaInmutable = List.of("A", "B", "C");

        try {
            listaInmutable.add("D");
        } catch (UnsupportedOperationException e) {
            System.out.println("Excepción capturada: No se puede modificar una lista inmutable.");
        }

        LinkedList<String> listaMutable = new LinkedList<>(listaInmutable);

        listaMutable.add(listaMutable.size() / 2, "Nuevo Elemento");
    }
}