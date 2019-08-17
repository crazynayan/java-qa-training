package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void testInitialNumberIsZero() {
        assertEquals(0, calc.getNumber());
    }

    @Test
    void testPositiveNumber() {
        calc.setNumber(123);
        assertEquals(123, calc.getNumber());
    }

    @Test
    void testNegativeNumber() {
        calc.setNumber(-45);
        assertEquals(-45, calc.getNumber());
    }

    @Test
    void testClearAtStart() {
        calc.clear();
        assertEquals(0, calc.getNumber());
    }

    @Test
    void testClearWithNumber() {
        calc.setNumber(789);
        calc.clear();
        assertEquals(0, calc.getNumber());
    }

}