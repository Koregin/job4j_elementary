package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        int index = 0;
        boolean anomaly = false;
        int indexanomaly = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                anomaly = true;
                if (index == 0) {
                    result[count] = new int[2];
                }
                result[count][index] = i;
                indexanomaly++;
                index++;
                if (i == data.length - 1) {
                    count++;
                }
                continue;
            }
            if (anomaly) {
                index = 0;
                count++;
                anomaly = false;
            }
        }
        if (indexanomaly == 1) {
            result[0][1] = result[0][0];
        }
        return Arrays.copyOf(result, count);
    }
}
