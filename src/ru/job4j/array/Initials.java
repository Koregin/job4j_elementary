package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fio.length; i++) {
            if (i > 0) {
                sb.append(fio[i].charAt(0)).append(".");
            } else {
                sb.append(fio[i]).append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Initials.convert(new String[] {"Иванов", "Иван", "Иваныч"}));
    }
}
