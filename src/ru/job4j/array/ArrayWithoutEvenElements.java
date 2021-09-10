package ru.job4j.array;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int odd = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                odd++;
            }
        }
        int[] oddArray = new int[odd];
        int oddIndex = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                oddArray[oddIndex] = data[i];
                oddIndex++;
            }
        }
        return oddArray;
    }
}
