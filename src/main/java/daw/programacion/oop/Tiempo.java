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

        String[] atributosString = new String[3];
        int[] atributosInt = { this.hora, this.minuto, this.segundo };

        int i = 0;
        for (int atributo : atributosInt) {
            atributosString[i] = formatearAtributo(atributo);
            i++;
        }

        String horaFormateada = atributosString[0];
        for(int j = 1; j < atributosString.length; j++){
            horaFormateada += ":" + atributosString[j];
        }

        return horaFormateada;
    }

    private String formatearAtributo(int atributo) {
        return (atributo < 10) ? "0" + atributo : Integer.toString(atributo);
    }

}
