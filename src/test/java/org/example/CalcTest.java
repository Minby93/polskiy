package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {
    String tPlus = "+12";
    String tMinus = "-21";
    String tDiv = "/82";
    String tMultZero = "*02";
    String tMinusMinus = "-12";
    String tDivHalf = "/28";
    String tMult = "*32";

    @Test
    void calcPlus() {
        Calc def = new Calc();
        double actual = def.calculate(tPlus);
        double expected = 3.0;
        assertEquals(actual, expected);
    }
    @Test
    void calcMinus() {
        Calc def = new Calc();
        double actual = def.calculate(tMinus);
        double expected = 1.0;
        assertEquals(actual, expected);
    }
    @Test
    void calcDiv() {
        Calc def = new Calc();
        double actual = def.calculate(tDiv);
        double expected = 4.0;
        assertEquals(actual, expected);
    }
    @Test
    void calcMult() {
        Calc def = new Calc();
        double actual = def.calculate(tMult);
        double expected = 6.0;
        assertEquals(actual, expected);
    }
    @Test
    void calcMinusMinus() {
        Calc def = new Calc();
        double actual = def.calculate(tMinusMinus);
        double expected = -1.0;
        assertEquals(actual, expected);
    }
    @Test
    void calcDivHalf() {
        Calc def = new Calc();
        double actual = def.calculate(tDivHalf);
        double expected = 0.25;
        assertEquals(actual, expected);
    }
    @Test
    void calcMultZero() {
        Calc def = new Calc();
        double actual = def.calculate(tMultZero);
        double expected = 0.0;
        assertEquals(actual, expected);
    }
}