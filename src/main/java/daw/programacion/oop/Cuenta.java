package daw.programacion.oop;

public class Cuenta {

    private String id;
    private String nombre;
    private double saldo = 0.0;

    public Cuenta(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Cuenta(String id, String nombre, double saldo) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public double meterDinero(double cantidad) {
        this.saldo += cantidad;
        return this.saldo;
    }

    public double sacarDinero(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else {
            System.out.println("No hay saldo suficiente");
        }

        return this.saldo;
    }

    public double transferirACuenta(Cuenta cuenta, double cantidad) {
        if (this.saldo != this.sacarDinero(cantidad)) {
            cuenta.saldo += cantidad;
        } else {
            System.out.println("No se puede hacer la transferencia");
        }

        return this.saldo;
    }

    @Override
    public String toString() {
        return "Cuenta [id=" + id + ", nombre=" + nombre + ", saldo=" + saldo + "]";
    }

}
