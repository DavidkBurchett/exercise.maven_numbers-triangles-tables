package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result = "";
        for (int i=0; i<numberOfRows - 1; i++){
            result += getRow(i+1) + "\n";
        }
        return result;
    }

    public static String getRow(int numberOfStars) {
        String result = "";
        for (int i=0; i<numberOfStars; i++){
            result += ("*");
        }
        return result;
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
