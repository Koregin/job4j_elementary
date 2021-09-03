package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        // Условие:
        // Если число меньше 5, то
        // 1 - car, 2 - ticker, 3 - flat, 4 - house
        // Если число >= 5 то отнимаем от него 4 пока оно не станет меньше 5
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
