package com.codewars.tasks.yourOrderPlease;

public class Order {
    public static <Sting> String order(String words) {
        if (words.equals(""))
            return words;
        String[] stringArray = words.split(" ");
        String[] result = new String[stringArray.length];
        for (String word : stringArray) {
            for (char symbol : word.toCharArray()) {
                if (Character.isDigit(symbol)) {
                    result[Character.getNumericValue(symbol) - 1] = word;
                }
            }
        }
        return String.join(" ", result);
    }
}


