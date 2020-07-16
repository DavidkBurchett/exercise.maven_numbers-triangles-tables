package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for (int i=1; i<=tableSize; i++){
            int count = i;
            for (int j=1; j<=tableSize; j++){
                if (count * j <10){
                    result += "  " + count * j + " |";
                } else if(count * j < 100){
                    result += " " + count * j + " |";
                } else {
                    result += count * j + " |";
                }
            }
            result += "\n";
        }
        return result;
    }

}
