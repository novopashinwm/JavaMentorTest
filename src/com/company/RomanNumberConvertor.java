package com.company;

import java.util.TreeMap;

public class RomanNumberConvertor {


    public final static String toRoman(int number) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[number / 1000]
                + hundreds[(number % 1000) / 100]
                + tens[(number % 100) / 10]
                + units[number % 10];
    }

    public final static int toInt(String roman) {
        int[] numbers = { 1000, 500, 100, 50, 10, 5, 1 };

        roman = roman.toUpperCase();
        int i = 0;
        int current = 0;
        int previous = 0;
        int arabic = 0;
        while (i < roman.length()) {
            char letter = roman.charAt(i);
            switch (letter) {
                case ('I'):
                    current = 1;
                    break;
                case ('V'):
                    current = 5;
                    break;
                case ('X'):
                    current = 10;
                    break;
            }

            if (current > previous) {
                arabic += current - (previous * 2);
            } else {
                arabic += current;
            }
            previous = current;

            i ++;

        }
        return arabic;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print( i * j + "="  + RomanNumberConvertor.toRoman( i * j) + " ");
            }
            System.out.println();
        }
    }

}
