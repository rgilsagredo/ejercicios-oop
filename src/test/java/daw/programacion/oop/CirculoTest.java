package daw.programacion.oop;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CirculoTest {

    Circulo circulo;
    Circulo circulo2;
    final double radio = 3.45;


    @BeforeEach
    void crearObjetoNotas() {
        circulo = new Circulo();
        circulo2 = new Circulo(radio);
    }

    @AfterEach
    void borrarObjetoNotas() {
        circulo = null;
        circulo2 = null;
    }

    @Test
    void areaDeConstructorPorDefectoEsPiCuadrado() {
        double expected = PI;
        double area = circulo.getArea();
        assertEquals(expected, area);
    }

    @Test
    void areaDeConstructorConOtroRadioEstaOK() {
        double expected = PI*pow(radio, 2);
        double area = circulo2.getArea();
        assertEquals(expected, area);
    }

    @Test
    void circunferenciaConstructorPorDefectoEstaOK() {
        double expected = 2*PI;
        double circunferencia = circulo.getCircunferencia();
        assertEquals(expected, circunferencia);
    }

    @Test
    void circunferenciaConstructorOtroRadioEstaOK() {
        double expected = 2*PI*radio;
        double circunferencia = circulo2.getCircunferencia();
        assertEquals(expected, circunferencia);
    }

    @Test
    void radioDeConstructorPorDefectoEstaBien() {
        final double expected  = 1.0;
        double radio = circulo.getRadio();
        assertEquals(expected, radio);
    }

    @Test
    void radioDeConstructorOtroEstaBien() {
        double expected = radio;
        double radio = circulo2.getRadio();
        assertEquals(expected, radio);
    }

    @Test
    void elRadioSeModificaBien() {
        final double nuevoRadio = 4.32;
        circulo.setRadio(nuevoRadio);
        double radio = circulo.getRadio();
        assertEquals(nuevoRadio, radio);
    }

    @Test
    void testToString() {

    }
}
