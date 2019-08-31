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
    void testInitialReadyToAcceptIsTrue() {
        assertTrue(calc.isReadyToAccept());
    }

    @Test
    void testPositiveNumber() {
        int positiveNumber = 123;
        calc.setNumber(positiveNumber);
        assertEquals(positiveNumber, calc.getNumber());
        assertFalse(calc.isReadyToAccept());
    }

    @Test
    void testNegativeNumber() {
        int negativeNumber = -45;
        calc.setNumber(negativeNumber);
        assertEquals(negativeNumber, calc.getNumber());
        assertFalse(calc.isReadyToAccept());
    }

    @Test
    void testClearAtStart() {
        calc.clear();
        assertEquals(0, calc.getNumber());
        assertTrue(calc.isReadyToAccept());
    }

    @Test
    void testClearWithNumber() {
        int notZero = 789;
        calc.setNumber(notZero);
        calc.clear();
        assertEquals(0, calc.getNumber());
        assertTrue(calc.isReadyToAccept());
    }

    @Test
    void testLargestNumber() {
        int largestNumber = 2147483647;
        calc.setNumber(largestNumber);
        assertEquals(largestNumber, calc.getNumber());
        assertFalse(calc.isReadyToAccept());
    }

    @Test
    void testSmallestNumber() {
        int smallestNumber = -2147483648;
        calc.setNumber(smallestNumber);
        assertEquals(smallestNumber, calc.getNumber());
        assertFalse(calc.isReadyToAccept());
    }

    @Test
    void testMultipleNumberWithClear() {
        int firstNumber = 25;
        calc.setNumber(firstNumber);
        calc.clear();
        int secondNumber = firstNumber + 1;
        calc.setNumber(secondNumber);
        assertEquals(secondNumber, calc.getNumber());
        assertFalse(calc.isReadyToAccept());
    }

    @Test
    void testMultipleNumberWithoutClear() {
        calc.setNumber(25);
        assertThrows(ArithmeticException.class, () -> calc.setNumber(26));
        assertFalse(calc.isReadyToAccept());
    }

}