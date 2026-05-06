// GestionSeccion4.java (Cubre Ejercicio 4.1)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GestionSeccion4 {

    public void leerPersonas() {
        try (BufferedReader br = new BufferedReader(new FileReader("personas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo");
        }
    }
}