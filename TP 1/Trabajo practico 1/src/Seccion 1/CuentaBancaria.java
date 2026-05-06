// CuentaBancaria.java (Cubre Ejercicio 1.3)


/**
 * Actividades made in Argentina
 * Nery y Asociados S.A. - 2026
 */


public class CuentaBancaria {

    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo = this.saldo + monto;
        }
    }
}