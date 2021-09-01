package ru.job4j.array;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        // Считаем кол-во нечетных значений чтобы определить размер нового массива
        int sizeOdd = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                sizeOdd++;
            }
        }
        // Создаю новый массив
        int[] oddArray = new int[sizeOdd];
        int oddIndex = 0;
        // Заполняю новый массив нечетными значениями
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                oddArray[oddIndex] = data[i];
                oddIndex++;
            }
        }
        return oddArray;
    }
}
