package ru.job4j.loop;

public class BackwardFor {
    public static void out(int m, int n) {
        for (int index = m; index > n; index--) {
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        out(10, 5);
    }
}
