package daw.programacion.oop;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circulo {
    private double radio = 1.0;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return pow(this.radio, 2) * PI;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + this.radio + "]";
    }

}
