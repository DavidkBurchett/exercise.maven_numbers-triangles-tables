package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        if (start % 2 == 1) {
            for (int i = start; i < stop; i += 2) {
                result += i;
            }
        } else {
            for (int i = start + 1; i < stop; i += 2) {
                result += i;
            }
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
            String result = "";
            if (start % 2 == 0) {
                for (int i = start; i < stop; i += 2) {
                    result += i;
                }
            } else {
                for (int i = start + 1; i < stop; i += 2) {
                    result += i;
                }
            }
            return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";
        for (int i = start; i<stop; i+=step) {
            result += i * i;

        }
        return result;
    }

    public static String getRange(int stop) {
        String result = "";
        for (int i = 0; i < stop; i++) {
            result += i;

        }
        return result;
    }


    public static String getRange(int start, int stop) {
        String result = "";
        for (int i = start; i<stop; i++) {
             result += i;

        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start; i<stop; i+=step) {
            result += i;

        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for (int i = start; i<stop; i+=step) {
            result += (int)Math.pow(i, exponent);

        }
        return result;
    }
}
