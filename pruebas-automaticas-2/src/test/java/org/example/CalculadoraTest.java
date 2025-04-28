package org.example;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @org.junit.jupiter.api.Test
    void suma() {
        assertEquals(5, calculadora.suma(2,3));
    }

    @org.junit.jupiter.api.Test
    void resta() {
        assertEquals(5, calculadora.resta(7,2));
    }

    @org.junit.jupiter.api.Test
    void multiplicacion() {
        assertEquals(10, calculadora.multiplicacion(5,2));
    }

    @org.junit.jupiter.api.Test
    void division() {
        assertEquals(1, calculadora.division(2,2));
    }

    @org.junit.jupiter.api.Test
    void esPar() {
        assertTrue(calculadora.esPar(4));
        assertFalse(calculadora.esPar(3));
    }

    @org.junit.jupiter.api.Test
    void maximo() {
        assertEquals(5, calculadora.maximo(1,2,5));
    }

    @org.junit.jupiter.api.Test
    void esDivisible() {
        
    }
}