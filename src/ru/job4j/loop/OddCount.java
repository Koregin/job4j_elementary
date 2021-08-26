package ru.job4j.loop;

public class OddCount {
    public static int count(int a, int b) {
        int odd = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                odd++;
            }
        }
        return odd;
    }

    public static void main(String[] args) {
        System.out.println(count(1, 2));
        System.out.println(count(1, 3));
        System.out.println(count(1, 4));
        System.out.println(count(1, 5));
    }
}
