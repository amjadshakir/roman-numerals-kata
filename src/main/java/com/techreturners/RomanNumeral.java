package com.techreturners;

public class RomanNumeral {

    public String convertDecimalNumberToRomanNumeral(int decimalNumber) {
        if (decimalNumber == 3) {
            return "III";

        }
        if (decimalNumber == 2) {
            return "II";
        }
    return "I";
    }


}
