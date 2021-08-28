package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int endindex = array.length - index - 1;
            int temp = array[index];
            array[index] = array[endindex];
            array[endindex] = temp;
        }
        return array;
    }
}
