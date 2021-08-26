package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String str = Integer.toString(i);
        boolean sym = true;
        int len = str.length();
        for (int j = 0; j < len - j; j++) {
            if (str.charAt(j) != str.charAt(len - 1 - j)) {
                sym = false;
                break;
            }
        }
        return sym;
    }

    public static void main(String[] args) {
        System.out.println(check(123454321));
        System.out.println(check(123456321));
    }
}
