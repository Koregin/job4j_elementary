package ru.job4j.array;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        // Удаление лишних элементов из левого массива
        int delCount = 0;
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (right[i] == left[j]) {
                    left[j] = 0;
                    delCount++;
                }
            }
        }
        int sizeArr = left.length - delCount;
        int[] newArr = new int[sizeArr];
        int index = 0;
        // Сохранение оставшихся элементов в новый массив
        for (int i = 0; i < left.length; i++) {
            if (left[i] != 0) {
                newArr[index] = left[i];
                index++;
            }
        }
        return newArr;
    }
}
