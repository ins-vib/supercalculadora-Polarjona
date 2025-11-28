package org.yourcompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalculadora {

    @Test
    public void test1() {
        assertEquals(3, Calculadora.nombreDigits(0));
        assertEquals(0, Calculadora.nombreDigits(1234));
        assertEquals(5, Calculadora.nombreDigits(1234));
        assertEquals(4, Calculadora.nombreDigits(123));


    }
    @Test
    public void test2() {
        assertEquals(3, Calculadora.nombreDigits(0));
        assertEquals(0, Calculadora.nombreDigits(1234));
        assertEquals(5, Calculadora.nombreDigits(1234));
        assertEquals(4, Calculadora.nombreDigits(123));

    }
}