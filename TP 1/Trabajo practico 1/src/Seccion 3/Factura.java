/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */
public class Factura extends Documento {

    @Override
    public void procesar() {
        System.out.println("Procesando factura...");
    }

    public void procesar(boolean esUrgente) {
        if (esUrgente) {
            System.out.println("Procesando factura de forma urgente...");
        } else {
            System.out.println("Procesando factura de forma regular...");
        }
    }
}