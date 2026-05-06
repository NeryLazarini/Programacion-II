// ControlCicloVida.java (Cubre Ejercicio 4.1 y 4.2)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */


class TareaIdentidad implements Runnable {
    @Override
    public void run() {
        Thread actual = Thread.currentThread();
        System.out.println("Hilo: " + actual.getName() + " - Prioridad: " + actual.getPriority());
    }
}

class TareaLarga implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Inicio de tarea larga...");
            Thread.sleep(5000);
            System.out.println("Fin de tarea larga.");
        } catch (InterruptedException e) {
            System.out.println("El hilo fue interrumpido mientras dormia.");
        }
    }
}

public class ControlCicloVida {
    public static void main(String[] args) {

        Thread h1 = new Thread(new TareaIdentidad(), "Hilo-Bajo");
        Thread h2 = new Thread(new TareaIdentidad(), "Hilo-Alto");

        h1.setPriority(1);
        h2.setPriority(10);

        h1.start();
        h2.start();

        Thread hLargo = new Thread(new TareaLarga(), "Hilo-Largo");
        hLargo.start();

        try {
            hLargo.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo principal interrumpido");
        }

        Thread hInterrumpido = new Thread(new TareaLarga(), "Hilo-Interrumpible");
        hInterrumpido.start();

        hInterrumpido.interrupt();
    }
}