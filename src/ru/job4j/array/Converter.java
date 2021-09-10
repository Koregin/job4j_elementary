package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                size++;
            }
        }
        int[] lineArray = new int[size];
        int tempIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (tempIndex < size) {
                    lineArray[tempIndex] = array[i][j];
                    tempIndex++;
                }
            }
        }
        int squaresize = (int) Math.ceil(Math.sqrt(size));
        int[][] squareArray = new int[squaresize][squaresize];
        int index = 0;
        for (int row = 0; row < squareArray.length; row++) {
            for (int cell = 0; cell < squareArray[row].length; cell++) {
                if (index < lineArray.length) {
                    squareArray[row][cell] = lineArray[index];
                    index++;
                } else {
                    squareArray[row][cell] = 0;
                }
            }
        }
        return squareArray;
    }
}
