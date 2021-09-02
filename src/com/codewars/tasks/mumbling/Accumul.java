package com.codewars.tasks.mumbling;

public class Accumul {

    public static String accum(String s) {
        String[] result = new String[s.length()];
        int index = 0;
        for (Character symbol : s.toCharArray()) {
            StringBuilder interimString = new StringBuilder();
            for (int i = 0; i <= index; i++) {
                if (i == 0) {
                    interimString.append(symbol.toString().toUpperCase());
                } else {
                    interimString.append(symbol.toString().toLowerCase());
                }
            }
            result[index++] = interimString.toString();
        }
        return String.join("-", result);
    }
}