package daw.programacion.oop;

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

    @Override
    public String toString() {
        return "Circulo [radio=" + this.radio + "]";
    }

    

    
}
