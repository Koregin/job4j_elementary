package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] array = new int[2 + middle.length / 2 + right.length / 2];
        array[0] = left[0];
        array[array.length - 1] = left[left.length - 1];
        for (int index = 1; index < array.length - 1; index++) {
            if (index % 2 != 0) {
                array[index] = right[index - 1];
            } else {
                array[index] = middle[index - 1];
            }
        }
        return array;
    }
}
