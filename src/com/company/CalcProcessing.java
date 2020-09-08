package com.company;

public class CalcProcessing {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub (int a, int b) {
        return a - b;
    }

    public static int mult (int a, int b) {
        return a * b;
    }

    public static int div (int a, int b) {
        if (b == 0) {
            throw  new ArithmeticException("Not zero division!");
        }
        return a / b;
    }
}
