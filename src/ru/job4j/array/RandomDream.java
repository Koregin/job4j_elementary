package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String str = "";
        for (int i = num; i < prizes.length + num; i++) {
            str = prizes[i - num];
        }
        return str;
    }
}
