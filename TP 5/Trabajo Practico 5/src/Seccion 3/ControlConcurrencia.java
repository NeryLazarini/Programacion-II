// ControlConcurrencia.java (Cubre Ejercicio 3.1 y 3.2)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */

// Ejercicio 3.1
class ContadorSincronizadoMetodo {
    private int cuenta = 0;

    public synchronized void incrementar() {
        cuenta++;
    }

    public int getCuenta() {
        return cuenta;
    }
}

// Ejercicio 3.2
class ContadorSincronizadoBloque {
    private int cuenta = 0;

    public void incrementar() {
        synchronized (this) {
            cuenta++;
        }
    }

    public int getCuenta() {
        return cuenta;
    }
}

class TareaSincronizadaMetodo implements Runnable {
    private ContadorSincronizadoMetodo contador;

    public TareaSincronizadaMetodo(ContadorSincronizadoMetodo contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            contador.incrementar();
        }
    }
}

class TareaSincronizadaBloque implements Runnable {
    private ContadorSincronizadoBloque contador;

    public TareaSincronizadaBloque(ContadorSincronizadoBloque contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            contador.incrementar();
        }
    }
}

public class ControlConcurrencia {
    public static void main(String[] args) {
        // Ejecucion Ejercicio 3.1
        ContadorSincronizadoMetodo contadorMetodo = new ContadorSincronizadoMetodo();
        Thread hiloMetodo1 = new Thread(new TareaSincronizadaMetodo(contadorMetodo));
        Thread hiloMetodo2 = new Thread(new TareaSincronizadaMetodo(contadorMetodo));

        hiloMetodo1.start();
        hiloMetodo2.start();

        // Ejecucion Ejercicio 3.2
        ContadorSincronizadoBloque contadorBloque = new ContadorSincronizadoBloque();
        Thread hiloBloque1 = new Thread(new TareaSincronizadaBloque(contadorBloque));
        Thread hiloBloque2 = new Thread(new TareaSincronizadaBloque(contadorBloque));

        hiloBloque1.start();
        hiloBloque2.start();

        try {
            hiloMetodo1.join();
            hiloMetodo2.join();
            hiloBloque1.join();
            hiloBloque2.join();
        } catch (InterruptedException e) {
            System.out.println("Error en la espera de los hilos");
        }

        System.out.println("Resultado Ejercicio 3.1: " + contadorMetodo.getCuenta());
        System.out.println("Resultado Ejercicio 3.2: " + contadorBloque.getCuenta());
    }
}