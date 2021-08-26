package ru.job4j.loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int hamming = 0;
        for (int i = 0; i < right.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                hamming++;
            }
        }
        return hamming;
    }

    public static void main(String[] args) {
        System.out.println(checkStrings("2173896", "2233796"));
    }
}
