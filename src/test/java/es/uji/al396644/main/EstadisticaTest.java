package es.uji.al396644.main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadisticaTest {
    private es.uji.al396644.main.Estadistica miTestEstadistica;
    private int[] v1={1,2,3,4}; //1---2.25  //2---0.25  //3--0.25   //4--2.25

    private int[] v2={5,5,5,5};

    private int[] v3={2};

    private int[] v4={};

    @BeforeEach
    void setUp() {
        miTestEstadistica= new es.uji.al396644.main.Estadistica();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void media() {

        assertEquals(2.5,miTestEstadistica.media(v1));
        assertEquals(5,miTestEstadistica.media(v2));
        assertEquals(2,miTestEstadistica.media(v3));
        assertEquals(0,miTestEstadistica.media(v4));


    }

    @Test
    void varianza() {
        assertEquals(1.25, miTestEstadistica.varianza(v1));
        assertEquals(0, miTestEstadistica.varianza(v2));
        assertEquals(0, miTestEstadistica.varianza(v3));
        assertEquals(0, miTestEstadistica.varianza(v4));
    }

    @Test
    void desviacion() {
        assertEquals(1.118, miTestEstadistica.desviacion(v1), 0.001);
        assertEquals(0, miTestEstadistica.desviacion(v2), 0.001);
        assertEquals(0, miTestEstadistica.desviacion(v3), 0.001);
        assertEquals(0, miTestEstadistica.desviacion(v4), 0.001);

    }
}