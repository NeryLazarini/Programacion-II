// GestionColecciones.java (Cubre Ejercicio 3.1 y 3.2)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */
import java.util.*;


public class GestionColecciones {

    public void gestionarHashSet() {
        HashSet<String> ciudades = new HashSet<>();

        ciudades.add("Buenos Aires");
        ciudades.add("San Luis");
        ciudades.add("Rosario");

        ciudades.add("Buenos Aires");

        boolean existeSanLuis = ciudades.contains("San Luis");
        System.out.println(existeSanLuis);

        ciudades.remove("Rosario");
    }

    public void gestionarHashMap() {
        HashMap<String, Integer> inventario = new HashMap<>();

        inventario.put("Manzanas", 50);
        inventario.put("Bananas", 30);
        inventario.put("Naranjas", 20);

        inventario.put("Manzanas", 60);

        int cantidadBananas = inventario.get("Bananas");
        System.out.println(cantidadBananas);

        for (String clave : inventario.keySet()) {
            System.out.println(clave + ": " + inventario.get(clave));
        }
    }
}