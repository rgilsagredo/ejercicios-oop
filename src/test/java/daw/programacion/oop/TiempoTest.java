package daw.programacion.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiempoTest {

    Tiempo tiempo;

    @BeforeEach
    void crearObjetotiempo() {
        tiempo = new Tiempo(0, 0, 0);
    }

    @AfterEach
    void borrarObjetotiempo() {
        tiempo = null;
    }

    @Test
    void testGetHora() {
        int expected = 0;
        assertEquals(expected, tiempo.getHora());
    }

    @Test
    void testGetMinuto() {
        int expected = 0;
        assertEquals(expected, tiempo.getMinuto());
    }

    @Test
    void testGetSegundo() {
        int expected = 0;
        assertEquals(expected, tiempo.getSegundo());
    }

    @Test
    void siNoHayExcepcionHaceBienElSetSegundo() {

        int sumarSegundo = 45;
        int expected = 45;

        tiempo.setSegundo(sumarSegundo);

        assertEquals(expected, tiempo.getSegundo());

    }

    @Test
    void siSiHayExcepcionEnSegundoMeLaLanza() {

        int sumarSegundo = 77;

        assertThrows(IllegalArgumentException.class,
                () -> {
                    tiempo.setSegundo(sumarSegundo);
                });
    }

    @Test
    void siNoHayExcepcionHaceBienElSetMinuto() {

        int sumarMinuto = 45;
        int expected = 45;

        tiempo.setMinuto(sumarMinuto);

        assertEquals(expected, tiempo.getMinuto());

    }

    @Test
    void siSiHayExcepcionEnMinutoMeLaLanza() {

        int sumarMinuto = 77;

        assertThrows(IllegalArgumentException.class,
                () -> {
                    tiempo.setMinuto(sumarMinuto);
                });
    }

    @Test
    void siNoHayExcepcionHaceBienElSetHora() {

        int sumarHora = 5;
        int expected = 5;

        tiempo.setHora(sumarHora);

        assertEquals(expected, tiempo.getHora());

    }

    @Test
    void siSiHayExcepcionEnHoraMeLaLanza() {

        int sumarHora = 77;

        assertThrows(IllegalArgumentException.class,
                () -> {
                    tiempo.setHora(sumarHora);
                });
    }

    @Test
    void testRestarSegundo() {

    }

    @Test
    void testSetTiempo() {

    }

    @Test
    void testSumarSegundo() {

    }

    @Test
    void testToString() {

    }
}
