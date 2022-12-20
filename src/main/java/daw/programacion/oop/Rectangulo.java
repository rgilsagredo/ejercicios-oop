package daw.programacion.oop;

public class Rectangulo {
    private float ancho = 1.0f;
    private float alto = 1.0f;

    public Rectangulo() {
    }

    public Rectangulo(float ancho, float alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public float getAncho() {
        return this.ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return this.alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getArea() {
        return this.alto * this.ancho;
    }

    public float getPerimetro() {
        return 2 * (this.alto + this.ancho);
    }

    @Override
    public String toString() {
        return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
    }

}
