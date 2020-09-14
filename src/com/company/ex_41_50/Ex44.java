package com.company.ex_41_50;

public class Ex44 {
    public static void main(String[] args) {
//        Вывести 3 случайных числа от 0 до 100 без повторений.
        int a, b, c;

        while (true) {
            a = (int) (Math.random() * 100 + 1);
            b = (int) (Math.random() * 100 + 1);
            c = (int) (Math.random() * 100 + 1);
            if (a != b && b != c && a != c) break;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
