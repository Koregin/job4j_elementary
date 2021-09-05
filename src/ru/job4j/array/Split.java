package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 1;
        int index = 0;
        int charCount = 0;
        boolean write = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != c) {
                if (write) {
                    result[index][charCount] = str[i];
                }
                charCount++;
                if (write && charCount == result[index].length) {
                    write = false;
                    index++;
                    charCount = 0;
                    i++;
                }
                if (i == str.length - 1) {
                    i--;
                }
            } else if (str[i] == c || i == str.length - 1) {
                write = true;
                i -= charCount + 1;
                result[index] = new char[charCount];
                charCount = 0;
            }
        }
        return Arrays.copyOf(result, commonCount);
    }
}
