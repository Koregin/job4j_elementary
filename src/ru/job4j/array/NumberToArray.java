package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        int size = Integer.toString(number).length();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = number % 10;
            number /= 10;
        }
        return arr;
    }
}
