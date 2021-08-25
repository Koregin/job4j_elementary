package ru.job4j.loop;

public class SweetPrice {
    public static void out(int price) {
        for (int index = 1; index <= 5; index++) {
            System.out.println(index * price);
        }
    }
}
