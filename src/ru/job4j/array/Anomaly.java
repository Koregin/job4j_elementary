package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        int index = 0;
        boolean anomaly = false;
        int allIndexAnomaly = 0;
        for (int i = 0; i < data.length; i++) {
            // Проверка на аномальность
            if (data[i] <= down || data[i] >= up) {
                anomaly = true;
                if (index == 0) {
                    result[count] = new int[2];
                }
                result[count][index] = i;
                allIndexAnomaly++;
                index++;
                // Условие для последнего элемента в массиве
                if (i == data.length - 1) {
                    count++;
                }
                continue;
            }
            // Блок выполняется если нет аномальности но она была перед этим
            if (anomaly) {
                index = 0; // Сброс индекса аномальностей в массиве
                count++; // Увеличиваем номер набора аномалий
                anomaly = false;
            }
        }
        if (allIndexAnomaly == 1) {
            //count = 1;
            result[0][1] = result[0][0];
        }
        return Arrays.copyOf(result, count);
    }
}
