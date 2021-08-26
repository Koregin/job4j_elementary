package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int result = a;
        for (int i = 0; i < n - 1; i++) {
            result = result * a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(2, 2));
        System.out.println(calculate(3, 2));
        System.out.println(calculate(3, 1));
        System.out.println(calculate(2, 7));
    }
}
