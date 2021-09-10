package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String prize = "";
        while (num >= 5) {
            num -= 4;
        }
        for (int i = 0; i < prizes.length; i++) {
            if (i + 1 == num) {
                prize = prizes[i];
            }
        }
        return prize;
    }

    public static void main(String[] args) {
        String[] prizes = {"car", "ticket", "flat", "house"};
        System.out.println(RandomDream.random(prizes, 10));
    }
}
