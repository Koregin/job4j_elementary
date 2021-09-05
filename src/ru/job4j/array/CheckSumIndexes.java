package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] rsl = new int[data.length * data.length];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                } else {
                    rsl[index] = data[i][j];
                    index++;
                }
            }
        }
        return Arrays.copyOf(rsl, index);
    }
}
