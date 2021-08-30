package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int seq = 1;
        int temp = 0;
        for (int index = 1; index < array.length; index++) {
            if (array[index] >= array[index - 1]) {
                seq++;
            } else {
                temp = seq;
                seq = 1;
            }
        }
        if (seq < temp) {
            seq = temp;
        }
        return seq;
    }
}
