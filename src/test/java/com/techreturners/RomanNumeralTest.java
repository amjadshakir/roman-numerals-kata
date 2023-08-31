package com.techreturners;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {
    private  RomanNumeral romanNumeral;
    @BeforeEach
    public void setup(){
        romanNumeral = new RomanNumeral();
    }

    @Test
    public void convertDecimalOneToRomanNumeral(){
        assertEquals("I",romanNumeral.convertDecimalNumberToRomanNumeral(1));
    }
    @Test
    public void convertDecimalTwoToRomanNumeral(){
        assertEquals("II",romanNumeral.convertDecimalNumberToRomanNumeral(2));
    }
    @Test
    public void convertDecimalThreeToRomanNumeral(){
        assertEquals("III",romanNumeral.convertDecimalNumberToRomanNumeral(3));
    }
    @Test
    public void convertDecimalFourToRomanNumeral(){
        assertEquals("IV",romanNumeral.convertDecimalNumberToRomanNumeral(4));
    }
    @Test
    public void convertDecimalFiveToRomanNumeral(){
        assertEquals("V",romanNumeral.convertDecimalNumberToRomanNumeral(5));
    }
    @Test
    public void testSixToEighteen(){
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
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/input-data-for-decimal-to-roman.csv", numLinesToSkip = 1)
    public void inputTestDataFromCsvFile(int decimalNumber, String expectedRomanNumeral){
        assertEquals(expectedRomanNumeral, romanNumeral.convertDecimalNumberToRomanNumeral(decimalNumber));
    }

}
