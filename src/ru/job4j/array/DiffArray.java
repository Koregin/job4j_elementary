package ru.job4j.array;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        // 1. Сначала проходим по одному массиву потом по другому
        // Вычисляем размер массива
        int size = 0;
        for (int i = 0; i < left.length; i++) {
            size++;
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    size--;
                }
            }
        }
        int[] newArr = new int[size];
        int index = 0;
        boolean repeat = false;
        // Проход по первому массиву
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    repeat = true;
                }
            }
            if (!repeat) {
                newArr[index] = left[i];
            }
        }
        repeat = false;
        // Проход по второму массиву
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (right[i] == left[j]) {
                    repeat = true;
                }
            }
            if (!repeat) {
                newArr[index] = right[i];
            }
        }
        return newArr;
    }

    /*public static void main(String[] args) {
        System.out.println(DiffArray.diff(new int[] {}, new int[] {}));
        System.out.println(DiffArray.diff(new int[] {1}, new int[] {}));
        System.out.println(DiffArray.diff(new int[] {}, new int[] {1}));
        System.out.println(DiffArray.diff(new int[] {1}, new int[] {}));
        System.out.println(DiffArray.diff(new int[] {1, 2, 3}, new int[] {2}));
        System.out.println(DiffArray.diff(new int[] {1, 3}, new int[] {2}));
    }*/
}
