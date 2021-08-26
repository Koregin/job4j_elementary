package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int secsum = 0;
        boolean turn = true;
        for (int i = a; i <= b; i++) {
            if (turn) {
                secsum += i;
                turn = false;
            } else {
                turn = true;
            }
        }
        return secsum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 6));
        System.out.println(sum(1, 5));
    }
}
