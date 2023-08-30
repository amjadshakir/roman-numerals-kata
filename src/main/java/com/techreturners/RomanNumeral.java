package com.techreturners;

public class RomanNumeral {

    public String convertDecimalNumberToRomanNumeral(int decimalNumber) {
       StringBuilder romanNumeral = new StringBuilder();
        while (decimalNumber >=5){
            romanNumeral.append("V");
            decimalNumber = decimalNumber - 5;
        }
       while (decimalNumber >=4){
            romanNumeral.append("IV");
            decimalNumber = decimalNumber - 4;
        }
       while (decimalNumber >=1){
           romanNumeral.append("I");
           decimalNumber = decimalNumber - 1;
       }
       return romanNumeral.toString();
    }


}
