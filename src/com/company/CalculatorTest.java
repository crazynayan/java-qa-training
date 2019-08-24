package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

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

    @Test
    void testLargestNumber() {
        calc.setNumber(2147483647);
        assertEquals(2147483647, calc.getNumber());
    }

    @Test
    void testSmallestNumber() {
        calc.setNumber(-2147483648);
        assertEquals(-2147483648, calc.getNumber());
    }

    @Test
    void testMultipleNumberInputWithClear() {
        calc.setNumber(25);
        calc.clear();
        calc.setNumber(56);
        assertEquals(56, calc.getNumber());
    }

    @Test
    void testMultipleNumberWithoutClear() {
        calc.setNumber(25);
        Executable setNumberWith56 = () -> calc.setNumber(56);
        assertThrows(ArithmeticException.class, setNumberWith56);
    }

    @Test
    void testInitialReadyToAcceptIsTrue() {
        assertTrue(calc.isReadyToAccept());
    }

}