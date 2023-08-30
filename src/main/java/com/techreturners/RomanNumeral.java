package com.techreturners;

public class RomanNumeral {

    public String convertDecimalNumberToRomanNumeral(int decimalNumber) {
       StringBuilder romanNumeral = new StringBuilder();
        if (decimalNumber == 4) {
            return "IV";
        }
       while (decimalNumber >=1){
           romanNumeral.append("I");
           decimalNumber = decimalNumber - 1;
       }
       return romanNumeral.toString();
    }


}
