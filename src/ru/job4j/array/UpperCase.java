package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] upper = new char[string.length];
        for (int index = 0; index < string.length; index++) {
            upper[index] = Character.toUpperCase(string[index]);
        }
        return upper;
    }
}
