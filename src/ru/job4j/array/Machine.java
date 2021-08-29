package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int left = money - price;
        for (int index = 0; index < coins.length; index++) {
            while (left >= coins[index]) {
                left -= coins[index];
                rsl[size] = coins[index];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
