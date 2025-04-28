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
    }

    @org.junit.jupiter.api.Test
    void multiplicacion() {
    }

    @org.junit.jupiter.api.Test
    void division() {
    }

    @org.junit.jupiter.api.Test
    void esPar() {
    }

    @org.junit.jupiter.api.Test
    void maximo() {
    }

    @org.junit.jupiter.api.Test
    void esDivisible() {
    }
}