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
        System.out.println("La suma es correcta");
    }

    @org.junit.jupiter.api.Test
    void resta() {
        assertEquals(5, calculadora.resta(7,2));
        System.out.println("La resta es correcta");
    }

    @org.junit.jupiter.api.Test
    void multiplicacion() {
        assertEquals(10, calculadora.multiplicacion(5,2));
        System.out.println("La multiplicacion es correcta");
    }

    @org.junit.jupiter.api.Test
    void division() {
        assertEquals(1, calculadora.division(2,2));
        System.out.println("La division es correcta");
    }

    @org.junit.jupiter.api.Test
    void esPar() {
        assertTrue(calculadora.esPar(4));
        System.out.println("El numero es par");
        assertFalse(calculadora.esPar(3));
        System.out.println("El numero no es par");
    }

    @org.junit.jupiter.api.Test
    void maximo() {
        assertEquals(5, calculadora.maximo(1,2,5));
        System.out.println("Es el numero maximo");
    }

    @org.junit.jupiter.api.Test
    void esDivisible() {
        assertTrue(calculadora.esDivisible(10,2));
        System.out.println("Si es divisible");
        assertFalse(calculadora.esDivisible(5,2));
        System.out.println("No es divisible");
    }
}