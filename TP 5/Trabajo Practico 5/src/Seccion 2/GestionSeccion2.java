// GestionSeccion2.java (Cubre Ejercicio 2.1)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */

class Contador {
    private int cuenta = 0;

    public void incrementar() {
        cuenta++;
    }

    public int getCuenta() {
        return cuenta;
    }
}

class TareaContador implements Runnable {
    private Contador contador;

    public TareaContador(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            contador.incrementar();
        }
    }
}

public class GestionSeccion2 {
    public static void main(String[] args) {
        Contador contadorCompartido = new Contador();

        Thread hilo1 = new Thread(new TareaContador(contadorCompartido));
        Thread hilo2 = new Thread(new TareaContador(contadorCompartido));

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            System.out.println("Error en la espera de los hilos");
        }

        System.out.println("Resultado final obtenido: " + contadorCompartido.getCuenta());
    }
}