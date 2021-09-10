package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int indexRight = 0;
        int[] rsl = new int[left.length + right.length];
        int indexRsl = 0;
        for (int i = 0; i < left.length;) {
            if (left[i] > right[indexRight]) {
                rsl[indexRsl] = right[indexRight];
                indexRight++;
                indexRsl++;
            } else {
                rsl[indexRsl] = left[i];
                indexRsl++;
                i++;
            }
        }
        for (int j = indexRight; j < right.length; j++) {
            rsl[indexRsl] = right[j];
            indexRsl++;
        }
        return rsl;
    }
}