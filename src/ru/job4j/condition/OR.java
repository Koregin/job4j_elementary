package ru.job4j.condition;

import java.sql.SQLOutput;

public class OR {
    public static void main(String[] args) {
        boolean first = true;
        boolean second = true;
        boolean join = first || second;
        System.out.println(join);
    }
}
