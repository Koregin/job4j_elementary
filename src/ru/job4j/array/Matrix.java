package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] mult = new int[size][size];
        for (int row = 0; row < mult.length; row++) {
            for (int cell = 0; cell < mult[row].length; cell++) {
                mult[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return mult;
    }
}
