package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        if (len == 0) {
            s = "empty";
        } else if (len > 4) {
            for (int i = 0; i < s.length() - 4; i++) {
                sb.setCharAt(i, '#');
            }
            s = sb.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(code("23123123123213"));
        System.out.println(code("123"));
        System.out.println(code(""));
    }
}
