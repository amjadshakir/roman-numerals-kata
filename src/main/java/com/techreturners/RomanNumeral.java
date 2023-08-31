package com.techreturners;

public class RomanNumeral {

    public String convertDecimalNumberToRomanNumeral(int decimalNumber) {
       StringBuilder romanNumeral = new StringBuilder();

        for (Numeral numeral: Numeral.values()) {
            while (decimalNumber >=numeral.getDecimalNumber()){
                romanNumeral.append(numeral.getRomanNumeral());
                decimalNumber = decimalNumber - numeral.getDecimalNumber();
            }
        }
       return romanNumeral.toString();
    }


}
