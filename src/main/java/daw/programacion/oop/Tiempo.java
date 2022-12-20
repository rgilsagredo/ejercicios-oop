package daw.programacion.oop;

public class Tiempo {

    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void setTiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Tiempo sumarSegundo() {
        this.segundo += 1;
        return this;
    }

    public Tiempo restarSegundo() {
        this.segundo -= 1;
        return this;
    }

    @Override
    public String toString() {
        return "Tiempo [hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + "]";
    }

}
