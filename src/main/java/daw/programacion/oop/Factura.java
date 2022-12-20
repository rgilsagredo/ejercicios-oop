package daw.programacion.oop;

public class Factura {

    private String id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public Factura(String id, String descripcion, int cantidad, double precioUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getTotal() {
        return this.precioUnitario * this.cantidad;
    }

    @Override
    public String toString() {
        return "Factura [id=" + id + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", precioUnitario="
                + precioUnitario + "]";
    }

}
