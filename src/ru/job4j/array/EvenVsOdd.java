package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int one = 0;
        int two = 0;
        int result = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                one += players[i];
            } else {
                two += players[i];
            }
        }
        if (one > two) {
            result = 1;
        } else if (two > one) {
            result = 2;
        }
        return result;
    }
}
