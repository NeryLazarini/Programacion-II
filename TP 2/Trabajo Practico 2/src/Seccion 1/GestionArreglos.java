// GestionArreglos.java (Cubre Ejercicio 1.1 y 1.2)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */
import java.util.Arrays;

public class GestionArreglos {

    public void gestionarMatriz() {
        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        numeros[2] = 35;

        int ultimoElemento = numeros[numeros.length - 1];
        System.out.println(ultimoElemento);
    }

    public void ordenarYBuscar() {
        String[] nombres = {"Pedro", "Ana", "Carlos", "Nery"};

        Arrays.sort(nombres);

        int posicion = Arrays.binarySearch(nombres, "Carlos");
        System.out.println(posicion);
    }
}