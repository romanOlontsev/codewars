package com.codewars.tasks.stringMerge;

public class Kata {
    public static String stringMerge(String s1, String s2, char letter) {
        String firstPath = s1.substring(0, s1.indexOf(letter));
        String secondPath = s2.substring(s2.indexOf(letter));
        return String.join("", firstPath, secondPath);
    }
}