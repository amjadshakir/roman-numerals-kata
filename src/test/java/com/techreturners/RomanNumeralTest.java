package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {

    @Test
    public void convertDecimalOneToRomanNumeral(){
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("I",romanNumeral.convertDecimalNumberToRomanNumeral(1));
    }
    @Test
    public void convertDecimalTwoToRomanNumeral(){
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("II",romanNumeral.convertDecimalNumberToRomanNumeral(2));
    }
    @Test
    public void convertDecimalThreeToRomanNumeral(){
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("III",romanNumeral.convertDecimalNumberToRomanNumeral(3));
    }
    @Test
    public void convertDecimalFourToRomanNumeral(){
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("IV",romanNumeral.convertDecimalNumberToRomanNumeral(4));
    }
    @Test
    public void convertDecimalFiveToRomanNumeral(){
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("V",romanNumeral.convertDecimalNumberToRomanNumeral(5));
    }
}
