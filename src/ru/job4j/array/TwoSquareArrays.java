package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] array = new int[left.length * left.length];
        int index = 0;
        for (int row = 0; row < left.length; row++) {
            for (int cell = 0; cell < left[row].length; cell++) {
                array[index] = left[row][cell] > right[row][cell] ? left[row][cell] : right[row][cell];
                index++;
            }
        }
        return array;
    }
}
