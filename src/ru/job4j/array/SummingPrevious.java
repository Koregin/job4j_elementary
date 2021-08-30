package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        int sum = array[0];
        for (int i = 2; i < n; i++) {
            sum += array[i - 1];
            array[i] = sum;
        }
        return array;
    }
}
