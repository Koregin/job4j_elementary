package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        int firstChInWord = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (firstChInWord == 1) {
                sb.append(s.charAt(i));
            }
            firstChInWord++;
            if (s.charAt(i) == ' ') {
                firstChInWord = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(collect("North Atlantic Treaty Organization"));
    }
}
