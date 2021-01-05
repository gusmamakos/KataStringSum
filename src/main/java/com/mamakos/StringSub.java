package com.mamakos;

public class StringSub {

    public static String sum(String num1, String num2) {
        return Integer.toString(getInteger(num1) + getInteger(num2));

    }

    private static int getInteger(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException  e) {
            return 0;
        }
    }
}
