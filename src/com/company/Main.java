package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(CalcStrategy.calc("22+33"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(CalcStrategy.calc( "2+10\n"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //add
        System.out.println(CalcStrategy.calc("3+7"));
        System.out.println(CalcStrategy.calc("IX+V"));

        //sub
        System.out.println(CalcStrategy.calc("7-4"));
        System.out.println(CalcStrategy.calc("IX-II"));

        //mult
        System.out.println(CalcStrategy.calc("8*7"));
        System.out.println(CalcStrategy.calc("VI*VII"));

        //div
        System.out.println(CalcStrategy.calc("VII/III"));
        System.out.println(CalcStrategy.calc("VI/II"));
        System.out.println(CalcStrategy.calc("9/4"));
        System.out.println(CalcStrategy.calc("10/5"));
    }
}
