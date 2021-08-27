package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        for (int index = 1; index < array.length / 2; index++) {
            int endindex = array.length - index - 1;
            temp = array[index];
            array[index] = array[endindex];
            array[endindex] = temp;
        }
        return array;
    }
}
