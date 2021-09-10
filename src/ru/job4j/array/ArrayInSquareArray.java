package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int size = (int) Math.ceil(Math.sqrt(array.length));
        int[][] squarearr = new int[size][size];
        int index = 0;
        for (int row = 0; row < squarearr.length; row++) {
            for (int cell = 0; cell < squarearr[row].length; cell++) {
                if (index < array.length) {
                    squarearr[row][cell] = array[index];
                    index++;
                } else {
                    squarearr[row][cell] = 0;
                }
            }
        }
        return squarearr;
    }
}
