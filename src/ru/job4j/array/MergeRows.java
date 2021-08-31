package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] array = new int[data.length * data.length];
        int pos = 0;
        for (int row = 0; row < data.length; row++) {
            for (int cell = 0; cell < data[row].length; cell++) {
                array[pos] = data[row][cell];
                pos++;
            }
        }
        return array;
    }
}
