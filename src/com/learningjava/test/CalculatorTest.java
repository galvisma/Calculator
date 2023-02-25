package com.learningjava.test;

import com.learningjava.Calculator;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void addTest() {
        var calculator = new Calculator();
        assertEquals(17, calculator.add(-23, -3), "*** Addition");
    }

    @Test
    public void subtractTest() {
        var calculator = new Calculator();
        assertEquals(19, calculator.subtract(28, 9), "*** Subtract");
    }

    @Test
    public void multiplyTest() {
        var calculator = new Calculator();
        assertEquals(35, calculator.multiply(7, 5), "*** Multiply");
    }

    @Test
    public void divisionTest() {
        var calculator = new Calculator();
        assertEquals(4, calculator.division(100, 25), "*** Division");
    }
}