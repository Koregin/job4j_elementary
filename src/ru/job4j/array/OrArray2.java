package ru.job4j.array;

public class OrArray2 {
    public static int[] or(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    right[j] = 0;
                }
            }
        }
        // Определение размера конечного массива
        int sizeArr = left.length;
        for (int i = 0; i < right.length; i++) {
            if (right[i] != 0) {
                sizeArr++;
            }
        }
        //
        int[] newArr = new int[sizeArr];
        int index = 0;
        for (int i = 0; i < left.length; i++) {
            newArr[index] = left[i];
        }
        for (int i = 0; i < right.length; i++) {
            if (right[i] != 0) {
                newArr[index] = right[i];
            }
        }
        return newArr;
    }
}
