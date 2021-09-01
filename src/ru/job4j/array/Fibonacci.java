package ru.job4j.array;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        int sumFib = 0;
        for (int i = 2; i < data.length; i++) {
            sumFib = data[i - 1] + data[i - 2];
            if (sumFib != data[i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
