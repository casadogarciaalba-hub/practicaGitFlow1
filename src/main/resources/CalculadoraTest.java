package edu.casadoGarciaAlba.endes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void suma_debeFuncionar() {
        assertEquals(5, calculadora.sumar(2, 3));
    }
}