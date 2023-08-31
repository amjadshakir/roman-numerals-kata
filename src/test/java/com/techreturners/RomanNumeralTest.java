package com.techreturners;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/input-data-for-decimal-to-roman.csv", numLinesToSkip = 1)
    public void convertDecimalToRomanNumeral(int decimalNumber, String expectedRomanNumeral){
        assertEquals(expectedRomanNumeral, RomanNumeral.convertDecimalNumberToRomanNumeral(decimalNumber));
    }

}
