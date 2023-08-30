package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {

    @Test
    public void convertDecimalOneToRomanNumeral(){
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("I",romanNumeral.convertDecimalNumberToRomanNumeral(1));
    }
}
