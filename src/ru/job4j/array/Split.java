package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        result[0] = new char[counter(str, 0, c)];
        int size;
        int index = 0;
        int charInd = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                index++;
                i++;
                charInd = 0;
                size = counter(str, i, c);
                result[index] = new char[size];
            }
            result[index][charInd] = str[i];
            charInd++;
        }
        return Arrays.copyOf(result, index + 1);
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
