package ru.job4j.array;

import java.util.Arrays;

public class Split2 {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 1;
        result[0] = new char[counter(str, 0, c)]; // Создаем первый массив
        int size;
        int index = 0;
        int charInd = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                index++;
                i++;
                charInd = 0;
                size = counter(str, i, c); //Получаем размер массива
                result[index] = new char[size]; // Создаем новый массив
            }
            result[index][charInd] = str[i];
            charInd++;
        }
        commonCount = index + 1;
        return Arrays.copyOf(result, commonCount);
    }

    private static int counter(char[] str, int start, char c) {
        int size = 0;
        for (int i = start; i < str.length; i++) {
            if (str[i] == c) {
                break;
            }
            size++;
        }
        return size;
    }
}
