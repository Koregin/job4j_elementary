package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        return left.substring(0, 1).equals(right.substring(0, 1)) || left.substring(1).equals(right.substring(1));
    }
}
