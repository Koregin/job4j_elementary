package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int attempt = 0;
        int rsl = -1;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                attempt++;
                if (attempt == number) {
                    rsl = i;
                    break;
                }
            }
        }
        return rsl;
    }
}
