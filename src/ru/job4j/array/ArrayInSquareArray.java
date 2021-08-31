package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        //Определить размер двумерного массива
        // Размер текущего массива должен быть меньше квадрата нового массива
        int size = (int) Math.ceil(Math.sqrt(array.length));
        int[][] squareArray = new int[size][size];
        int index = 0;
        for (int row = 0; row < squareArray.length; row++) {
            for (int cell = 0; cell < squareArray[row].length; cell++) {
                if (index < array.length) {
                    squareArray[row][cell] = array[index];
                    index++;
                } else {
                    squareArray[row][cell] = 0;
                }
            }
        }
        return squareArray;
    }
}
