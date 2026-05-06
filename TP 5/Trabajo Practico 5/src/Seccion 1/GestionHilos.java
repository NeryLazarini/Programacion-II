// GestionHilos.java (Cubre Ejercicio 1.1 y 1.2)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */

// Ejercicio 1.1
class TareaHilo extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Numero: " + i);
        }
    }
}

// Ejercicio 1.2
class TareaRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " (Runnable) - Numero: " + i);
        }
    }
}

public class GestionHilos {
    public static void main(String[] args) {
        // Ejecucion Ejercicio 1.1
        TareaHilo hilo1 = new TareaHilo();
        TareaHilo hilo2 = new TareaHilo();
        TareaHilo hilo3 = new TareaHilo();

        hilo1.start();
        hilo2.start();
        hilo3.start();

        // Ejecucion Ejercicio 1.2
        TareaRunnable tarea = new TareaRunnable();
        Thread hiloRunnable1 = new Thread(tarea);
        Thread hiloRunnable2 = new Thread(tarea);

        hiloRunnable1.start();
        hiloRunnable2.start();
    }
}