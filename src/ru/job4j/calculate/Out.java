package ru.job4j.calculate;

public class Out {
    public static void main(String[] args) {
        String name = "Evgeny";
        byte age = 43;
        String separate = " - ";
        String id = name + separate + age + " years old";
        System.out.println(id);
        int first = 1;
        int second = 2;
        int onePlusTwo = first + second;
        System.out.println("1 + 2 = " + onePlusTwo);
        int i = 2_147_483_600;
        float f = i;
        System.out.println("Вывод в консоль значения после преобразования: " + f);
        int u = 10000;
        byte b = (byte) u;
        short s = (short) u;
        System.out.println(b);
        System.out.println(s);
        double d = 94.984751;
        int i2 = (int) d;
        int i3 = (int) Math.round(d);
        System.out.println("Вывод в консоль значения после преобразования: " + i2);
        System.out.println("Вывод в консоль значения после преобразования: " + i3);
        int i4 = 100;
        char c = (char) i4;
        System.out.println("Вывод в консоль значения после преобразования: " + c);
        char c1 = 45000;
        float i5 = c1;
        System.out.println("i5 " + i5);
        double d2 = 121.19;
        byte b1 = (byte) d2;
        System.out.println("b1 " + b1);
        short s2 = 1500;
        char c2 = (char) s2;
        double d3 = c2;
        System.out.println("d3 " + d3);
    }
}
