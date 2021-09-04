package ru.job4j.array;

public class Divider {
    public static boolean check(int num, int[] ints) {
        boolean result = true;
        int test = num;
        for (int i = 0; i < ints.length; i++) {
            test = num;
            while (true) {
                test -= ints[i];
                if (test == 0) {
                    break;
                }
                if (test < 0) {
                    result = false;
                    break;
                }
            }
            if (!result) {
                break;
            }
        }
        return result;
    }
}
