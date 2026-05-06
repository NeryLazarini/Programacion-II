// GestionSeccion3.java (Cubre Ejercicio 3.1 y 3.2)

/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */

// Ejercicio 3.1
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

class CuentaBancaria {
    private double saldo = 500.0;

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para el retiro.");
        }
        saldo -= monto;
    }
}

// Ejercicio 3.2
class ProductoInvalidoException extends RuntimeException {
    public ProductoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        if (precio <= 0) {
            throw new ProductoInvalidoException("El precio debe ser mayor a cero.");
        }
        this.nombre = nombre;
        this.precio = precio;
    }
}

public class GestionSeccion3 {
    public static void main(String[] args) {
        try {
            CuentaBancaria cuenta = new CuentaBancaria();
            cuenta.retirar(600.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        Producto producto = new Producto("Teclado", -10.0);
    }
}