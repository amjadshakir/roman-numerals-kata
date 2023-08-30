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
    @Test
    public void testSixToEighteen(){
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("VI",romanNumeral.convertDecimalNumberToRomanNumeral(6));
        assertEquals("IX",romanNumeral.convertDecimalNumberToRomanNumeral(9));
        assertEquals("X",romanNumeral.convertDecimalNumberToRomanNumeral(10));
        assertEquals("XLV",romanNumeral.convertDecimalNumberToRomanNumeral(45));
        assertEquals("LVI",romanNumeral.convertDecimalNumberToRomanNumeral(56));
        assertEquals("XCII",romanNumeral.convertDecimalNumberToRomanNumeral(92));
        assertEquals("CXCVII",romanNumeral.convertDecimalNumberToRomanNumeral(197));
        assertEquals("CDLXII",romanNumeral.convertDecimalNumberToRomanNumeral(462));
        assertEquals("DLXXXIII",romanNumeral.convertDecimalNumberToRomanNumeral(583));
        assertEquals("CMXXXV",romanNumeral.convertDecimalNumberToRomanNumeral(935));
        assertEquals("MLVI",romanNumeral.convertDecimalNumberToRomanNumeral(1056));
        assertEquals("MDXCII",romanNumeral.convertDecimalNumberToRomanNumeral(1592));
        assertEquals("MMMCXCVII",romanNumeral.convertDecimalNumberToRomanNumeral(3197));

    }
}
