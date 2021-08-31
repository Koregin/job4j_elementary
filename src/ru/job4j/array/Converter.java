package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        // Посчитать кол-во элементов в исходном массиве
        int srcSize = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                srcSize++;
            }
        }
        // Сохранить данные в новый массив
        int[] lineArray = new int[srcSize];
        int tempIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (tempIndex < srcSize) {
                    lineArray[tempIndex] = array[i][j];
                    tempIndex++;
                }
            }
        }
        // Посчитать размер квадратного массива
        int squareSize = (int) Math.ceil(Math.sqrt(srcSize));
        int[][] squareArray = new int[squareSize][squareSize];
        // Переносим данные из линейного массива в квадратный
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
