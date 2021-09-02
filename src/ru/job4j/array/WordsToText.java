package ru.job4j.array;

import java.sql.SQLOutput;

public class WordsToText {
    public static String convert(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(words[i]);
        }
        return sb.toString();
    }
}
