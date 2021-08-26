package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int secCounter = 0;
        while (length >= section) {
            length -= section;
            secCounter++;
        }
        return secCounter;
    }

    public static void main(String[] args) {
        System.out.println(count(3, 2));
        System.out.println(count(4, 2));
    }
}
