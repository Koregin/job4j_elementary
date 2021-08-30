package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index = 0;
        int start = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = start; j < right.length; j++) {
                if (left[i] > right[j]) {
                    rsl[index] = right[j];
                    i--;
                    start = j + 1;
                    break;
                } else {
                    rsl[index] = left[i];
                }
            }
            index++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] result = Merge.merge(
                new int[] {1, 3},
                new int[] {2, 4}
        );

        for (int number: result) {
            System.out.print(number + " ");
        }
    }
}