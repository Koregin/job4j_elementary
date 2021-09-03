package ru.job4j.array;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int tempSize = left.length + right.length;
        int[] tempArr = new int[tempSize];
        int tempIndex = 0;
        for (int i = 0; i < left.length; i++) {
            tempArr[tempIndex] = left[i];
            tempIndex++;
        }
        for (int i = 0; i < left.length; i++) {
            tempArr[tempIndex] = right[i];
            tempIndex++;
        }


        return newArr;
    }
}
