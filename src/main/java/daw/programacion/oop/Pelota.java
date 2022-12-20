package daw.programacion.oop;

public class Pelota {

    private float x;
    private float y;
    private float radio;
    private float xDelta;
    private float yDelta;

    public Pelota(float x, float y, float radio, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radio = radio;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void mover() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflexionHorizontal() {
        this.xDelta = -this.xDelta;
    }

    public void reflexionVertical() {
        this.yDelta = -this.yDelta;
    }

    @Override
    public String toString() {
        return "Pelota[(" + this.x + "," + this.y + "), velocidad=(" + this.xDelta + "," + this.yDelta + ")]";
    }

}
