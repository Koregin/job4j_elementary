package ru.job4j.array;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        int temp = 0;
        for (int index = 0; index < data.length; index++) {
            temp = data[index][src];
            data[index][src] = data[index][dst];
            data[index][dst] = temp;
        }
    }
}
