package es.uji.al396644.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {
    private es.uji.al396644.test.Test miTest;


    @BeforeEach
    void setUp() {
        miTest = new es.uji.al396644.test.Test();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void siempreUno() {
        assertEquals(1, miTest.siempreUno());
    }
}