package com.techreturners;

public class RomanNumeral {

    public String convertDecimalNumberToRomanNumeral(int decimalNumber) {
       StringBuilder romanNumeral = new StringBuilder();
        while (decimalNumber >=1000){
            romanNumeral.append("M");
            decimalNumber = decimalNumber - 1000;
        }
        while (decimalNumber >=900){
            romanNumeral.append("CM");
            decimalNumber = decimalNumber - 900;
        }
        while (decimalNumber >=500){
            romanNumeral.append("D");
            decimalNumber = decimalNumber - 500;
        }
        while (decimalNumber >=400){
            romanNumeral.append("CD");
            decimalNumber = decimalNumber - 400;
        }
       while (decimalNumber >=100){
            romanNumeral.append("C");
            decimalNumber = decimalNumber - 100;
        }
       while (decimalNumber >=90){
            romanNumeral.append("XC");
            decimalNumber = decimalNumber - 90;
        }
        while (decimalNumber >=50){
            romanNumeral.append("L");
            decimalNumber = decimalNumber - 50;
        }
        while (decimalNumber >=40){
            romanNumeral.append("XL");
            decimalNumber = decimalNumber - 40;
        }
        while (decimalNumber >=10){
            romanNumeral.append("X");
            decimalNumber = decimalNumber - 10;
        }
        while (decimalNumber >=9){
            romanNumeral.append("IX");
            decimalNumber = decimalNumber - 9;
        }
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
