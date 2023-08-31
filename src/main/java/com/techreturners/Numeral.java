package com.techreturners;

public enum Numeral {
    THOUSAND(1000,"M"),
    NINEHUNDRED(900,"CM"),
    FIVEHUNDRED(500,"D"),
    FOURHUNDRED(400,"CD"),
    HUNDRED(100,"C"),
    NINTHY(90,"XC"),
    FIFTY(50,"L"),
    FOURTY(40,"XL"),
    TEN(10,"X"),
    NINE(9,"IX"),
    FIVE(5,"V"),
    FOUR(4,"IV"),
    ONE(1,"I");

    private final int decimalNumber;
    private final String romanNumeral;

    Numeral(int decimalNumber, String romanNumeral){
        this.decimalNumber = decimalNumber;
        this.romanNumeral = romanNumeral;
    }

    public int getDecimalNumber() {
        return decimalNumber;
    }

    public String getRomanNumeral() {
        return romanNumeral;
    }
}
