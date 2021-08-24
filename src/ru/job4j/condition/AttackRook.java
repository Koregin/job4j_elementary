package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        /*boolean res = false;
        if (left.substring(0, 1).equals(right.substring(0, 1)) || left.substring(1).equals(right.substring(1))) {
            res = true;
        }*/
        return left.substring(0, 1).equals(right.substring(0, 1)) || left.substring(1).equals(right.substring(1));
    }
}
