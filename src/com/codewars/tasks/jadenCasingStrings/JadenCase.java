package com.codewars.tasks.jadenCasingStrings;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) {
            return null;
        }
        String[] splitPhrase = phrase.split(" ");
        for (int i = 0; i < splitPhrase.length; i++) {
            char firstLetter =  splitPhrase[i].charAt(0);
            splitPhrase[i] = splitPhrase[i].replace(firstLetter, Character.toUpperCase(firstLetter));
        }
        return String.join(" ", splitPhrase);
    }
}