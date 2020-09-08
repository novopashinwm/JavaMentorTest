package com.company;

public class CalcStrategy {

    public static final String ARITHMETIC_OPERATION = "(\\+|\\/|\\-|\\*)";

    public static String calc(String expr) {
        if (!Valid(expr)) {
            throw new IllegalArgumentException("Invalid input string " + expr);
        }
        if (isRomanticNumber(expr))
            return calcRoman(expr);
        return calcInt(expr);
    }

    private static boolean isRomanticNumber(String expr) {
        return expr.toUpperCase().contains("I") || expr.contains("V") || expr.contains("X");
    }

    private static String calcRoman(String expr) {
        String[] arr = expr.split(ARITHMETIC_OPERATION);
        int a = RomanNumberConvertor.toInt(arr[0]);
        int b = RomanNumberConvertor.toInt(arr[1]);
        return RomanNumberConvertor.toRoman(calcResult(a,b, expr));
    }

    private static String calcInt(String expr) {
        String[] arr = expr.split(ARITHMETIC_OPERATION);
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        return Integer.toString(calcResult(a,b, expr));
    }

    private static int calcResult(int a, int b, String expr) {
        if (expr.contains("+")) {
            return CalcProcessing.add(a,b);
        }

        if (expr.contains("-")) {
            return CalcProcessing.sub(a,b);
        }

        if (expr.contains("*")) {
            return CalcProcessing.mult(a,b);
        }

        if (expr.contains("/")) {
            return CalcProcessing.div(a,b);
        }
        return 0;
    }
    private static boolean Valid(String expr) {

        if (expr.contains("\n"))
            return false;

        String romanNum = "I|II|III|IV|V|VI|VII|VIII|IX|X";
        if (!(expr.matches("([1][0]|[1-9])(" + ARITHMETIC_OPERATION + ")([1][0]|[1-9])") ||
                expr.matches("(" + romanNum + ")(" + ARITHMETIC_OPERATION +")(" + romanNum + ")")))
            return false;

        return true;
    }
}
