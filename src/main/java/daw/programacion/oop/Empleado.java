package daw.programacion.oop;

public class Empleado {

    private int id;
    private double salario;
    private String nombre;
    private String apellido;

    public Empleado(int id, double salario, String nombre, String apellido) {
        this.id = id;
        this.salario = salario;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return this.id;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    public double getSueldoAnual() {
        return this.salario * 12;
    }

    public double subirSalario(double porcentaje) {
        this.salario += this.salario * porcentaje;
        return this.salario;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", salario=" + salario + ", nombre=" + nombre + ", apellido=" + apellido + "]";
    }

}
