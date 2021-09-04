package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int positive = 0;
        int negative = 0;
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                positive++;
            } else if (data[i] < 0) {
                negative++;
            }
        }
        if (negative % 2 != 0) {
            result = true;
        }
        if (positive % 2 == 0) {
            result = false;
        }
        return result;
    }
}
