package ru.job4j.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        // Сдвиг вверх
        if (row > 0) {
            for (int iRow = 0; iRow < row; iRow++) {
                array[iRow][column] = array[iRow + 1][column];
            }
        }
        // Сдвиг вниз
        if (row < array.length - 1) {
            for (int iRow = array.length - 1; iRow > row; iRow--) {
                array[iRow][column] = array[iRow - 1][column];
            }
        }
        // Сдвиг влево
        if (column > 0) {
            for (int iCol = 0; iCol < column; iCol++) {
                array[row][iCol] = array[row][iCol + 1];
            }
        }
        // Сдвиг вправо
        if (column < array.length - 1) {
            for (int iCol = array.length - 1; iCol > column; iCol--) {
                array[row][iCol] = array[row][iCol - 1];
            }
        }
        // Запись нуля
        array[row][column] = 0;
    }
}
