package ru.job4j.array;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int temp = 0;
        for (int index = 0; index < data[src].length; index++) {
            temp = data[src][index];
            data[src][index] = data[dst][index];
            data[dst][index] = temp;
        }
    }
}
