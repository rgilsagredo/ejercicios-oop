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

    // @Override
    // public String toString() {

    // String[] atributosString = new String[3];
    // int[] atributosInt = { this.hora, this.minuto, this.segundo };

    // int i = 0;
    // for (int atributo : atributosInt) {
    // atributosString[i] = formatearAtributo(atributo);
    // i++;
    // }

    // String horaFormateada = atributosString[0];
    // for(int j = 1; j < atributosString.length; j++){
    // horaFormateada += ":" + atributosString[j];
    // }

    // return horaFormateada;
    // }

    @Override
    public String toString() {

        int[] atributosInt = { this.hora, this.minuto, this.segundo };
        // String[] atributosString = new String[atributosInt.length];

        // int i = 0;

        // for (int atributo : atributosInt) {
        // atributosString[i] = formatearAtributo(atributo);
        // i++;
        // }

        String tiempoFormateado = formatearAtributo(atributosInt[0]);
        for (int i = 1; i < atributosInt.length; i++) {
            tiempoFormateado += ":" + formatearAtributo(atributosInt[i]);
        }

        // String asdf = "";

        // for (int i = 0; i < atributosInt.length; i++) {
        // atributosString[i] = formatearAtributo(atributosInt[i]);
        // if (i == atributosInt.length - 1) {
        // asdf += atributosString[i];
        // } else {
        // asdf += atributosString[i] + ":";
        // }
        // }

        // String tiempoFormateado = atributosString[0];
        // tiempoFormateado += ":" + atributosString[1];
        // tiempoFormateado += ":" + atributosString[2];

        return tiempoFormateado;

    }

    private String formatearAtributo(int atributo) {
        return (atributo < 10) ? "0" + atributo : Integer.toString(atributo);
    }

}
