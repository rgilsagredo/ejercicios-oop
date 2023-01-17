package daw.programacion.oop;

public class Tiempo {

    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo(int hora, int minuto, int segundo) throws IllegalArgumentException {

        checkearInputs(hora, minuto, segundo);

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) throws IllegalArgumentException {
        checkearInputs(hora, 0, 0);
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) throws IllegalArgumentException {
        checkearInputs(0, minuto, 0);
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) throws IllegalArgumentException {
        checkearInputs(0, 0, segundo);
        this.segundo = segundo;

    }

    public void setTiempo(int hora, int minuto, int segundo) throws IllegalArgumentException {

        checkearInputs(hora, minuto, segundo);

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Tiempo sumarSegundo() {

        if (this.segundo == 59 && this.minuto == 59 && this.hora == 23) {
            this.segundo = 0;
            this.minuto = 0;
            this.hora = 0;
        } else if (this.segundo == 59 && this.minuto == 59) {
            this.segundo = 0;
            this.minuto = 0;
            this.hora += 1;
        } else if (this.segundo == 59) {
            this.segundo = 0;
            this.minuto += 1;
        } else {
            this.segundo += 1;
        }

        return this;
    }

    public Tiempo restarSegundo() {

        if (this.segundo == 0 && this.minuto == 0 && this.hora == 0) {
            this.segundo = 59;
            this.minuto = 59;
            this.hora = 23;
        } else if (this.segundo == 0 && this.minuto == 0) {
            this.segundo = 59;
            this.minuto = 59;
            this.hora -= 1;
        } else if (this.segundo == 0) {
            this.segundo = 59;
            this.minuto -= 1;
        } else {
            this.segundo -= 1;
        }

        return this;
    }

    @Override
    public String toString() {

        int[] atributosInt = { this.hora, this.minuto, this.segundo };

        String tiempoFormateado = formatearAtributo(atributosInt[0]);
        for (int i = 1; i < atributosInt.length; i++) {
            tiempoFormateado += ":" + formatearAtributo(atributosInt[i]);
        }

        return tiempoFormateado;

    }

    private String formatearAtributo(int atributo) {
        return (atributo < 10) ? "0" + atributo : Integer.toString(atributo);
    }

    private void checkearInputs(int hora, int minuto, int segundo) throws IllegalArgumentException {
        if (!(minuto >= 0 && minuto <= 59) || !(segundo >= 0 && segundo <= 59) || !(hora >= 0 && hora <= 23)) {
            throw new IllegalArgumentException();
        }
    }

}
